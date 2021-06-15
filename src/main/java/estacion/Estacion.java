package estacion;

import bus.values.BusId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import estacion.events.BusAgregado;
import estacion.events.NombreEstacionActualizado;
import estacion.events.PasajeroAgregadoEstacion;
import estacion.values.EstacionId;
import estacion.values.NombreEstacion;
import pasajero.values.PasajeroId;

import java.util.List;
import java.util.Objects;

public class Estacion extends AggregateEvent<EstacionId> {

    protected NombreEstacion nombreEstacion;
    protected BusId busId;
    protected PasajeroId pasajeroId;

    public Estacion(EstacionId entityId, NombreEstacion nombreEstacion, BusId busId, PasajeroId pasajeroId) {
        super(entityId);
        this.nombreEstacion = nombreEstacion;
        this.busId = busId;
        this.pasajeroId = pasajeroId;
    }

    public Estacion(EstacionId entityId) {
        super(entityId);
        subscribe(new EstacionChange(this));
    }

    public static Estacion from(EstacionId estacionId, List<DomainEvent> events){
        var estacion = new Estacion(estacionId);
        events.forEach(estacion::applyEvent);
        return estacion;
    }

    public void actualizarNombreEstacion(EstacionId entityId, NombreEstacion nombreEstacion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombreEstacion);
        appendChange(new NombreEstacionActualizado(entityId, nombreEstacion)).apply();
    }

    public void agregarPasajero(PasajeroId pasajeroId){
        Objects.requireNonNull(pasajeroId);
        appendChange(new PasajeroAgregadoEstacion(pasajeroId)).apply();
    }

    public void agregarBus(BusId busId){
        Objects.requireNonNull(busId);
        appendChange(new BusAgregado(busId)).apply();
    }

    public NombreEstacion nombreEstacion() {
        return nombreEstacion;
    }

    public BusId busId() {
        return busId;
    }

    public PasajeroId pasajeroId() {
        return pasajeroId;
    }
}

package estacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import estacion.values.EstacionId;
import estacion.values.NombreEstacion;

public class NombreEstacionActualizado extends DomainEvent {

    private final EstacionId estacionId;
    private final NombreEstacion nombreEstacion;

    public NombreEstacionActualizado(EstacionId estacionId, NombreEstacion nombreEstacion) {
        super("sofka.estacion.nombreestacionactualizado");
        this.estacionId = estacionId;
        this.nombreEstacion = nombreEstacion;
    }

    public EstacionId getEstacionId() {
        return estacionId;
    }

    public NombreEstacion getNombreEstacion() {
        return nombreEstacion;
    }
}

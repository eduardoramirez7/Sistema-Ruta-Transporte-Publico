package bus;

import bus.events.*;
import bus.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import pasajero.values.PasajeroId;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Bus extends AggregateEvent<BusId> {

    protected Horario horario;
    protected NumeroAsientos numeroAsientos;
    protected Tarifa tarifa;
    protected Tipo tipo;
    protected Set<Conductor> conductores;
    protected Set<Ruta> rutas;
    protected PasajeroId pasajeroId;

    public Bus(BusId entityId, Horario horario, NumeroAsientos numeroAsientos, Tarifa tarifa, Tipo tipo) {
        super(entityId);
        appendChange(new BusCreado(horario,numeroAsientos,tarifa,tipo)).apply();
    }

    private Bus(BusId entityId){
        super(entityId);
        subscribe(new BusChange(this));
    }

    public static Bus from(BusId busId, List<DomainEvent> events){
        var bus = new Bus(busId);
        events.forEach(bus::applyEvent);
        return bus;
    }

    public void asignarConductor(ConductorId entityId, NombreConductor nombreConductor, LicenciaConducir licenciaConducir){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombreConductor);
        Objects.requireNonNull(licenciaConducir);
        appendChange(new ConductorAsignado(entityId, nombreConductor, licenciaConducir)).apply();
    }

    public void agregarPasajero(PasajeroId pasajeroId){
        Objects.requireNonNull(pasajeroId);
        appendChange(new PasajeroAgregado(pasajeroId)).apply();
    }

    public void asignarRuta(RutaId entityId, PosicionInicial posicionInicial, PosicionFinal posicionFinal){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(posicionInicial);
        Objects.requireNonNull(posicionFinal);
        appendChange(new RutaAsignada(entityId, posicionInicial, posicionFinal)).apply();
    }

    public void actualizarNumeroAsientos(NumeroAsientos numeroAsientos){
        Objects.requireNonNull(numeroAsientos);
        appendChange(new NumeroAsientosActualizado(numeroAsientos)).apply();
    }

    public void actualizarHorario(Horario horario){
        Objects.requireNonNull(horario);
        appendChange(new HorarioActualizado(horario)).apply();
    }

    public void actualizarTarifa(Tarifa tarifa){
        Objects.requireNonNull(tarifa);
        appendChange(new TarifaActualizada(tarifa)).apply();
    }

    public void agregarTipoBus(Tipo tipo){
        Objects.requireNonNull(tipo);
        appendChange(new TipoBusActualizado(tipo)).apply();
    }

    public void cambiarConductor(ConductorId conductorId, NombreConductor nombreConductor){
        Objects.requireNonNull(conductorId);
        Objects.requireNonNull(nombreConductor);
        appendChange(new ConductorCambiado(conductorId, nombreConductor)).apply();
    }

    public void verificarLicenciaConductor(ConductorId conductorId, LicenciaConducir licenciaConducir){
        Objects.requireNonNull(conductorId);
        Objects.requireNonNull(licenciaConducir);
        appendChange(new LicenciaConductorVerificada(conductorId, licenciaConducir)).apply();
    }

    public void actualizarRuta(RutaId entityId, PosicionInicial posicionInicial, PosicionFinal posicionFinal){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(posicionInicial);
        Objects.requireNonNull(posicionFinal);
        appendChange(new RutaActualizada(entityId, posicionInicial, posicionFinal)).apply();
    }

    public void bajarPasajero(PasajeroId pasajeroId){
        Objects.requireNonNull(pasajeroId);
        appendChange(new PasajeroBajado(pasajeroId)).apply();
    }

    protected Optional<Conductor> buscarConductorPorId(ConductorId entityId){
        return conductores().stream().filter(funcion -> funcion.identity().equals(entityId)).findFirst();
    }

    protected Optional<Ruta> buscarRutaPorId(RutaId entityId){
        return rutas().stream().filter(funcion -> funcion.identity().equals(entityId)).findFirst();
    }

    public Horario horario() {
        return horario;
    }

    public NumeroAsientos numeroAsientos() {
        return numeroAsientos;
    }

    public Tarifa tarifa() {
        return tarifa;
    }

    public Tipo tipo() {
        return tipo;
    }

    public Set<Conductor> conductores() {
        return conductores;
    }

    public Set<Ruta> rutas() {
        return rutas;
    }

    public PasajeroId pasajeroId() {
        return pasajeroId;
    }



}

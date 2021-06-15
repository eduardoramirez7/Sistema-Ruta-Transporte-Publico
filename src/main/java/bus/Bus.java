package bus;

import bus.events.*;
import bus.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import pasajero.values.PasajeroId;

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

    public void asignarConductor(ConductorId entityId, NombreConductor nombreConductor, LicenciaConducir licenciaConducir){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombreConductor);
        Objects.requireNonNull(licenciaConducir);
        appendChange(new ConductorAsignado(nombreConductor, licenciaConducir)).apply();
    }

    public void agregarPasajero(PasajeroId pasajeroId){
        Objects.requireNonNull(pasajeroId);
        appendChange(new PasajeroAgregado(pasajeroId)).apply();
    }

    public void asignarRuta(RutaId entityId, PosicionInicial posicionInicial, PosicionFinal posicionFinal){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(posicionInicial);
        Objects.requireNonNull(posicionFinal);
        appendChange(new RutaAsignada(posicionInicial, posicionFinal)).apply();
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

    public void cambiarConductor(ConductorId conductorId){
        Objects.requireNonNull(conductorId);
        appendChange(new ConductorCambiado(conductorId)).apply();
    }

    public void verificarLicenciaConductor(LicenciaConducir licenciaConducir){
        Objects.requireNonNull(licenciaConducir);
        appendChange(new LicenciaConductorVerificada(licenciaConducir)).apply();
    }

    public void actualizarRuta(RutaId entityId, PosicionInicial posicionInicial, PosicionFinal posicionFinal){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(posicionInicial);
        Objects.requireNonNull(posicionFinal);
        appendChange(new RutaActualizada(posicionInicial, posicionFinal)).apply();
    }

    public void bajarPasajero(PasajeroId pasajeroId){
        Objects.requireNonNull(pasajeroId);
        appendChange(new PasajeroBajado(pasajeroId)).apply();
    }

    public void avanzarSiguienteEstacion(){

    }

    public Optional<Conductor> buscarConductorPorId(ConductorId entityId){
        return conductores().stream().filter(funcion -> funcion.identity().equals(entityId)).findFirst();
    }

    public Optional<Conductor> buscarRutaPorId(RutaId entityId){
        return conductores().stream().filter(funcion -> funcion.identity().equals(entityId)).findFirst();
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

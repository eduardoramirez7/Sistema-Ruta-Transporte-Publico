package bus;

import bus.events.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class BusChange extends EventChange {
    public BusChange(Bus bus) {

        apply((BusCreado event)->{
            bus.tipo = event.getTipo();
            bus.numeroAsientos = event.getNumeroAsientos();
            bus.horario = event.getHorario();
            bus.tarifa = event.getTarifa();
            bus.conductores = new HashSet<>();
            bus.rutas = new HashSet<>();
        });

        apply((PasajeroAgregado event)->{
            bus.pasajeroId = event.getPasajeroId();
        });

        apply((ConductorCambiado event)->{
            var funcion = bus.buscarConductorPorId(event.getConductorId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentran conductores para este servicio de Bus"));
            funcion.actualizarNombreConductor(event.getNombreConductor());
        });

        apply((RutaActualizada event)->{
            var funcion = bus.buscarRutaPorId(event.getRutaId())
                    .orElseThrow(()->new IllegalArgumentException("No se encuentran rutas para este servicio de Bus"));
            funcion.actualizarPosicionInicial(event.getPosicionInicial());
            funcion.actualizarPosicionFinal(event.getPosicionFinal());
        });

        apply((TipoBusActualizado event)->{
            bus.tipo = event.getTipo();
        });

        apply((NumeroAsientosActualizado event)->{
            bus.numeroAsientos = event.getNumeroAsientos();
        });

        apply((HorarioActualizado event)-> {
            bus.horario = event.getHorario();
        });

        apply((TarifaActualizada event)-> {
            bus.tarifa = event.getTarifa();
        });

        apply((ConductorAsignado event)->{
            bus.conductores.add(new Conductor(
                    event.getConductorId(),
                    event.getNombreConductor(),
                    event.getLicenciaConducir()
            ));
        });

        apply((RutaAsignada event)->{
            bus.rutas.add(new Ruta(
                    event.getRutaId(),
                    event.getPosicionInicial(),
                    event.getPosicionFinal()
            ));
        });

        apply((LicenciaConductorVerificada event)->{
            var funcion = bus.buscarConductorPorId(event.getConductorId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentran conductores para este servicio de Bus"));
            funcion.renovarLicenciaConducir(event.getLicenciaConducir());
        });

        apply((PasajeroBajado event)->{
            bus.pasajeroId = event.getPasajeroId();
        });

    }
}

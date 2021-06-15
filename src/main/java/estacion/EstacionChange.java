package estacion;

import co.com.sofka.domain.generic.EventChange;
import estacion.events.BusAgregado;
import estacion.events.EstacionCreada;
import estacion.events.NombreEstacionActualizado;
import estacion.events.PasajeroAgregadoEstacion;

public class EstacionChange extends EventChange {
    public EstacionChange(Estacion estacion) {

        apply((EstacionCreada event)->{
            estacion.nombreEstacion = event.getNombreEstacion();
        });

        apply((NombreEstacionActualizado event)->{
            estacion.nombreEstacion = event.getNombreEstacion();
        });

        apply((BusAgregado event)-> {
            estacion.busId = event.getBusId();
        });

        apply((PasajeroAgregadoEstacion event)-> {
            estacion.pasajeroId = event.getPasajeroId();
        });

    }
}

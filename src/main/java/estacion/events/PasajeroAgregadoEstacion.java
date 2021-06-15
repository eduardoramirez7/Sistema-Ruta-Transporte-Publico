package estacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.values.PasajeroId;

public class PasajeroAgregadoEstacion extends DomainEvent {

    private final PasajeroId pasajeroId;

    public PasajeroAgregadoEstacion(PasajeroId pasajeroId) {
        super("sofka.estacion.pasajeroagregadoestacion");
        this.pasajeroId = pasajeroId;
    }

    public PasajeroId getPasajeroId() {
        return pasajeroId;
    }
}

package bus.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.values.PasajeroId;


public class PasajeroAgregado extends DomainEvent {

    private final PasajeroId pasajeroId;

    public PasajeroAgregado(PasajeroId pasajeroId) {
        super("sofka.bus.pasajeroagregado");
        this.pasajeroId = pasajeroId;
    }

    public PasajeroId getPasajeroId() {
        return pasajeroId;
    }
}

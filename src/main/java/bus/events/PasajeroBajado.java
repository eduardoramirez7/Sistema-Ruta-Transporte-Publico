package bus.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.values.PasajeroId;

public class PasajeroBajado extends DomainEvent {

    private final PasajeroId pasajeroId;

    public PasajeroBajado(PasajeroId pasajeroId) {
        super("sofka.bus.pasajerobajado");
        this.pasajeroId = pasajeroId;
    }

    public PasajeroId getPasajeroId() {
        return pasajeroId;
    }
}

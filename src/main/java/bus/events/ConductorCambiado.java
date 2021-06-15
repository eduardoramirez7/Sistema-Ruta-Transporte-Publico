package bus.events;

import bus.values.ConductorId;
import co.com.sofka.domain.generic.DomainEvent;

public class ConductorCambiado extends DomainEvent {

    private final ConductorId conductorId;

    public ConductorCambiado(ConductorId conductorId) {
        super("sofka.bus.conductorcambiado");
        this.conductorId = conductorId;
    }
}

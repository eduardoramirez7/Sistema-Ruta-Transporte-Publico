package estacion.commands;

import bus.values.BusId;
import co.com.sofka.domain.generic.Command;
import estacion.values.EstacionId;

public class AgregarBus implements Command {

    private final EstacionId entityId;
    private final BusId busId;

    public AgregarBus(EstacionId entityId, BusId busId) {
        this.entityId = entityId;
        this.busId = busId;
    }

    public EstacionId getEntityId() {
        return entityId;
    }

    public BusId getBusId() {
        return busId;
    }
}

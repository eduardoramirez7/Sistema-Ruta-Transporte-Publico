package estacion.commands;

import co.com.sofka.domain.generic.Command;
import estacion.values.EstacionId;
import pasajero.values.PasajeroId;

public class AgregarPasajeroEstacion implements Command {

    private final EstacionId entityId;
    private final PasajeroId pasajeroId;

    public AgregarPasajeroEstacion(EstacionId entityId, PasajeroId pasajeroId) {
        this.entityId = entityId;
        this.pasajeroId = pasajeroId;
    }

    public EstacionId getEntityId() {
        return entityId;
    }

    public PasajeroId getPasajeroId() {
        return pasajeroId;
    }
}

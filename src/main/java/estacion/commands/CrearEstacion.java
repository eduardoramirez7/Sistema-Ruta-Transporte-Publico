package estacion.commands;

import co.com.sofka.domain.generic.Command;
import estacion.values.EstacionId;
import estacion.values.NombreEstacion;

public class CrearEstacion implements Command {

    private final EstacionId entityId;
    private final NombreEstacion nombreEstacion;

    public CrearEstacion(EstacionId entityId, NombreEstacion nombreEstacion) {
        this.entityId = entityId;
        this.nombreEstacion = nombreEstacion;
    }

    public EstacionId getEntityId() {
        return entityId;
    }

    public NombreEstacion getNombreEstacion() {
        return nombreEstacion;
    }
}

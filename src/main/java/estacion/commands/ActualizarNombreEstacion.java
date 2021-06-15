package estacion.commands;

import co.com.sofka.domain.generic.Command;
import estacion.values.EstacionId;
import estacion.values.NombreEstacion;

public class ActualizarNombreEstacion implements Command {

    private final EstacionId entityId;
    private final NombreEstacion nombreEstacion;

    public ActualizarNombreEstacion(EstacionId estacionId, NombreEstacion nombreEstacion) {
        this.entityId = estacionId;
        this.nombreEstacion = nombreEstacion;
    }

    public EstacionId getEntityId() {
        return entityId;
    }

    public NombreEstacion getNombreEstacion() {
        return nombreEstacion;
    }
}

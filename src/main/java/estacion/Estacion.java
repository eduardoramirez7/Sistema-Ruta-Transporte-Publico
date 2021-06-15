package estacion;

import co.com.sofka.domain.generic.AggregateEvent;
import estacion.values.EstacionId;
import estacion.values.NombreEstacion;

public class Estacion extends AggregateEvent<EstacionId> {

    public Estacion(EstacionId entityId, NombreEstacion nombreEstacion) {
        super(entityId);
    }
}

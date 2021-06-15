package pasajero;

import co.com.sofka.domain.generic.AggregateEvent;
import pasajero.values.PasajeroId;
import pasajero.values.Saldo;
import pasajero.values.TarjetaId;

public class Pasajero extends AggregateEvent<PasajeroId> {

    public Pasajero(PasajeroId entityId) {
        super(entityId);
    }
}

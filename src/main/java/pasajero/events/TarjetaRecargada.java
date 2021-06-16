package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.ValueObject;
import pasajero.values.Saldo;
import pasajero.values.TarjetaId;

public class TarjetaRecargada extends DomainEvent {

    private final TarjetaId entityId;
    private final Saldo saldo;

    public TarjetaRecargada(TarjetaId entityId, Saldo saldo) {
        super("sofka.pasajero.tarjetarecargada");
        this.entityId = entityId;
        this.saldo = saldo;
    }

    public TarjetaId getTarjetaId() {
        return entityId;
    }

    public Saldo getSaldo() {
        return saldo;
    }
}

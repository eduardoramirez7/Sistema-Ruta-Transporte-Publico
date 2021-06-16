package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.values.Saldo;
import pasajero.values.TarjetaId;

public class PasajeTarjetaPagado extends DomainEvent {

    private final TarjetaId entityId;
    private final Saldo saldo;

    public PasajeTarjetaPagado(TarjetaId entityId, Saldo saldo) {
        super("sofka.pasajero.pasajetarjetapagado");
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

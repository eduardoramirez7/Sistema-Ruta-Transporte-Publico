package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.values.Saldo;
import pasajero.values.TarjetaId;

public class SaldoConsultado extends DomainEvent {

    private final TarjetaId entityId;
    private final Saldo saldo;

    public SaldoConsultado(TarjetaId entityId, Saldo saldo) {
        super("sofka.pasajero.saldoconsultado");
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

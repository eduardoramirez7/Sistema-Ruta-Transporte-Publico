package pasajero;


import co.com.sofka.domain.generic.Entity;
import pasajero.values.Saldo;
import pasajero.values.TarjetaId;

import java.util.Objects;

public class TarjetaInteligente extends Entity<TarjetaId> {

    private Saldo saldo;

    public TarjetaInteligente(TarjetaId entityId, Saldo saldo) {
        super(entityId);
        this.saldo = saldo;
    }
    public void consultarSaldo(Saldo saldo){
        this.saldo = Objects.requireNonNull(saldo);
    }

    public void descontarSaldo(Saldo saldo){
        this.saldo = Objects.requireNonNull(saldo);
    }

    public Saldo saldo() {
        return saldo;
    }
}

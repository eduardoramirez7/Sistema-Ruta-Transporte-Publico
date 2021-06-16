package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import pasajero.values.Saldo;
import pasajero.values.TarjetaId;

public class PagarPasajeTarjeta implements Command {

    private final TarjetaId tarjetaId;
    private final Saldo saldo;

    public PagarPasajeTarjeta(TarjetaId tarjetaId, Saldo saldo) {
        this.tarjetaId = tarjetaId;
        this.saldo = saldo;
    }

    public TarjetaId getTarjetaId() {
        return tarjetaId;
    }

    public Saldo getSaldo() {
        return saldo;
    }
}

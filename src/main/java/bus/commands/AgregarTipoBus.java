package bus.commands;

import bus.values.BusId;
import bus.values.Tipo;
import co.com.sofka.domain.generic.Command;

public class AgregarTipoBus implements Command {

    private final BusId busId;
    private final Tipo tipo;

    public AgregarTipoBus(BusId busId, Tipo tipo) {
        this.busId = busId;
        this.tipo = tipo;
    }

    public BusId getBusId() {
        return busId;
    }

    public Tipo getTipo() {
        return tipo;
    }
}

package bus.commands;

import bus.values.BusId;
import bus.values.NumeroAsientos;
import co.com.sofka.domain.generic.Command;

public class ActualizarNumeroAsientos implements Command {

    private final BusId busId;
    private final NumeroAsientos numeroAsientos;

    public ActualizarNumeroAsientos(BusId busId, NumeroAsientos numeroAsientos) {
        this.busId = busId;
        this.numeroAsientos = numeroAsientos;
    }

    public BusId getBusId() {
        return busId;
    }

    public NumeroAsientos getNumeroAsientos() {
        return numeroAsientos;
    }
}

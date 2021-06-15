package bus.commands;

import bus.values.BusId;
import bus.values.Tarifa;
import co.com.sofka.domain.generic.Command;

public class ActualizarTarifa implements Command {

    private final BusId busId;
    private final Tarifa tarifa;

    public ActualizarTarifa(BusId busId, Tarifa tarifa) {
        this.busId = busId;
        this.tarifa = tarifa;
    }

    public BusId getBusId() {
        return busId;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }
}

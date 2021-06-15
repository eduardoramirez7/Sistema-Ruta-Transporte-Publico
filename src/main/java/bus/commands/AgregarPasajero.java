package bus.commands;

import bus.values.BusId;
import co.com.sofka.domain.generic.Command;
import pasajero.values.PasajeroId;

public class AgregarPasajero implements Command {
    private final BusId busId;
    private final PasajeroId pasajeroId;

    public AgregarPasajero(BusId busId, PasajeroId pasajeroId) {
        this.busId = busId;
        this.pasajeroId = pasajeroId;
    }

    public BusId getBusId() {
        return busId;
    }

    public PasajeroId getPasajeroId() {
        return pasajeroId;
    }
}

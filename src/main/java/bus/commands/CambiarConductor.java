package bus.commands;

import bus.values.BusId;
import bus.values.ConductorId;
import bus.values.NombreConductor;
import co.com.sofka.domain.generic.Command;

public class CambiarConductor implements Command {

    private final BusId busId;
    private final ConductorId conductorId;
    private final NombreConductor nombreConductor;

    public CambiarConductor(BusId busId, ConductorId conductorId, NombreConductor nombreConductor) {
        this.busId = busId;
        this.conductorId = conductorId;
        this.nombreConductor = nombreConductor;
    }

    public BusId getBusId() {
        return busId;
    }

    public ConductorId getConductorId() {
        return conductorId;
    }

    public NombreConductor getNombreConductor() {
        return nombreConductor;
    }
}

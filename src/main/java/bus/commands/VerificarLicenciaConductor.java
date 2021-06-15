package bus.commands;

import bus.values.BusId;
import bus.values.ConductorId;
import bus.values.LicenciaConducir;
import co.com.sofka.domain.generic.Command;

public class VerificarLicenciaConductor implements Command {
    private final BusId busId;
    private final ConductorId conductorId;
    private final LicenciaConducir licenciaConducir;

    public VerificarLicenciaConductor(BusId busId, ConductorId conductorId, LicenciaConducir licenciaConducir) {
        this.busId = busId;
        this.conductorId = conductorId;
        this.licenciaConducir = licenciaConducir;
    }

    public BusId getBusId() {
        return busId;
    }

    public ConductorId getConductorId() {
        return conductorId;
    }

    public LicenciaConducir getLicenciaConducir() {
        return licenciaConducir;
    }
}

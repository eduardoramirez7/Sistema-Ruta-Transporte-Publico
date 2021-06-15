package bus.commands;

import bus.values.ConductorId;
import bus.values.LicenciaConducir;
import bus.values.NombreConductor;
import co.com.sofka.domain.generic.Command;

public class AsignarConductor implements Command {

    private final ConductorId entityId;
    private final NombreConductor nombreConductor;
    private final LicenciaConducir licenciaConducir;

    public AsignarConductor(ConductorId entityId, NombreConductor nombreConductor, LicenciaConducir licenciaConducir) {
        this.entityId = entityId;
        this.nombreConductor = nombreConductor;
        this.licenciaConducir = licenciaConducir;
    }

    public ConductorId getEntityId() {
        return entityId;
    }

    public NombreConductor getNombreConductor() {
        return nombreConductor;
    }

    public LicenciaConducir getLicenciaConducir() {
        return licenciaConducir;
    }
}

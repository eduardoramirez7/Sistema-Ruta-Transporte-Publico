package bus.events;

import bus.values.ConductorId;
import bus.values.LicenciaConducir;
import bus.values.NombreConductor;
import co.com.sofka.domain.generic.DomainEvent;


public class ConductorAsignado extends DomainEvent {

    private final ConductorId entityId;
    private final NombreConductor nombreConductor;
    private final LicenciaConducir licenciaConducir;

    public ConductorAsignado(ConductorId entityId,NombreConductor nombreConductor, LicenciaConducir licenciaConducir) {
        super("sofka.bus.conductorasignado");
        this.entityId = entityId;
        this.nombreConductor = nombreConductor;
        this.licenciaConducir = licenciaConducir;
    }

    public NombreConductor getNombreConductor() {
        return nombreConductor;
    }

    public LicenciaConducir getLicenciaConducir() {
        return licenciaConducir;
    }

    public ConductorId getConductorId() {
        return entityId;
    }
}

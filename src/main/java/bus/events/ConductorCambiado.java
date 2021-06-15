package bus.events;

import bus.values.ConductorId;
import bus.values.NombreConductor;
import co.com.sofka.domain.generic.DomainEvent;

public class ConductorCambiado extends DomainEvent {

    private final ConductorId entityId;
    private final NombreConductor nombreConductor;

    public ConductorCambiado(ConductorId entityId, NombreConductor nombreConductor) {
        super("sofka.bus.conductorcambiado");
        this.entityId = entityId;
        this.nombreConductor = nombreConductor;
    }

    public ConductorId getConductorId() {
        return entityId;
    }

    public NombreConductor getNombreConductor() {
        return nombreConductor;
    }
}

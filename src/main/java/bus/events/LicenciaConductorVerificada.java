package bus.events;

import bus.values.ConductorId;
import bus.values.LicenciaConducir;
import co.com.sofka.domain.generic.DomainEvent;

public class LicenciaConductorVerificada extends DomainEvent {

    private final ConductorId entityId;
    private final LicenciaConducir licenciaConducir;

    public LicenciaConductorVerificada(ConductorId entityId, LicenciaConducir licenciaConducir) {
        super("sofka.bus.licenciaconductorverificada");
        this.entityId = entityId;
        this.licenciaConducir = licenciaConducir;
    }

    public LicenciaConducir getLicenciaConducir() {
        return licenciaConducir;
    }

    public ConductorId getConductorId() {
        return entityId;
    }
}

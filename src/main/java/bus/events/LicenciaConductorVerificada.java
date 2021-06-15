package bus.events;

import bus.values.LicenciaConducir;
import co.com.sofka.domain.generic.DomainEvent;

public class LicenciaConductorVerificada extends DomainEvent {

    private final LicenciaConducir licenciaConducir;

    public LicenciaConductorVerificada(LicenciaConducir licenciaConducir) {
        super("sofka.bus.licenciaconductorverificada");
        this.licenciaConducir = licenciaConducir;
    }

    public LicenciaConducir getLicenciaConducir() {
        return licenciaConducir;
    }
}

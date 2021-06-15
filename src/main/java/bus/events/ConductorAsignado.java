package bus.events;

import bus.values.LicenciaConducir;
import bus.values.NombreConductor;
import co.com.sofka.domain.generic.DomainEvent;


public class ConductorAsignado extends DomainEvent {

    private final NombreConductor nombreConductor;
    private final LicenciaConducir licenciaConducir;

    public ConductorAsignado(NombreConductor nombreConductor, LicenciaConducir licenciaConducir) {
        super("sofka.bus.conductorasignado");
        this.nombreConductor = nombreConductor;
        this.licenciaConducir = licenciaConducir;
    }

    public NombreConductor getNombreConductor() {
        return nombreConductor;
    }

    public LicenciaConducir getLicenciaConducir() {
        return licenciaConducir;
    }
}

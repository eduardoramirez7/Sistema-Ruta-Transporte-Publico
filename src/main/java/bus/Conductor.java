package bus;

import bus.values.ConductorId;
import bus.values.LicenciaConducir;
import bus.values.NombreConductor;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Conductor extends Entity<ConductorId> {

    private NombreConductor nombreConductor;
    private LicenciaConducir licenciaConducir;

    public Conductor(ConductorId entityId, NombreConductor nombreConductor, LicenciaConducir licenciaConducir) {
        super(entityId);
        this.nombreConductor = nombreConductor;
        this.licenciaConducir = licenciaConducir;
    }

    public void actualizarNombreConductor(NombreConductor nombreConductor){
        this.nombreConductor = Objects.requireNonNull(nombreConductor);
    }

    public void renovarLicenciaConducir(LicenciaConducir licenciaConducir){
        this.licenciaConducir = Objects.requireNonNull(licenciaConducir);
    }

    public NombreConductor nombreConductor() {
        return nombreConductor;
    }

    public LicenciaConducir licenciaConducir() {
        return licenciaConducir;
    }
}

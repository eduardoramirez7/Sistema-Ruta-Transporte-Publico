package estacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import estacion.values.NombreEstacion;

public class EstacionCreada extends DomainEvent {

    private final NombreEstacion nombreEstacion;

    public EstacionCreada(NombreEstacion nombreEstacion) {
        super("sofka.estacion.estacioncreada");
        this.nombreEstacion = nombreEstacion;
    }

    public NombreEstacion getNombreEstacion() {
        return nombreEstacion;
    }
}

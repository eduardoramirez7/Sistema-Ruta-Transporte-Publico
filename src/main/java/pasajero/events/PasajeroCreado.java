package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.NombrePasajero;

public class PasajeroCreado extends DomainEvent {

    private final NombrePasajero nombrePasajero;

    public PasajeroCreado(NombrePasajero nombrePasajero) {
        super("sofka.pasajero.pasajerocreado");
        this.nombrePasajero = nombrePasajero;
    }

    public NombrePasajero getNombrePasajero() {
        return nombrePasajero;
    }
}

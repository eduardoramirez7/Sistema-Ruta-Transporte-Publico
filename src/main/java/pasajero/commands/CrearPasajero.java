package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import pasajero.NombrePasajero;

public class CrearPasajero implements Command {
    private final NombrePasajero nombrePasajero;

    public CrearPasajero(NombrePasajero nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }

    public NombrePasajero getNombrePasajero() {
        return nombrePasajero;
    }
}

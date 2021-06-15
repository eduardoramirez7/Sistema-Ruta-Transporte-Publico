package bus.events;

import bus.values.NumeroAsientos;
import co.com.sofka.domain.generic.DomainEvent;

public class NumeroAsientosActualizado extends DomainEvent {

    private  final NumeroAsientos numeroAsientos;

    public NumeroAsientosActualizado(NumeroAsientos numeroAsientos) {
        super("sofka.bus.numeroasientosactualizado");
        this.numeroAsientos = numeroAsientos;
    }

    public NumeroAsientos getNumeroAsientos() {
        return numeroAsientos;
    }
}

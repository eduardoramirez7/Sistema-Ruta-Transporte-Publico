package bus.events;

import bus.values.PosicionFinal;
import bus.values.PosicionInicial;
import co.com.sofka.domain.generic.DomainEvent;

public class RutaActualizada extends DomainEvent {

    private final PosicionFinal posicionFinal;
    private final PosicionInicial posicionInicial;

    public RutaActualizada(PosicionInicial posicionInicial, PosicionFinal posicionFinal) {
        super("sofka.bus.rutaactualizada");
        this.posicionInicial = posicionInicial;
        this.posicionFinal = posicionFinal;
    }

    public PosicionFinal getPosicionFinal() {
        return posicionFinal;
    }

    public PosicionInicial getPosicionInicial() {
        return posicionInicial;
    }
}

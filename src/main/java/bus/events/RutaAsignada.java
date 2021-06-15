package bus.events;

import bus.values.PosicionFinal;
import bus.values.PosicionInicial;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.UUID;

public class RutaAsignada extends DomainEvent {

    private final PosicionInicial posicionInicial;
    private final PosicionFinal posicionFinal;

    public RutaAsignada(PosicionInicial posicionInicial, PosicionFinal posicionFinal) {
        super("sofka.bus.rutaasignada");
        this.posicionInicial = posicionInicial;
        this.posicionFinal = posicionFinal;
    }

    public PosicionInicial getPosicionInicial() {
        return posicionInicial;
    }

    public PosicionFinal getPosicionFinal() {
        return posicionFinal;
    }
}

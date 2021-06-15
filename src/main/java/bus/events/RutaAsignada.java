package bus.events;

import bus.values.PosicionFinal;
import bus.values.PosicionInicial;
import bus.values.RutaId;
import co.com.sofka.domain.generic.DomainEvent;


public class RutaAsignada extends DomainEvent {

    private final RutaId entityId;
    private final PosicionInicial posicionInicial;
    private final PosicionFinal posicionFinal;

    public RutaAsignada(RutaId entityId,PosicionInicial posicionInicial, PosicionFinal posicionFinal) {
        super("sofka.bus.rutaasignada");
        this.entityId = entityId;
        this.posicionInicial = posicionInicial;
        this.posicionFinal = posicionFinal;
    }

    public PosicionInicial getPosicionInicial() {
        return posicionInicial;
    }

    public PosicionFinal getPosicionFinal() {
        return posicionFinal;
    }

    public RutaId getRutaId() {
        return entityId;
    }
}

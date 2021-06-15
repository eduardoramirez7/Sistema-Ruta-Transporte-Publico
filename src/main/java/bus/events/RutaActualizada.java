package bus.events;

import bus.values.PosicionFinal;
import bus.values.PosicionInicial;
import bus.values.RutaId;
import co.com.sofka.domain.generic.DomainEvent;

public class RutaActualizada extends DomainEvent {

    private final RutaId entityId;
    private final PosicionFinal posicionFinal;
    private final PosicionInicial posicionInicial;

    public RutaActualizada(RutaId entityId, PosicionInicial posicionInicial, PosicionFinal posicionFinal) {
        super("sofka.bus.rutaactualizada");
        this.entityId = entityId;
        this.posicionInicial = posicionInicial;
        this.posicionFinal = posicionFinal;
    }

    public PosicionFinal getPosicionFinal() {
        return posicionFinal;
    }

    public PosicionInicial getPosicionInicial() {
        return posicionInicial;
    }

    public RutaId getRutaId() {
        return entityId;
    }
}

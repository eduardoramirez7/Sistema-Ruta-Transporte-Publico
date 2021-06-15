package bus.commands;

import bus.values.BusId;
import bus.values.PosicionFinal;
import bus.values.PosicionInicial;
import bus.values.RutaId;
import co.com.sofka.domain.generic.Command;

public class ActualizarRuta implements Command {

    private final BusId busId;
    private final RutaId entityId;
    private final PosicionInicial posicionInicial;
    private final PosicionFinal posicionFinal;

    public ActualizarRuta(BusId busId, RutaId entityId, PosicionInicial posicionInicial, PosicionFinal posicionFinal) {
        this.busId = busId;
        this.entityId = entityId;
        this.posicionInicial = posicionInicial;
        this.posicionFinal = posicionFinal;
    }

    public BusId getBusId() {
        return busId;
    }

    public RutaId getEntityId() {
        return entityId;
    }

    public PosicionInicial getPosicionInicial() {
        return posicionInicial;
    }

    public PosicionFinal getPosicionFinal() {
        return posicionFinal;
    }
}

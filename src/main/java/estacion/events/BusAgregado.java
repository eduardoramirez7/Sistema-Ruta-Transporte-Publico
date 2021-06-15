package estacion.events;

import bus.values.BusId;
import co.com.sofka.domain.generic.DomainEvent;

public class BusAgregado extends DomainEvent {

    private final BusId busId;

    public BusAgregado(BusId busId) {
        super("sofka.estacion.buscreado");
        this.busId = busId;
    }

    public BusId getBusId() {
        return busId;
    }
}

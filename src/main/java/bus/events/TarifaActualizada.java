package bus.events;

import bus.values.Tarifa;
import co.com.sofka.domain.generic.DomainEvent;

public class TarifaActualizada extends DomainEvent {

    private final Tarifa tarifa;

    public TarifaActualizada(Tarifa tarifa) {
        super("sofka.bus.tarifaactualizada");
        this.tarifa = tarifa;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }
}

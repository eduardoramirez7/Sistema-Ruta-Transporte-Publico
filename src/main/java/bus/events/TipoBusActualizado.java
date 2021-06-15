package bus.events;

import bus.values.Tipo;
import co.com.sofka.domain.generic.DomainEvent;

public class TipoBusActualizado extends DomainEvent {

    private final Tipo tipo;

    public TipoBusActualizado(Tipo tipo) {
        super("sofka.bus.tipobusactualizado");
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }
}

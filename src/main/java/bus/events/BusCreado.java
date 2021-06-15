package bus.events;

import bus.values.Horario;
import bus.values.NumeroAsientos;
import bus.values.Tarifa;
import bus.values.Tipo;
import co.com.sofka.domain.generic.DomainEvent;


public class BusCreado extends DomainEvent {

    private final Horario horario;
    private final NumeroAsientos numeroAsientos;
    private final Tarifa tarifa;
    private final Tipo tipo;

    public BusCreado(Horario horario, NumeroAsientos numeroAsientos, Tarifa tarifa, Tipo tipo) {
        super("sofka.bus.buscreado");
        this.horario = horario;
        this.numeroAsientos = numeroAsientos;
        this.tarifa = tarifa;
        this.tipo = tipo;
    }

    public Horario getHorario() {
        return horario;
    }

    public NumeroAsientos getNumeroAsientos() {
        return numeroAsientos;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public Tipo getTipo() {
        return tipo;
    }
}

package bus.commands;

import bus.values.*;
import co.com.sofka.domain.generic.Command;

public class CrearBus implements Command {

    private final BusId entityId;
    private final Horario horario;
    private final NumeroAsientos numeroAsientos;
    private final Tarifa tarifa;
    private final Tipo tipo;

    public CrearBus(BusId entityId, Horario horario, NumeroAsientos numeroAsientos, Tarifa tarifa, Tipo tipo) {
        this.entityId = entityId;
        this.horario = horario;
        this.numeroAsientos = numeroAsientos;
        this.tarifa = tarifa;
        this.tipo = tipo;
    }

    public BusId getEntityId() {
        return entityId;
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

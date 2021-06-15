package bus.commands;

import bus.values.BusId;
import bus.values.Horario;
import co.com.sofka.domain.generic.Command;

public class ActualizarHorario implements Command {
    private final BusId busId;
    private final Horario horario;

    public ActualizarHorario(BusId busId, Horario horario) {
        this.busId = busId;
        this.horario = horario;
    }

    public BusId getBusId() {
        return busId;
    }

    public Horario getHorario() {
        return horario;
    }
}

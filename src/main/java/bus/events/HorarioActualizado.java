package bus.events;

import bus.values.Horario;
import co.com.sofka.domain.generic.DomainEvent;

public class HorarioActualizado extends DomainEvent {

    private final Horario horario;

    public HorarioActualizado(Horario horario) {
        super("sofka.bus.horarioactualizado");
        this.horario = horario;
    }

    public Horario getHorario() {
        return horario;
    }
}

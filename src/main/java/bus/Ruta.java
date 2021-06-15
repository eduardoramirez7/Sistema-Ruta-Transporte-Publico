package bus;

import bus.values.PosicionFinal;
import bus.values.PosicionInicial;
import bus.values.RutaId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Ruta extends Entity<RutaId> {

    private PosicionInicial posicionInicial;
    private PosicionFinal posicionFinal;

    public Ruta(RutaId entityId, PosicionInicial posicionInicial, PosicionFinal posicionFinal) {
        super(entityId);
        this.posicionInicial = posicionInicial;
        this.posicionFinal = posicionFinal;
    }

    public void actualizarPosicionInicial(PosicionInicial posicionInicial){
        this.posicionInicial = Objects.requireNonNull(posicionInicial);
    }

    public void actualizarPosicionFinal(PosicionFinal posicionFinal){
        this.posicionFinal= Objects.requireNonNull(posicionFinal);
    }

    public PosicionInicial posicionInicial() {
        return posicionInicial;
    }

    public PosicionFinal posicionFinal() {
        return posicionFinal;
    }
}

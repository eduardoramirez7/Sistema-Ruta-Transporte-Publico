package pasajero;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import pasajero.events.PasajeTarjetaPagado;
import pasajero.events.PasajeroCreado;
import pasajero.events.SaldoConsultado;
import pasajero.events.TarjetaRecargada;
import pasajero.values.PasajeroId;
import pasajero.values.Saldo;
import pasajero.values.TarjetaId;

import java.util.List;
import java.util.Objects;

public class Pasajero extends AggregateEvent<PasajeroId> {

    protected TarjetaId tarjetaId;
    protected NombrePasajero nombrePasajero;

    public Pasajero(PasajeroId pasajeroId, NombrePasajero nombrePasajero){
        super(pasajeroId);
        appendChange(new PasajeroCreado(nombrePasajero)).apply();
    }

    private Pasajero(PasajeroId entityId){
        super(entityId);
        subscribe(new PasajeroChange(this));
    }

    public static Pasajero from(PasajeroId pasajeroId, List<DomainEvent> events){
        var pasajero = new Pasajero(pasajeroId);
        events.forEach(pasajero::applyEvent);
        return pasajero;
    }

    public void recargarTarjeta(TarjetaId entityId, Saldo saldo){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(saldo);
        appendChange(new TarjetaRecargada(entityId, saldo)).apply();
    }

    public void pagarPasajeTarjeta(TarjetaId entityId, Saldo saldo){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(saldo);
        appendChange(new PasajeTarjetaPagado(entityId, saldo)).apply();
    }

    public void consultarSaldo(TarjetaId entityId, Saldo saldo){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(saldo);
        appendChange(new SaldoConsultado(entityId, saldo)).apply();
    }

    public TarjetaId getTarjetaId() {
        return tarjetaId;
    }
}

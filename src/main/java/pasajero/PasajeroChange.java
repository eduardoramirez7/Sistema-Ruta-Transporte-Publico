package pasajero;

import co.com.sofka.domain.generic.EventChange;
import pasajero.events.PasajeTarjetaPagado;
import pasajero.events.PasajeroCreado;
import pasajero.events.SaldoConsultado;
import pasajero.events.TarjetaRecargada;

public class PasajeroChange extends EventChange {
    public PasajeroChange(Pasajero pasajero) {
        apply((PasajeroCreado event)-> {
            pasajero.nombrePasajero = event.getNombrePasajero();
        });

        apply((TarjetaRecargada event)-> {
            pasajero.tarjetaId = event.getTarjetaId();
        });

        apply((PasajeTarjetaPagado event)-> {
            pasajero.tarjetaId = event.getTarjetaId();
        });

        apply((SaldoConsultado event)-> {
            pasajero.tarjetaId = event.getTarjetaId();
        });

    }
}

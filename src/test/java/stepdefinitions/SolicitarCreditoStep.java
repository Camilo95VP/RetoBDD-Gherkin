package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class SolicitarCreditoStep {
    @Dado("que el cliente navego hasta la seccion de solicitud de creditos")
    public void queElClienteNavegoHastaLaSeccionDeSolicitudDeCreditos() {
    }

    @Cuando("el cliente suministre la informacion incompleta para credito de libre inversion y presione solicitar")
    public void elClienteSuministreLaInformacionIncompletaParaCreditoDeLibreInversionYPresioneSolicitar() {
    }

    @Entonces("se mostrara advertencia de que falta informacion para solicitar el credito")
    public void seMostraraAdvertenciaDeQueFaltaInformacionParaSolicitarElCredito() {
    }

    @Cuando("el cliente suministre la informacion necesaria para credito de libre inversion y presione solicitar")
    public void elClienteSuministreLaInformacionNecesariaParaCreditoDeLibreInversionYPresioneSolicitar() {
    }

    @Entonces("se mostrara solicitud de credito enviada exitosamente")
    public void seMostraraSolicitudDeCreditoEnviadaExitosamente() {
    }
}

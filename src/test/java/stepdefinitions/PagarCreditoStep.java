package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class PagarCreditoStep {
    @Dado("que el cliente navego hasta el credito que tiene activo con el banco")
    public void queElClienteNavegoHastaElCreditoQueTieneActivoConElBanco() {
    }

    @Cuando("el cliente selecciona la opcion pagar, selecciona pago de cuota y confirma")
    public void elClienteSeleccionaLaOpcionPagarSeleccionaPagoDeCuotaYConfirma() {
    }

    @Entonces("se mostrara el resultado de la transaccion")
    public void seMostraraElResultadoDeLaTransaccion() {
    }

    @Cuando("el cliente selecciona la opcion pagar, selecciona pago total del credito y confirma")
    public void elClienteSeleccionaLaOpcionPagarSeleccionaPagoTotalDelCreditoYConfirma() {
    }
}

package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class InicioDeSesionStep {
    @Dado("que el cliente navego hasta el inicio de sesion de la sucursal virtual")
    public void queElClienteNavegoHastaElInicioDeSesionDeLaSucursalVirtual() {
    }

    @Cuando("el cliente suministra credenciales incorrectas y confirma")
    public void elClienteSuministraCredencialesIncorrectasYConfirma() {
    }

    @Entonces("se mostrara mensaje de error de inicio de sesion fallida")
    public void seMostraraMensajeDeErrorDeInicioDeSesionFallida() {
    }

    @Cuando("el cliente suministra credenciales correctas y confirma")
    public void elClienteSuministraCredencialesCorrectasYConfirma() {
    }

    @Entonces("se ingresara a la sucursal virtual personas de manera exitosa")
    public void seIngresaraALaSucursalVirtualPersonasDeManeraExitosa() {
    }
}

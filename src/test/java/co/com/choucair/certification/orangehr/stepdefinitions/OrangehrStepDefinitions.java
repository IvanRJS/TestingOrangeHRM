package co.com.choucair.certification.orangehr.stepdefinitions;

import co.com.choucair.certification.orangehr.models.DataModel;
import co.com.choucair.certification.orangehr.questions.TextoSalida;
import co.com.choucair.certification.orangehr.tasks.Abrir;
import co.com.choucair.certification.orangehr.tasks.LlenarDatos;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;


public class OrangehrStepDefinitions {
    @Before
    public void configuracionInicial() { setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) quiere ingresar al sitio de orangehr$")
    public void queIvanQuiereIngresarAlSitioDeOrangehr(String ivan)  {
        theActorCalled(ivan).wasAbleTo(Abrir.laPaginaDeOrangehr());
    }

    @Cuando("^el realiza el ingreso del registro en la aplicacion$")
    public void elRealizaElIngresoDelRegistroEnLaAplicacion(List<DataModel> dataSet)  {
        theActorInTheSpotlight().attemptsTo(LlenarDatos.deRegistroDeNuevoEmpleado(dataSet));
    }

    @Entonces("^el visualiza el nuevo empleado en el aplicativo$")
    public void elVisualizaElNuevoEmpleadoEnElAplicativo(List<DataModel> dataSet) {
        theActorInTheSpotlight().should(seeThat(TextoSalida.es(dataSet)));
    }
}

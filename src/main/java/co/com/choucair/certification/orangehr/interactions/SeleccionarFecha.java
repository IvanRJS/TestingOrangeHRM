package co.com.choucair.certification.orangehr.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

import static co.com.choucair.certification.orangehr.userinterfaces.OrangehrPage.OPCIONES_YEAR_OF_BIRTH;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SeleccionarFecha implements Interaction {
    private String date_of_birth;
    private Target inputDay;
    private Target inputMonth;
    private Target inputYear;

    public SeleccionarFecha(String date_of_birth, Target inputDay, Target inputMonth, Target inputYear) {
        this.date_of_birth = date_of_birth;
        this.inputDay = inputDay;
        this.inputMonth = inputMonth;
        this.inputYear = inputYear;
    }

    public static SeleccionarFecha desde(String date_of_birth, Target inputDay,Target inputMonth,Target inputYear, String separador) {
    return instrumented(SeleccionarFecha.class,date_of_birth,inputDay,inputMonth,inputYear,separador);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        selectYear(actor);
    }

    private <T extends Actor> void selectYear(T actor) {
        actor.attemptsTo(Click.on(inputYear));
        List<WebElementFacade> listOpciones= OPCIONES_YEAR_OF_BIRTH.resolveAllFor(actor);
        for (WebElementFacade opcion : listOpciones) {
            if (opcion.getText().trim().equals(opcion)){
                actor.attemptsTo(Click.on(opcion));
                break;
            }
        }
    }
}

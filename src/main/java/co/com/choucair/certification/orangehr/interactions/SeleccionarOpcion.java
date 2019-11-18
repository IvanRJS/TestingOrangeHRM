package co.com.choucair.certification.orangehr.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcion implements Interaction {

    private Target opciones;
    private String dato;


    public SeleccionarOpcion(String dato,Target opciones) {
        this.dato = dato;
        this.opciones = opciones;
    }

    public static SeleccionarOpcion desde(String dato, Target opciones) {
        return instrumented(SeleccionarOpcion.class,dato,opciones);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade>listOpciones= opciones.resolveAllFor(actor);
        for (WebElementFacade opcion : listOpciones) {
            if (opcion.getText().trim().equals(dato)){
                actor.attemptsTo(Click.on(opcion));
                break;
            }
        }

    }
}

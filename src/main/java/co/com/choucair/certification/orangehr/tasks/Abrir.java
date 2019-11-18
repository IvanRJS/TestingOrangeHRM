package co.com.choucair.certification.orangehr.tasks;

import co.com.choucair.certification.orangehr.userinterfaces.OrangehrLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {


    private OrangehrLoginPage orangehrLoginPage;

    public static Abrir laPaginaDeOrangehr() { return Tasks.instrumented(Abrir.class);    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(orangehrLoginPage));
    }
}

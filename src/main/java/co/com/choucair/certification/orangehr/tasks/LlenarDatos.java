package co.com.choucair.certification.orangehr.tasks;

import co.com.choucair.certification.orangehr.interactions.SeleccionarOpcion;
import co.com.choucair.certification.orangehr.models.DataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.choucair.certification.orangehr.userinterfaces.OrangehrPage.*;
import static co.com.choucair.certification.orangehr.utils.Constantes.CERO;

public class LlenarDatos implements Task {

    private List<DataModel> dataSet;
    public LlenarDatos(List<DataModel> dataSet) {
        this.dataSet = dataSet;
    }

    public static LlenarDatos deRegistroDeNuevoEmpleado(List<DataModel> dataSet) {
        return Tasks.instrumented(LlenarDatos.class,dataSet);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BOTON_LOGIN),
                Click.on(BOTON_PIM),
                Click.on(BOTON_ADD_EMPLOYEE),
                Click.on(LABEL_FIRST_NAME),
                Enter.theValue(dataSet.get(CERO).getFirst_name()).into(TEXTO_FIRST_NAME),
                Click.on(LABEL_MIDDLE_NAME),
                Enter.theValue(dataSet.get(CERO).getMiddle_name()).into(TEXTO_MIDDLE_NAME),
                Click.on(LABEL_LAST_NAME),
                Enter.theValue(dataSet.get(CERO).getLast_name()).into(TEXTO_LAST_NAME),
                Click.on(SELECT_LOCATION),
                SeleccionarOpcion.desde(dataSet.get(CERO).getLocation(),OPCIONES_LOCATION),
                Click.on(BOTON_NEXT),
                Click.on(LABEL_OTHER_ID),
                Enter.theValue(dataSet.get(CERO).getOther_id()).into(TEXTO_OTHER_ID),
                Click.on(LABEL_DATE_OF_BIRTH),
                Enter.theValue(dataSet.get(CERO).getDate_of_birth()).into(TEXTO_DATE_OF_BIRTH),
                Click.on(SELECT_MARITAL_STATUS),
                SeleccionarOpcion.desde(dataSet.get(CERO).getMarital_status(),OPCIONES_MARITAL_STATUS),
                Check.whether(dataSet.get(CERO).getGender().equals(Text.of(RADIO_FEMALE)))
                        .andIfSo(Click.on(RADIO_FEMALE))
                        .otherwise(Click.on(RADIO_MALE)),
                Click.on(SELECT_NACIONALITY),
                SeleccionarOpcion.desde(dataSet.get(CERO).getNacionality(),OPCIONES_NACIONALITY),
                Click.on(LABEL_DRIVER_LICENSE),
                Enter.theValue(dataSet.get(CERO).getDriver_license()).into(TEXTO_DRIVER_LICENSE),
                Click.on(LABEL_LICENSE_EXPIRY),
                Enter.theValue(dataSet.get(CERO).getLicense_expiry()).into(TEXTO_LICENSE_EXPIRY),
                Click.on(LABEL_NICK_NAME),
                Enter.theValue(dataSet.get(CERO).getNick_name()).into(TEXTO_NICK_NAME),
                Click.on(LABEL_MILITARY_SERVICE),
                Enter.theValue(dataSet.get(CERO).getMilitary_service()).into(TEXTO_MILITARY_SERVICE),
                Check.whether(dataSet.get(CERO).getSmoker().equals("Smoker"))
                        .andIfSo(Click.on(LABEL_SMOKER)),
                Click.on(SELECT_BLOOD_GROUP),
                SeleccionarOpcion.desde(dataSet.get(CERO).getBlood_group(),OPCIONES_BLOOD_GROUP),
                Click.on(LABEL_HOBBIES),
                Enter.theValue(dataSet.get(CERO).getHobbies()).into(TEXTO_HOBBIES),
                Click.on(BOTON_NEXT_FORM),
                this::waitLoad,
                Scroll.to(SELECT_REGION),
                Click.on(SELECT_REGION),
                SeleccionarOpcion.desde(dataSet.get(CERO).getRegion(),OPCIONES_REGION),
                Click.on(SELECT_FTE),
                SeleccionarOpcion.desde(dataSet.get(CERO).getFte(),OPCIONES_FTE),
                Click.on(SELECT_TEMPORARY_DEPARTMENT),
                SeleccionarOpcion.desde(dataSet.get(CERO).getTemporary_region(),OPCIONES_TEMPORARY_DEPARTMENT),
                Click.on(BOTON_SAVE),
                this::waitLoad,
                Scroll.to(BOTON_PIM),
                Click.on(BOTON_EMPLOYEE_LIST),
                Click.on(TEXTO_EMPLOYEE_FILTER),
                Enter.theValue(dataSet.get(CERO).getFirst_name()+" "+dataSet.get(CERO).getMiddle_name()+" "+dataSet.get(CERO).getLast_name()).into(TEXTO_EMPLOYEE_FILTER),
                Click.on(BOTON_QUICK_SEARCH)
                );
    }

    private <T extends Actor> void waitLoad(T t) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

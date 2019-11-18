package co.com.choucair.certification.orangehr.questions;

import co.com.choucair.certification.orangehr.models.DataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.choucair.certification.orangehr.userinterfaces.OrangehrPage.TABLA_EMPLOYEE_LIST;
import static java.lang.Thread.sleep;

public class TextoSalida implements Question<Boolean> {

    private List<DataModel> dataSet;

    public TextoSalida(List<DataModel> dataSet) {
        this.dataSet = dataSet;
    }

    public  static TextoSalida es(List<DataModel> dataSet){
        return new TextoSalida(dataSet);
    }
    @Override
    public Boolean answeredBy(Actor actor) {

        String resultado = Text.of(TABLA_EMPLOYEE_LIST).viewedBy(actor).asString();
        return dataSet.get(0).getSalida().equals(resultado);
    }

}

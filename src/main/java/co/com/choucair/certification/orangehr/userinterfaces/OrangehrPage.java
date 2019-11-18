package co.com.choucair.certification.orangehr.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrangehrPage extends PageObject {

    //region elementos Login
    public static final Target BOTON_LOGIN = Target.the("boton lateral PIM").located(By.id("btnLogin"));
    //endregion
    //region elementos barra lateral
    public static final Target BOTON_PIM = Target.the("boton lateral PIM").located(By.id("menu_pim_viewPimModule"));
    public static final Target BOTON_ADD_EMPLOYEE = Target.the("boton lateral para agregar nuevo empleado").located(By.id("menu_pim_addEmployee"));
    public static final Target BOTON_EMPLOYEE_LIST = Target.the("boton lateral para ver la lista de empleados").located(By.id("menu_pim_viewEmployeeList"));
    //endregion
    //region elementos datos básicos-> modal
    public static final Target LABEL_FIRST_NAME = Target.the("etiqueta para el campo de primer nombre").located(By.xpath("//label[contains(text(),'First Name')]"));
    public static final Target LABEL_LAST_NAME = Target.the("etiqueta para el campo de apellido").located(By.xpath("//label[contains(text(),'Last Name')]"));
    public static final Target LABEL_MIDDLE_NAME = Target.the("etiqueta para el campo de segundo nombre").located(By.xpath("//label[contains(text(),'Middle Name')]"));
    public static final Target TEXTO_FIRST_NAME = Target.the("area para ingresar el primer nombre").located(By.id("firstName"));
    public static final Target TEXTO_MIDDLE_NAME = Target.the("area para ingresar el segundo nombre").located(By.id("middleName"));
    public static final Target TEXTO_LAST_NAME = Target.the("area para ingresar el apellido").located(By.id("lastName"));
    public static final Target SELECT_LOCATION = Target.the("select para desplegar las opciones de localizacion").located(By.xpath("//div[@class='select-wrapper initialized']//input[@class='select-dropdown']"));
    public static final Target OPCIONES_LOCATION = Target.the("select para desplegar las opciones de localizacion").located(By.xpath("//div[@id='addEmployeeModal']//li//span"));
    public static final Target BOTON_NEXT = Target.the("boton para guardar los datos en el modal de agregar empleado").located(By.id("systemUserSaveBtn"));
    //endregion
    //region elementos formulario datos completos
    public static final Target LABEL_OTHER_ID = Target.the("etiqueta para el campo otro id").located(By.xpath("//label[contains(text(),'Other Id')]"));
    public static final Target TEXTO_OTHER_ID = Target.the("area para ingresar otro id").located(By.id("otherId"));
    public static final Target LABEL_DATE_OF_BIRTH = Target.the("etiqueta para el campo fecha de nacimiento").located(By.xpath("//label[contains(text(),'Date of Birth')]"));
    public static final Target TEXTO_DATE_OF_BIRTH = Target.the("area para ingresar La fecha de nacimiento").located(By.id("emp_birthday"));
    public static final Target TABLA_DAY_OF_BIRTH = Target.the("tabla para escoger el dia de nacimiento").located(By.xpath("//table[@id='P1690321196_table']//div[starts-with(@class,'picker__day picker__day--infocus')]"));
    public static final Target TABLA_MONTH_OF_BIRTH = Target.the("select para escoger el mes de nacimiento").located(By.xpath("//div[@class='select-wrapper picker__select--month']//input[@class='select-dropdown']"));
    public static final Target TABLA_YEAR_OF_BIRTH = Target.the("select para escoger el año de nacimiento").located(By.xpath("//div[@class='select-wrapper picker__select--year']//input[@class='select-dropdown']"));
    public static final Target OPCIONES_YEAR_OF_BIRTH = Target.the("select para escoger el año de nacimiento").located(By.xpath("//ul[@id='select-options-3462fc09-be04-f0a0-c2e3-0385a4a1a760']//li//span"));
    public static final Target BOTON_DATE_OF_BIRTH = Target.the("boton para desplegar la tabla para escoger fecha de nacimiento").located(By.xpath("//sf-decorator[1]//div[1]//span[1]//span[1]//i[1]"));
    public static final Target SELECT_MARITAL_STATUS = Target.the("select para desplegar las opciones de estado marital").located(By.xpath("//div[@id='emp_marital_status_inputfileddiv']//div[@class='select-wrapper initialized']"));
    public static final Target OPCIONES_MARITAL_STATUS = Target.the("opciones para escoger el estado marital").located(By.xpath("//div[@id='emp_marital_status_inputfileddiv']//li"));
    public static final Target RADIO_MALE = Target.the("etiqueta para seleccionar genero masculino").located(By.xpath("//label[contains(text(),'Male')]"));
    public static final Target RADIO_FEMALE = Target.the("etiqueta para seleccionar genero femenino").located(By.xpath("//label[contains(text(),'Female')]"));
    public static final Target SELECT_NACIONALITY = Target.the("select para desplegar la opciones de nacionalidad").located(By.xpath("//div[@id='nation_code_inputfileddiv']//input[@class='select-dropdown']"));
    public static final Target OPCIONES_NACIONALITY = Target.the("opciones para escoger la nacionalidad").located(By.xpath("//div[@id='nation_code_inputfileddiv']//li"));
    public static final Target LABEL_DRIVER_LICENSE = Target.the("etiqueta para seleccionar licencia de conduccion").located(By.xpath("//label[contains(text(),\"Driver's License Number\")]"));
    public static final Target TEXTO_DRIVER_LICENSE = Target.the("area para ingresar el numero de licencia de conduccion").located(By.id("licenseNo"));
    public static final Target LABEL_LICENSE_EXPIRY = Target.the("etiqueta para seleccionar fecha de vencimiento de la licencia de conduccion").located(By.xpath("//label[contains(text(),\"Driver's License Number\")]"));
    public static final Target TEXTO_LICENSE_EXPIRY = Target.the("area para ingresar la fecha de vencimiento de la licencia de conduccion").located(By.id("emp_dri_lice_exp_date"));
    public static final Target LABEL_NICK_NAME = Target.the("etiqueta para seleccionar el nick name").located(By.xpath("//label[contains(text(),'Nick Name')]"));
    public static final Target TEXTO_NICK_NAME = Target.the("area para ingresar el nick name").located(By.id("nickName"));
    public static final Target LABEL_MILITARY_SERVICE = Target.the("etiqueta para seleccionar servicio militar").located(By.xpath("//label[contains(text(),'Military Service')]"));
    public static final Target TEXTO_MILITARY_SERVICE = Target.the("area para ingresar informacion de servicio militar").located(By.id("militaryService"));
    public static final Target LABEL_SMOKER = Target.the("etiqueta para seleccionar si es fumador").located(By.xpath("//label[contains(text(),'Smoker')]"));
    public static final Target SELECT_BLOOD_GROUP = Target.the("select para desplegar las opciones de grupo sanguineo").located(By.xpath("//div[@id='1_inputfileddiv']//input[@class='select-dropdown']"));
    public static final Target OPCIONES_BLOOD_GROUP = Target.the("opciones para seleccionar de grupo sanguineo").located(By.xpath("//body//custom-fields-panel//li"));
    public static final Target LABEL_HOBBIES = Target.the("etiqueta para escribir los hobbies").located(By.xpath("//label[contains(text(),'Hobbies')]"));
    public static final Target TEXTO_HOBBIES = Target.the("area para ingresar los hobbies").located(By.id("5"));
    public static final Target BOTON_NEXT_FORM = Target.the("boton para avanzar a la parte 2 del formulario").located(By.xpath("//button[@class='btn waves-effect waves-light right']"));

    public static final Target SELECT_REGION = Target.the("select para desplegar las opciones de la region").located(By.xpath("//div[@id='9_inputfileddiv']//input[@class='select-dropdown']"));
    public static final Target OPCIONES_REGION = Target.the("opciones para seleccionar region").located(By.xpath("//div[@id='9_inputfileddiv']//li"));
    public static final Target SELECT_FTE = Target.the("select para desplegar las opciones de FTE").located(By.xpath("//div[@id='10_inputfileddiv']//input[@class='select-dropdown']"));
    public static final Target OPCIONES_FTE = Target.the("opciones para seleccionar FTE").located(By.xpath("//div[@id='10_inputfileddiv']//li"));
    public static final Target SELECT_TEMPORARY_DEPARTMENT = Target.the("select para desplegar las opciones de temporary department").located(By.xpath("//div[@id='11_inputfileddiv']//input[@class='select-dropdown']"));
    public static final Target OPCIONES_TEMPORARY_DEPARTMENT = Target.the("opciones para seleccionar FTE").located(By.xpath("//div[@id='11_inputfileddiv']//li"));
    public static final Target BOTON_SAVE = Target.the("boton para guardar datos del formulario").located(By.xpath("//button[@class='btn waves-effect waves-light right']"));
    public static final Target TEXTO_EMPLOYEE_FILTER = Target.the("area para buscar datos de empleado").located(By.id("employee_name_quick_filter_employee_list_value"));
    public static final Target TABLA_EMPLOYEE_LIST = Target.the("tabla que muestra el resultado de la busqueda de empleado").located(By.xpath("//tr//td[3]"));
    public static final Target BOTON_QUICK_SEARCH = Target.the("boton para realizar la busqueda de empleado").located(By.id("quick_search_icon"));
    //endregion

}

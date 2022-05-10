package co.com.choucair.certification.SISTECREDITO.ui;

import co.com.choucair.certification.SISTECREDITO.util.HelpersLogin;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationPage extends PageObject {

    public static final Target LOGIN =                      Target.the("Boton para iniciar sesion").located(By.id("testId-UserAction-userinfo"));
    public static final Target REGISTRY =                   Target.the("Registrar nuevo usuario").located(By.xpath("//*[@id='testId-cc-login-form']/form/div[3]/p/a"));
    public static final Target REGISTER_NAME =              Target.the("Ingresar nombre de registro").located(By.id("user"));
    public static final Target REGISTER_FATHER_LASTNAME =   Target.the("Apellido Paterno").located(By.id("apellidopaterno"));
    public static final Target REGISTER_MOTHER_LASTNAME =   Target.the("Apellido Paterno").located(By.id("apellidomaterno"));
    public static final Target EMAIL =                      Target.the("email").located(By.id("mail"));
    public static final Target PASSWORD =                   Target.the("contraseña").located(By.id("clave1"));
    public static final Target CONFIRM_PASSWORD =           Target.the("confirmar contraseña").located(By.id("clave2"));
    public static final Target SELECT_COUNTRY =             Target.the("Selecciona país").located(By.xpath("//select[@id='status']//option[@value='401']"));
    public static final Target IDENTIFICATION =             Target.the("CEDULA").located(By.id("cedula_colombia"));
    public static final Target SELECT_GENDER =              Target.the("Seleccionar genero").located(By.xpath("//input[@value='"+ HelpersLogin.randomSelectorGender()+"']"));
    public static final Target SELECT_DAY =                 Target.the("Seleecionar día de nacimiento").located(By.xpath("//select[@id='day']//option[@value='"+ HelpersLogin.randomDaySelector()+"']"));
    public static final Target SELECT_MONTH =               Target.the("Seleccionar mes de nacimiento").located(By.xpath("//select[@id='month']//option[@value='"+ HelpersLogin.randomMonthSelector()+"']"));
    public static final Target SELECT_YEAR =                Target.the("Selecciona Año de nacimiento").located(By.xpath("//select[@id='year']//option[@value= '"+ HelpersLogin.randomYearSelector()+"' ]"));
    public static final Target PHONE_NUMBER =               Target.the("Ingrese Celular").located(By.id("celular"));
    public static final Target TERMS_CONDITIONS =           Target.the("Terminos y Condiciones").located(By.id("agreelegaleId"));
    public static final Target BUTTON_SAVE =                Target.the("Boton guardar").located(By.id("boton_Ar"));
    public static final Target GO_TO_SHOP_BUTTON =          Target.the("Boton para ir a la tienda").located(By.xpath("//div[@class='btnReg comprarReg']"));
    public static final Target WELCOME_DIALOG =             Target.the("Comprobar bienvenido").located(By.xpath("//*[@id='testId-UserAction-userinfo']/div/div[1]/div[2]/div/p"));

}

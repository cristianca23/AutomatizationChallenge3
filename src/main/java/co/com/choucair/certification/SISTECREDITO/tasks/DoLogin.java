package co.com.choucair.certification.SISTECREDITO.tasks;

import co.com.choucair.certification.SISTECREDITO.util.HelpersLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.SISTECREDITO.ui.RegistrationPage.*;

public class DoLogin implements Task {

    private String password = HelpersLogin.randomPassword();
    private String name;

    public DoLogin(String name) {
        this.name = name;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LOGIN));
        actor.attemptsTo(Click.on(REGISTRY));
        actor.attemptsTo(Enter.theValue(name).into(REGISTER_NAME));
        actor.attemptsTo(Enter.theValue(HelpersLogin.apellidoRandom()).into(REGISTER_FATHER_LASTNAME));
        actor.attemptsTo(Enter.theValue(HelpersLogin.apellidoRandomMother()).into(REGISTER_MOTHER_LASTNAME));
        actor.attemptsTo(Enter.theValue(HelpersLogin.randomEmail()).into(EMAIL));
        actor.attemptsTo(Enter.theValue(password).into(PASSWORD));
        actor.attemptsTo(Enter.theValue(password).into(CONFIRM_PASSWORD));
        actor.attemptsTo(Click.on(SELECT_COUNTRY));
        actor.attemptsTo(Enter.theValue(HelpersLogin.randomId()).into(IDENTIFICATION));
        actor.attemptsTo(Click.on(SELECT_GENDER));
        actor.attemptsTo(Click.on(SELECT_DAY));
        actor.attemptsTo(Click.on(SELECT_MONTH));
        actor.attemptsTo(Click.on(SELECT_YEAR));
        actor.attemptsTo(Enter.theValue(HelpersLogin.randomPhoneNumber()).into(PHONE_NUMBER));
        actor.attemptsTo(Click.on(TERMS_CONDITIONS));
        actor.attemptsTo(Click.on(BUTTON_SAVE));
        actor.attemptsTo(Click.on(GO_TO_SHOP_BUTTON));


}

    public static Performable register(String name){
        return Tasks.instrumented(DoLogin.class, name);
    }
}

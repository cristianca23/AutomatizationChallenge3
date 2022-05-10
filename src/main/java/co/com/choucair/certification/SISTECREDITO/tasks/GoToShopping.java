package co.com.choucair.certification.SISTECREDITO.tasks;

import co.com.choucair.certification.SISTECREDITO.util.HelpersMain;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.SISTECREDITO.ui.MainMenu.*;

public class GoToShopping implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(GO_TO_SHOPPING));
        actor.attemptsTo(Click.on(SELECT_STATE));
        actor.attemptsTo(Click.on(SELECT_CITY));
        actor.attemptsTo(Click.on(ADDRESS));
        actor.attemptsTo(Click.on(CONTINUE_BUTTON));
        actor.attemptsTo(Enter.theValue(HelpersMain.randomAdress()).into(INSERT_ADDRESS));
        actor.attemptsTo(Enter.theValue(HelpersMain.randomName()).into(INSERT_HOUSE));
        actor.attemptsTo(Click.on(CONFIRM_ADDRESS));
        actor.attemptsTo(Click.on(PAY_BUTTON));


    }

    public static Performable shopProduct(){
        return Tasks.instrumented(GoToShopping.class);
    }
}

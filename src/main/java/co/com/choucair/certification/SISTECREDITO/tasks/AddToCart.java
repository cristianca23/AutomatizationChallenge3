package co.com.choucair.certification.SISTECREDITO.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.SISTECREDITO.ui.MainMenu.*;

public class AddToCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ADD_TO_BAG));
        actor.attemptsTo(Click.on(SEE_BAG));


    }

    public static Performable mainCart(){
        return Tasks.instrumented(AddToCart.class);
    }
}

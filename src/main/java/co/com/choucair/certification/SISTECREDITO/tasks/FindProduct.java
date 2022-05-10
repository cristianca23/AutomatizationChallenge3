package co.com.choucair.certification.SISTECREDITO.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static co.com.choucair.certification.SISTECREDITO.ui.MainMenu.*;

public class FindProduct implements Task {

    private String product;

    public FindProduct(String product) {
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(product).into(SEARCH_INPUT));
        actor.attemptsTo(Click.on(SEARCH_BUTTON));
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException ie) {
            /* Handle the interruption. Or ignore it. */

            System.out.println("Error al escoger producto");
        }
        actor.attemptsTo(Click.on(PRODUCTS));



    }

    public static Performable theProduct(String product){
        return Tasks.instrumented(FindProduct.class, product);
    }
}

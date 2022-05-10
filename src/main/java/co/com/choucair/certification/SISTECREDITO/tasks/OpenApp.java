package co.com.choucair.certification.SISTECREDITO.tasks;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;
import co.com.choucair.certification.SISTECREDITO.util.*;

public class OpenApp implements Task {

    private EnvironmentVariables environmentVariables;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String navegador = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty(HelpersLogin.FALABELLA_LINK);

        actor.attemptsTo(Open.url(navegador));
    }

    public static Performable url(){
        return Tasks.instrumented(OpenApp.class);
    }
}

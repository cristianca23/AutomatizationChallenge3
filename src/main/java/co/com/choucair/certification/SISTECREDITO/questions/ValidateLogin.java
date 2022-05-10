package co.com.choucair.certification.SISTECREDITO.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.choucair.certification.SISTECREDITO.ui.RegistrationPage.WELCOME_DIALOG;

public class ValidateLogin implements Question<String > {

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(WELCOME_DIALOG).getText().trim();
    }

    public static Question<String> logIn(){
        return new ValidateLogin();
    }
}

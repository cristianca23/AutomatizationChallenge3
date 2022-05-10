package co.com.choucair.certification.SISTECREDITO.questions;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.choucair.certification.SISTECREDITO.ui.MenuPurchase.CHOOSE_PAY_METHOD;

public class ValidatePurchase implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(CHOOSE_PAY_METHOD).getText().trim();
    }

    public static Question<String> confirmPurchase(){
        return new ValidatePurchase();
    }
}

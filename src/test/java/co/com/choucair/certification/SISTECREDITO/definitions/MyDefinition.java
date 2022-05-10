package co.com.choucair.certification.SISTECREDITO.definitions;

import co.com.choucair.certification.SISTECREDITO.questions.ValidateLogin;
import co.com.choucair.certification.SISTECREDITO.questions.ValidatePurchase;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.choucair.certification.SISTECREDITO.tasks.*;

import static co.com.choucair.certification.SISTECREDITO.util.HelpersLogin.WELCOME;
import static co.com.choucair.certification.SISTECREDITO.util.HelpersMain.CHOOSE_METHOD;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class MyDefinition {

    String name;
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("{string} desea poder comprar un televisor")
    public void deseaPoderComprarUnTelevisor(String name) {
        OnStage.theActorCalled(name).wasAbleTo(OpenApp.url());

        OnStage.theActorCalled(name).wasAbleTo(DoLogin.register(name));
    }
    @When("{string} busca un {string}")
    public void buscaUn(String name, String producto) {
        this.name = name;
        theActorInTheSpotlight().should(
                seeThat("Ingreso correctamente", ValidateLogin.logIn(), equalTo(WELCOME))
        );
        OnStage.theActorCalled(name).attemptsTo(FindProduct.theProduct(producto));
    }
    @When("Agrega a la bolsa de compras")
    public void agregaALaBolsaDeCompras() {

        OnStage.theActorCalled(name).attemptsTo(AddToCart.mainCart());
    }

    @Then("El sistema debe permitir realizar el proceso de compra")
    public void elSistemaDebePermitirRealizarElProcesoDeCompra() {
        OnStage.theActorCalled(name).attemptsTo(GoToShopping.shopProduct());

    }
    @Then("Ofrecerle a {string} diferentes opciones de pago")
    public void ofrecerleADiferentesOpcionesDePago(String name) {
        theActorInTheSpotlight().should(
                seeThat("Proceso de compra realizado exitosamente", ValidatePurchase.confirmPurchase(), equalTo(CHOOSE_METHOD))
        );


    }


}

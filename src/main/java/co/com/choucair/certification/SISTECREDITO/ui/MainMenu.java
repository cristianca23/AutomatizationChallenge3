package co.com.choucair.certification.SISTECREDITO.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.choucair.certification.SISTECREDITO.util.HelpersMain.randomProduct;

public class MainMenu extends PageObject {

    public static final Target SEARCH_INPUT = Target.the("Campo de busqueda").located(By.id("testId-SearchBar-Input"));
    public static final Target SEARCH_BUTTON = Target.the("Boton para buscar").located(By.className("SearchBar-module_searchBtnIcon__6KVum"));
    public static final Target PRODUCTS =       Target.the("Elegir producto al azar").located(By.xpath("//div[@class='jsx-4001457643 search-results-list']["+randomProduct()+"]"));
    public static final Target ADD_TO_BAG =     Target.the("Añadir a la bolsa el producto").located(By.xpath("//div[@id='buttonForCustomers']"));
    public static final Target SEE_BAG =        Target.the("Ir al menu de la bolsa de compras").located(By.id("linkButton"));
    public static final Target GO_TO_SHOPPING = Target.the("Ir a comprar boton").located(By.xpath("//div[@class='fb-order-status__cta']"));
    public static final Target SELECT_STATE =   Target.the("Seleccionar departamento ").located(By.xpath("//select[@id='region']//option[@value='14']"));
    public static final Target SELECT_CITY =    Target.the("Seleccionar ciudad").located(By.xpath("//select[@id='ciudad']//option[@value = '1']"));
    public static final Target ADDRESS =        Target.the("Seleccionar barrio ").located(By.xpath("//select[@id='comuna']//option[@value = '1']"));
    public static final Target CONTINUE_BUTTON = Target.the("Boton continuar").located(By.xpath("//button[@class='fbra_button fbra_test_button fbra_formItem__field04']"));
    public static final Target INSERT_ADDRESS = Target.the("Dirección").located(By.id("address"));
    public static final Target INSERT_HOUSE =   Target.the("Número de departamento").located(By.id("departmentNumber"));
    public static final Target CONFIRM_ADDRESS =Target.the("Confirmar la dirección").located(By.xpath("//button[@class='fbra_button fbra_test_button fbra_formItem__useAddress']"));
    public static final Target PAY_BUTTON =     Target.the("Pagar producto").located(By.xpath("//button[@class='fbra_button fbra_checkoutComponentDeliveryActions__continueToSecurePaymentButton fbra_test_checkoutComponentDeliveryActions__continueToSecurePaymentButton']"));

}


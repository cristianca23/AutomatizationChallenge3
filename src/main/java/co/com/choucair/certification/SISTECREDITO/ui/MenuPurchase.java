package co.com.choucair.certification.SISTECREDITO.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class MenuPurchase extends PageObject {

    public static final Target CHOOSE_PAY_METHOD =  Target.the("Escoja su metodo de pago").located(By.xpath("//div[@class='fbra_paymentOptionsTitle']"));
}

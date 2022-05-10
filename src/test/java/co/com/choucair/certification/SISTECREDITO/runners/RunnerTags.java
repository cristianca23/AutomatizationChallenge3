package co.com.choucair.certification.SISTECREDITO.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "co.com.choucair.certification.SISTECREDITO.definitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class RunnerTags {

}

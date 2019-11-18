package co.com.choucair.certification.orangehr.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/orangehr.feature"},
        tags = {"@Tag0"},
        glue = {"co.com.choucair.certification.orangehr.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {
}


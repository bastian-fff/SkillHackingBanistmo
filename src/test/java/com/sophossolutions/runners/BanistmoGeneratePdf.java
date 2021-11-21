package com.sophossolutions.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.sophossolutions.steps",
        features = "src/test/resources/com/sophossolutions/features/banistmo_generate_pdf.feature",
        snippets = SnippetType.CAMELCASE,
        monochrome = true
)

public class BanistmoGeneratePdf {
}

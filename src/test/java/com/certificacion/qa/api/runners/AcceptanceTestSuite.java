package com.certificacion.qa.api.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/",
        glue="com.certificacion.qa.api",
        tags = "@All_TC",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class AcceptanceTestSuite {}

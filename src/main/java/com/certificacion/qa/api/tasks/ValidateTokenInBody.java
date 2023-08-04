package com.certificacion.qa.api.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Ensure;
import org.apache.http.HttpStatus;

public class ValidateTokenInBody implements Task {

    public ValidateTokenInBody() {

    }

    public static Performable without() {
        return Instrumented.instanceOf(ValidateTokenInBody.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                ValidateDataJson.validarTokenNoVacio()
        );
    }
}

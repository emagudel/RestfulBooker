package com.certificacion.qa.api.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Ensure;
import org.apache.http.HttpStatus;

public class ValidateReasonInBody implements Task {

    public ValidateReasonInBody() {

    }

    public static Performable without() {
        return Instrumented.instanceOf(ValidateReasonInBody.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                ValidateDataJson.validarReasonNoVacio()
        );
    }
}

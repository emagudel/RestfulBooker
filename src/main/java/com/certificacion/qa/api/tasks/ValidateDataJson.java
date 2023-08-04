package com.certificacion.qa.api.tasks;

import net.serenitybdd.screenplay.rest.interactions.Ensure;

import static org.hamcrest.core.IsNull.notNullValue;

public class ValidateDataJson {

    public static Ensure validarTokenNoVacio() {
        return Ensure.that("El campo 'token' en la respuesta JSON no esta vacio",
                response -> response.body("token", notNullValue())
        );
    }

    public static Ensure validarReasonNoVacio() {
        return Ensure.that("El campo 'reason' en la respuesta JSON no esta vacio",
                response -> response.body("reason", notNullValue())
        );
    }
}

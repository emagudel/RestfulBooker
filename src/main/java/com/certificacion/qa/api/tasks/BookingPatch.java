/**
 * Grupo Aval Acciones y Valores S.A. CONFIDENTIAL
 *
 * <p>Copyright (c) 2018 . All Rights Reserved.
 *
 * <p>NOTICE: This file is subject to the terms and conditions defined in file 'LICENSE', which is
 * part of this source code package.
 */
package com.certificacion.qa.api.tasks;

import com.certificacion.qa.api.helpers.EnvironmentProperties;
import com.certificacion.qa.api.request.Template;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import net.serenitybdd.screenplay.rest.interactions.Patch;
import net.thucydides.core.annotations.Step;

import static com.certificacion.qa.api.helpers.Constant.BOOKING;

public class BookingPatch implements Task {



    public BookingPatch() {
    }

    public static Performable withId() {
        return Instrumented.instanceOf(BookingPatch.class).withProperties();
    }

    @Override
    @Step("{0} Ejecutar servicio")
    public <T extends Actor> void performAs(T actor) {
        String endpoint = EnvironmentProperties.getProperty(BOOKING);
        Object object = Template.getRequestPatchBooking();
        RequestSpecification requestSpec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                // Agrega otros encabezados si es necesario
                .build();

        actor.attemptsTo(
                Patch.to(endpoint+"1")
                        .with(request -> request.spec(requestSpec).body(object))
        );
    }
}
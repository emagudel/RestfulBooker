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
import com.certificacion.qa.api.util.DTOBooking;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import net.serenitybdd.screenplay.rest.interactions.Put;
import net.thucydides.core.annotations.Step;

import static com.certificacion.qa.api.helpers.Constant.BOOKING;
import static com.certificacion.qa.api.helpers.Constant.HEADER_VALUE_CONTEN_TYPE;

public class BookingDelete implements Task {



    public BookingDelete() {
    }

    public static Performable withId() {
        return Instrumented.instanceOf(BookingDelete.class).withProperties();
    }

    @Override
    @Step("{0} Ejecutar servicio")
    public <T extends Actor> void performAs(T actor) {
        String endpoint = EnvironmentProperties.getProperty(BOOKING);
        RequestSpecification requestSpec = new RequestSpecBuilder()
                // Agrega encabezados u otras configuraciones si es necesario
                .build();

        actor.attemptsTo(
                Delete.from(endpoint+"1")
                        .with(request -> request.spec(requestSpec))
        );
    }
}
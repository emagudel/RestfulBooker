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
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.thucydides.core.annotations.Step;

import static com.certificacion.qa.api.helpers.Constant.*;

public class BookingCreatePost implements Task {


    private DTOBooking dto;

    public BookingCreatePost() {
    }

    public static Performable withId(DTOBooking dto) {
        return Instrumented.instanceOf(BookingCreatePost.class).withProperties(dto);
    }

    @Override
    @Step("{0} Ejecutar servicio")
    public <T extends Actor> void performAs(T actor) {
        Object object = Template.getRequestCreateBookingPost(dto);
        actor.attemptsTo(
                Post.to(EnvironmentProperties.getProperty(BOOKING_IDS))
                        .with(request -> request
                                .header("Content-Type", HEADER_VALUE_CONTEN_TYPE)
                                .body(object))
        );
    }
}
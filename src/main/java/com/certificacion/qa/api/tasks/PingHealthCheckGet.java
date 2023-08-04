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
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.thucydides.core.annotations.Step;

import static com.certificacion.qa.api.helpers.Constant.BOOKING_IDS;
import static com.certificacion.qa.api.helpers.Constant.PING;

public class PingHealthCheckGet implements Task {

    public PingHealthCheckGet() {
    }

    public static Performable withId() {
        return Instrumented.instanceOf(PingHealthCheckGet.class).withProperties();
    }

    @Override
    @Step("{0} Ejecutar servicio")
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Get.resource(
                            EnvironmentProperties.getProperty(PING)
                    )
            );
    }
}
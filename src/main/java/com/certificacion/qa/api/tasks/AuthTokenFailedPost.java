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
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.thucydides.core.annotations.Step;

import static com.certificacion.qa.api.helpers.Constant.AUTHCREATETOKEN;
import static com.certificacion.qa.api.helpers.Constant.HEADER_VALUE_CONTEN_TYPE;

public class AuthTokenFailedPost implements Task {

    public AuthTokenFailedPost() {
    }

    public static Performable withId() {
        return Instrumented.instanceOf(AuthTokenFailedPost.class).withProperties();
    }

    @Override
    @Step("{0} Ejecutar servicio")
    public <T extends Actor> void performAs(T actor) {
        Object object = Template.getRequestAuthTokenFailedPost();
        actor.attemptsTo(
                Post.to(EnvironmentProperties.getProperty(AUTHCREATETOKEN))
                        .with(request -> request
                                .header("Content-Type", HEADER_VALUE_CONTEN_TYPE)
                                .body(object))
        );
    }
}
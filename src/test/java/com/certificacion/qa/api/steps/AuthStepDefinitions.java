package com.certificacion.qa.api.steps;

import com.certificacion.qa.api.tasks.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class AuthStepDefinitions {

    @Cuando("se ejecuta el servicio para crear token")
    public void seEjecutaElServicioParaCrearToken() {
        theActorInTheSpotlight()
                .attemptsTo(
                        AuthCreateTokenPost.withId()
                );
    }

    @Entonces("se puede ver token creado del api")
    public void sePuedeVerTokenCreadoDelApi() {
        theActorInTheSpotlight()
                .attemptsTo(
                        ValidateSCOk.without(),
                        ValidateTokenInBody.without()
                );
    }

    @Entonces("se puede ver que el token no se creo")
    public void sePuedeVerQueElTokenNoSeCreo() {
        theActorInTheSpotlight()
                .attemptsTo(
                        ValidateSCOk.without(),
                        ValidateReasonInBody.without()
                );
    }

    @Cuando("se ejecuta el servicio para crear token con datos invalidos")
    public void seEjecutaElServicioParaCrearTokenConDatosInvalidos() {
        theActorInTheSpotlight()
                .attemptsTo(
                        AuthTokenFailedPost.withId()
                );
    }
}

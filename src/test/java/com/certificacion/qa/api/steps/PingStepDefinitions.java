package com.certificacion.qa.api.steps;

import com.certificacion.qa.api.tasks.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class PingStepDefinitions {

    @Cuando("se ejecuta el servicio para validar estado del sistema")
    public void seEjecutaElServicioParaValidarEstadoDelSistema() {
        theActorInTheSpotlight()
                .attemptsTo(
                        PingHealthCheckGet.withId()
                );
    }

    @Entonces("se puede evidenciar que sistema funciona correctamente")
    public void sePuedeEvidenciarQueSistemaFuncionaCorrectamente() {
        theActorInTheSpotlight()
                .attemptsTo(
                        ValidateSCCreated.without()
                );
    }
}

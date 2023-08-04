package com.certificacion.qa.api.steps;

import com.certificacion.qa.api.tasks.*;
import com.certificacion.qa.api.util.DTOBooking;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static com.certificacion.qa.api.helpers.Constant.BASE_URL_BOOKING;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class BookingStepDefinitions {

    private DTOBooking dto = new DTOBooking();

    @Dado("que {} cuenta con los datos del servicio")
    public void queQACuentaConLosDatosDelServicio(String actor) {
        OnStage.
                setTheStage(
                        new OnlineCast()
                );
        theActorCalled(actor)
                .whoCan(
                        CallAnApi.at(BASE_URL_BOOKING)
                );
    }

    @Cuando("se ejecuta el servicio que obtiene listado de codigos de reservas")
    public void seEjecutaElServicioQueObtieneListadoDeCodigosBooking() {
        theActorInTheSpotlight()
                .attemptsTo(
                        BookingIDsGet.withId()
                );
    }

    @Entonces("se puede ver listado de codigos de reservas del api")
    public void sePuedeVerListadoDeCodigosBookingDelApi() {
        theActorInTheSpotlight()
                .attemptsTo(
                        ValidateSCOk.without()
                );
    }

    @Cuando("se ejecuta el servicio que obtiene la reserva codigo {}")
    public void seEjecutaElServicioQueObtieneLaReserva(String reserva) {
        theActorInTheSpotlight()
                .attemptsTo(
                        BookingGet.withId(reserva)
                );
    }

    @Entonces("se puede ver datos relacionados a la reserva")
    public void sePuedeVerDatosRelacionadosALaReserva() {
        theActorInTheSpotlight()
                .attemptsTo(
                        ValidateSCOk.without()
                );
    }

    @Entonces("se puede ver que la reserva no fue encontrada")
    public void sePuedeVerQueLaReservaNoFueEncontrada() {
        theActorInTheSpotlight()
                .attemptsTo(
                        ValidateSCNotFound.without()
                );
    }

    @Dado("que {} tiene nombre {} y apellido {} del cliente")
    public void queQATieneNombreNombreYApellidoApellidoDelCliente(String actor, String nombre, String apellido) {
        dto.setNombre(nombre);
        dto.setApellido(apellido);
        OnStage.
                setTheStage(
                        new OnlineCast()
                );
        theActorCalled(actor)
                .whoCan(
                        CallAnApi.at(BASE_URL_BOOKING)
                );
    }

    @Y("se tiene la fecha de entrada {} y salida {} de la reserva")
    public void seTieneLaFechaDeEntradaFechaEntradaYSalidaFechaSalidaDeLaReserva(String fechaEntrada, String fechaSalida) {
        dto.setFechaEntrada(fechaEntrada);
        dto.setFechaSalida(fechaSalida);
    }

    @Cuando("se ejecuta el servicio de crear reserva aportando un abono de {}")
    public void seEjecutaElServicioDeCrearReservaAportandoUnAbonoDePago(String pago) {
        dto.setPago(pago);
        theActorInTheSpotlight()
                .attemptsTo(
                        BookingCreatePost.withId(dto)
                );
    }

    @Entonces("se puede ver que la reserva fue creada")
    public void sePuedeVerQueLaReservaFueCreada() {
        theActorInTheSpotlight()
                .attemptsTo(
                        ValidateSCOk.without()
                );
    }

    @Cuando("se ejecuta el servicio de actualizar reserva {} aportando un abono de {}")
    public void seEjecutaElServicioDeActualizarReservaAportandoUnAbonoDePago(String reserva, String pago) {
        dto.setPago(pago);
        theActorInTheSpotlight()
                .attemptsTo(
                        BookingUpdate.withId(dto, reserva)
                );
    }

    @Entonces("se puede ver que la reserva fue actualizada")
    public void sePuedeVerQueLaReservaFueActualizada() {
        theActorInTheSpotlight()
                .attemptsTo(
                        ValidateSCForbidden.without()
                );
    }

    @Entonces("se puede ver que se fue eliminada la reserva")
    public void sePuedeVerQueSeFueEliminadaLaReserva() {
        theActorInTheSpotlight()
                .attemptsTo(
                        ValidateSCForbidden.without()
                );
    }

    @Cuando("se ejecuta el servicio para eliminar reserva")
    public void seEjecutaElServicioParaEliminarReserva() {
        theActorInTheSpotlight()
                .attemptsTo(
                        BookingDelete.withId()
                );
    }

    @Cuando("se ejecuta el servicio para actualizar de forma parcial una reserva")
    public void seEjecutaElServicioParaActualizarDeFormaParcialUnaReserva() {
        theActorInTheSpotlight()
                .attemptsTo(
                        BookingDelete.withId()
                );
    }
}

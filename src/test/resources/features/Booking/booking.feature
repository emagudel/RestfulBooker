#language:es

@All_TC
Característica: Api Restful Booker Booking
  Yo como QA candidato
  Quiero ejecutar los servicios Restful Booker en repo automatizado
  Para demostrar que se automatizar servicios rest

  @All_TC  @HP_GetBookingIds @Booking
  Escenario: Camino Feliz Servicio Obtener Listado De Reservas

    Dado que QA cuenta con los datos del servicio
    Cuando se ejecuta el servicio que obtiene listado de codigos de reservas
    Entonces se puede ver listado de codigos de reservas del api

  @All_TC  @HP_GetBooking  @Booking
  Esquema del escenario: Camino Feliz Servicio Datos De La Reserva

    Dado que QA cuenta con los datos del servicio
    Cuando se ejecuta el servicio que obtiene la reserva codigo <reserva>
    Entonces se puede ver datos relacionados a la reserva

    Ejemplos:
      | reserva |
      | 1       |

  @All_TC  @AP_GetBooking  @Booking
  Esquema del escenario: Camino Alterno Servicio Datos De La Reserva

    Dado que QA cuenta con los datos del servicio
    Cuando se ejecuta el servicio que obtiene la reserva codigo <reserva>
    Entonces se puede ver que la reserva no fue encontrada

    Ejemplos:
      | reserva     |
      | 15238952679 |

  @All_TC  @HP_CreateBooking  @Booking
  Esquema del escenario: Camino Feliz Servicio Crear Reserva

    Dado que QA tiene nombre <nombre> y apellido <apellido> del cliente
    Y se tiene la fecha de entrada <fechaEntrada> y salida <fechaSalida> de la reserva
    Cuando se ejecuta el servicio de crear reserva aportando un abono de <pago>
    Entonces se puede ver que la reserva fue creada

    Ejemplos:
      | nombre | apellido | fechaEntrada | fechaSalida | pago |
      | Jim    | Brown    | 2018-01-01   | 2019-01-01  | 100  |


  @All_TC  @HP_UpdateBooking  @Booking
  Esquema del escenario: Camino Feliz Servicio Actualizar Reserva

    Dado que QA tiene nombre <nombre> y apellido <apellido> del cliente
    Y se tiene la fecha de entrada <fechaEntrada> y salida <fechaSalida> de la reserva
    Cuando se ejecuta el servicio de actualizar reserva <reserva> aportando un abono de <pago>
    Entonces se puede ver que la reserva fue actualizada

    Ejemplos:
      | nombre | apellido | fechaEntrada | fechaSalida | pago | reserva |
      | James  | Brown    | 2018-01-01   | 2019-01-01  | 100  | 1       |

  @All_TC  @HP_DeleteBooking  @Booking
  Escenario: Camino Feliz Servicio Eliminar Reserva

    Dado que QA cuenta con los datos del servicio
    Cuando se ejecuta el servicio para eliminar reserva
    Entonces se puede ver que se fue eliminada la reserva

  @All_TC  @HP_PartialUpdateBooking  @Booking
  Escenario: Camino Feliz Servicio Actualizacion Parcial de una Reserva

    Dado que QA cuenta con los datos del servicio
    Cuando se ejecuta el servicio para actualizar de forma parcial una reserva
    Entonces se puede ver que la reserva fue actualizada



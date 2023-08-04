#language:es

@All_TC
Característica: Api Restful Booker Ping
  Yo como QA candidato
  Quiero ejecutar los servicios Restful Booker en repo automatizado
  Para demostrar que se automatizar servicios rest

  @All_TC  @HP_HealthCheck  @Ping
  Escenario: Camino Feliz Servicio Validar Estado

    Dado que QA cuenta con los datos del servicio
    Cuando se ejecuta el servicio para validar estado del sistema
    Entonces se puede evidenciar que sistema funciona correctamente
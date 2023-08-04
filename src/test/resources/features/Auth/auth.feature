#language:es

@All_TC
Característica: Api Restful Booker Auth
  Yo como QA candidato
  Quiero ejecutar los servicios Restful Booker en repo automatizado
  Para demostrar que se automatizar servicios rest

  @All_TC  @HP_CreateToken @Auth
  Escenario: Camino Feliz Servicio Crear Token

    Dado que QA cuenta con los datos del servicio
    Cuando se ejecuta el servicio para crear token
    Entonces se puede ver token creado del api

  @All_TC  @AP_CreateToken @Auth
  Escenario: Camino Alterno Servicio Crear Token

    Dado que QA cuenta con los datos del servicio
    Cuando se ejecuta el servicio para crear token con datos invalidos
    Entonces se puede ver que el token no se creo

# RestfulBooker

# Proyecto Serenity Rest con Patrón Screenplay

Proyecto automatizado pruebas funcionales sobre servicios REST del aplicativo https://restful-booker.herokuapp.com/apidoc/index.html#api-Auth-CreateToken,   utilizando Serenity BDD, Cucumber BDD en una arquitectura Gradle con el patrón de diseño Screenplay.

## Requisitos Previos

Asegúrate de tener instalado en tu máquina:
- Java JDK 11 o superior
- Gradle

## Ejecución de Pruebas

1. Clona este repositorio en tu máquina: https://github.com/emagudel/RestfulBooker.git

2. Navega a la carpeta del proyecto:

3. Abre una terminal y ejecuta las pruebas con Gradle:
    gradle clean test


Las pruebas automatizadas se ejecutarán y podrás ver los resultados en la terminal.

## Estructura del Proyecto

- `src/test/java`: Contiene las clases de pruebas automatizadas en el patrón Screenplay.
- `src/test/resources`: Contiene los archivos de configuración y datos de prueba.
- `build/reports/tests`: Después de la ejecución, aquí encontrarás los informes de resultados.

## Configuración

- La configuración de Serenity BDD se encuentra en el archivo `serenity.properties`.
- Las URLs de los servicios se pueden configurar en archivos de propiedades en `src/test/resources`.

## Personalización

Siéntete libre de personalizar este proyecto según tus necesidades. Puedes agregar más pruebas, escenarios, configuraciones, y adaptarlo para tu aplicación o API específica.

## Documentación Adicional

Para más detalles sobre Serenity BDD y el patrón Screenplay, consulta la documentación oficial:
- [Serenity BDD](http://www.thucydides.info/docs/serenity-staging/)
- [Screenplay Pattern](http://www.thucydides.info/docs/serenity-staging/#_the_screenplay_pattern)

## Contribuciones

Si encuentras errores o mejoras posibles, siéntete libre de contribuir a este repositorio enviando un pull request.


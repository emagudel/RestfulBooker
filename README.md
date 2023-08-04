# demo-api-testing

Esta es una API muy simple que puedes usar para aprender API Testing. Está construida usando express y nodejs. Almacena los datos en un archivo JSON almacenado en la carpeta "database" con el nombre "PFMembers.json". Hay siete puntos finales en esta API.
1. ### Members - http://localhost:5002/api/members
    * GET ALL (/) - Esto devolverá todos los miembros. También puede utilizar el parámetro de consulta para filtrar en función del sexo.
    * GET (/ID) - Puede recuperar un miembro específico basado en su ID.
    * POST (/) - Puede enviar un nuevo miembro al archivo PFMembers.json.
    * PUT (/ID) - Puede ACTUALIZAR un miembro existente en el archivo PFMembers.json proporcionando TANTO NOMBRE como GÉNERO.
    * PATCH (/ID) - Puede ACTUALIZAR un miembro existente en el archivo PFMembers.json proporcionando NOMBRE o GÉNERO o AMBOS.
    * DELETE (/ID) - Puede DELETEAR un miembro existente en el archivo PFMembers.json.
    * Las respuestas JSON y XML están disponibles.
2. ### Carga de Archivos - http://localhost:5002/api/upload
    * POST (/) - Puedes POSTAR un nuevo ARCHIVO en la carpeta fileuploads.
3. ### Descarga de archivos - http://localhost:5002/api/download?name=FileNameWithExtension
    * GET (/) - Puede descargar un ARCHIVO. Por ejemplo, http://localhost:5002/api/download?name=Test.jpg
4. ### Respuesta Retardada - http://localhost:5002/api/lag?delay=TimeInMilliSeconds
    * Cambie TimeInMilliSeconds con el Valor Apropiado e.g. http://localhost:5002/api/lag?delay=3000 retrasaría la respuesta 3 Segundos
5. ### Cabecera Obligatoria en la Petición - http://localhost:5002/api/sendheader
    * Error si la cabecera channelName no está establecida en el Objeto de Petición.
6. ### Vehículos - http://localhost:5002/api/vehicles
    * GET ALL (/) - Esto devolverá todos los vehículos. 
7. ### Autores - http://localhost:5002/api/authors
    * GET ALL (/) - Esto devolverá todos los autores. 
8. ### PASOS DE INSTALACIÓN
      * Instalar node.js
      * Instalar VS Code como IDE
      * Instalar nodemon globalmente abriendo la terminal y ejecutando el siguiente comando : -.
         - **npm install nodemon -g**
      * Descarga este proyecto en tu sistema
      * Abra el proyecto en VS Code y en el terminal integrado de VS Code ejecute el siguiente comando: -
         - **npm install**
      * Para iniciar el proyecto escriba el siguiente comando en el terminal integrado de VS Code: -
         - **npm start**
9. Por defecto este proyecto se ejecuta en el PUERTO 5002; para cambiarlo abra amablemente el archivo app.js y actualice la siguiente línea de código: -
    - **const PORT = process.env.PORT || 5002**
10. Este proyecto tiene autenticación básica en su lugar. Así que, para acceder a los endpoints tienes que proporcionar el nombre de usuario y la contraseña.
    - Nombre de usuario = admin
    - Contraseña = admin

# ProyectoProgra3BackEnd
Este es el backend del proyecto final de Programacion 3

## Creadores
- Cristian Caceres
- Diego Iboy
- Pablo Rixtun
- Ricardo Chavez
- Fernando Contreras


Para poder ejecutar el proyecto se requiere que se corra el script de sql para poder generar las base de datos necesaria para el aplicativo.

scrip se encuentra en la carpeta raiz como "sql chat.sql"
------------

Usuarios para pruebas 
user: QA1 password: 1
user: QA2 password: 1

Canal de "QA"


#######

Se usan 2 servidores para que corra la aplicacion uno para los servicios REST y el otro para el servidor socket.io que levanta cliente y server.

Instrucciones para levantar los servicios.

Correr el archivo ProyectoProgra3Application, para los servicios REST

Correr el servicio de socket.io. en el archivo index.js. -> npm run dev  estando en react/socketio-server


se requiere que se cuente con nodejs,socket.io,daemon


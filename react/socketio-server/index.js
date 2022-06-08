const path = require('path');
const express = require('express');
const app = express();


//configuraciones
app.set('port', process.env.PORT || 4201)

//archivos estaticos
app.use(express.static(path.join(__dirname,'public')));

//inicia server
const server = app.listen(app.get('port'), ()=>{
    console.log('servidor por el puerto', app.get('port'));
});

//websockets
const SocketIO = require('socket.io');
const io = SocketIO(server);

io.on('connection', (socket) => {
    console.log('new conection', socket.id);

    socket.on('chat:message', (data) => {
       io.sockets.emit('chat:message', data);
    });

    socket.on('typing', (data) => {
        socket.broadcast.emit('typing', data);
    });

});

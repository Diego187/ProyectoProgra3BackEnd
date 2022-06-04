package com.umg.ProyectoProgra3.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import com.umg.ProyectoProgra3.entity.*;
import com.umg.ProyectoProgra3.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/chat")
@CrossOrigin
class ChatService {

    @Autowired
    ChannelRepository channelRepository;

    @Autowired
    MessageIdchannelRepository messageIdchannelRepository;

    @Autowired
    MessageRepository messageRepository;

    @Autowired
    UserRepository userRepository;

    //Este Get obtiene un canal, con la lista de mns por ID
   @GetMapping(path = "/findOne/{idchannel}")
    private List<Channel> findOne(@PathVariable int idchannel) {
        return channelRepository.findByIdchannel(idchannel);
    }

    @GetMapping(path = "/prueba")
    public String prueba()
    {
        return "test 134324kjdfslafjl";
    }

    //Este Post agrega un canal
    @PostMapping(path = "/add")
    private Chat add(@RequestBody Chat dato) {
        Channel channel = new Channel();
        channel.setName(dato.getName());
        channel.setDescription(dato.getDescription());
        channelRepository.save(channel);
        creatMessage(dato);
        return dato;
    }
    //Crea un mensaje al crear el canal
    private void creatMessage(Chat dato) {
        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm");
        List<Channel> mensajes = channelRepository.findAll();
        int mayor = 0;
        for (Channel mensaje : mensajes) {
            mayor = mensaje.getIdchannel();
        }

        Message mensaje = new Message();
        mensaje.setUserIdclient(dato.getUserIdclient());
        mensaje.setUserUser("BOT");
        mensaje.setMessage("Bienvenido!");
        mensaje.setChannelIdchannel(mayor);
        mensaje.setDate(fecha.format(LocalDateTime.now()));
        mensaje.setTime(hora.format(LocalDateTime.now()));
        messageRepository.save(mensaje);
    }
     //Get para buscar cliente por id
    @GetMapping(path = "/find/{idclient}")
    private List<Channel> find(@PathVariable int idclient) {

        List<Channel> channels = channelRepository.findAll();
        List<Channel> channelsResponse = new ArrayList<>();
        List<MessageIdchannel> channelsUser = messageIdchannelRepository.findByMessageId(idclient);

        for (MessageIdchannel channelUser : channelsUser) {
            for (Channel channel : channels) {
                if (channelUser.getChannelIdchannel() == channel.getIdchannel()) {
                    Channel channelSave = new Channel();
                    channelSave.setIdchannel(channel.getIdchannel());
                    channelSave.setName(channel.getName());
                    channelSave.setDescription(channel.getDescription());
                    channelsResponse.add(channelSave);
                }
            }
        }
        return channelsResponse;
    }



}

package com.umg.ProyectoProgra3.service;

import antlr.debug.MessageAdapter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import com.umg.ProyectoProgra3.entity.*;
import com.umg.ProyectoProgra3.repository.ChannelRepository;
import com.umg.ProyectoProgra3.repository.MessageIdchannelRepository;
import com.umg.ProyectoProgra3.repository.MessageRepository;
import com.umg.ProyectoProgra3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/chat")
@CrossOrigin
public class ChatService {

    @Autowired
    ChannelRepository channelRepository;

    @Autowired
    MessageIdchannelRepository messageIdchannelRepository;

    @Autowired
    MessageRepository messageRepository;

    @Autowired
    UserRepository userRepository;





/*
    public void prueba(){
        Integer[] numbers = {1, 2, 3, 4, 5};

        Observable<Integer> miObservable = Observable.from(numbers);

        Observable resultadoMap =
                miObservable
                        .map((item) -> {
                            return item ;
                        });

        resultadoMap.subscribe((item) -> {
            System.out.println("item:" + item);
        });
    }*/

    @GetMapping(path = "/find")
    private List<Message> find(){
        return messageRepository.findAll();
    }

    @GetMapping(path = "/findAll")
    private List<Channel> findAll(){
        List<Channel> channels = new ArrayList<>();
        channels = channelRepository.findAll();
        List<Message> messages = new ArrayList<>();
        List<User> users = new ArrayList<>();
        users = userRepository.findAll();
        for(Channel channel: channels) {
            messages = channel.getMessageList();
            for (Message message : messages) {
                for (User user : users) {
                    if (message.getUserIdclient() == user.getIdclient()) {
                        message.setUserUser(user.getUser());
                        break;
                    }
                }
            }
        }
        return channels;
    }



    @PostMapping(path = "/add")
    private Chat add(@RequestBody Chat dato){
        Channel channel = new Channel();
        channel.setName(dato.getName());
        channel.setDescription(dato.getDescription());
        channelRepository.save(channel);
        creatMessage(dato);
        return dato;
    }

    private void creatMessage(Chat dato){

        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm:ss");

        List<Channel> mensajes = channelRepository.findAll();
        int mayor=0;

        for (Channel mensaje:mensajes
             ) {
            mayor = mensaje.getIdchannel();
        }

        Message mensaje = new Message();
        mensaje.setChannelIdchannel(dato.getChannelIdchannel());
        mensaje.setUserIdclient(dato.getUserIdclient());
        mensaje.setUserUser(dato.getUser());
        mensaje.setMessage("Bienvenido!");
        mensaje.setChannelIdchannel(mayor);
        mensaje.setDate(fecha.format(LocalDateTime.now()));
        mensaje.setTime(hora.format(LocalDateTime.now()));
        messageRepository.save(mensaje);
          }


    @GetMapping(path = "/findIdchat/{idclient}")
    private List<MessageIdchannel> findByMessageId(@PathVariable int idclient){
        return messageIdchannelRepository.findByMessageId(idclient);
    }

}

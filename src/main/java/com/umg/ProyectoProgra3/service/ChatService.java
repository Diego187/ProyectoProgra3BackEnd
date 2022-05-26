package com.umg.ProyectoProgra3.service;

import antlr.debug.MessageAdapter;
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
        creatMessage(dato);
        Channel channel = new Channel();
        channel.setName(dato.getName());
        channel.setDescription(dato.getDescription());

        channelRepository.save(channel);
        System.out.println(channel);

        return dato;
    }

    private void creatMessage(Chat dato){

        Message mensaje = new Message();
        mensaje.setChannelIdchannel(dato.getIdchannel());
        mensaje.setUserIdclient(dato.getIdclient());
        mensaje.setUserUser(dato.getUser());
        mensaje.setMessage("");
        mensaje.setChannelIdchannel(0);
        mensaje.setDate("");
        mensaje.setIdmessage(0);
        mensaje.setTime("");

        messageRepository.save(mensaje);


          }





    @GetMapping(path = "/findIdchat/{idclient}")
    private List<MessageIdchannel> findByMessageId(@PathVariable int idclient){
        return messageIdchannelRepository.findByMessageId(idclient);
    }

}

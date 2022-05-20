package com.umg.ProyectoProgra3.service;

import com.umg.ProyectoProgra3.entity.Channel;
import com.umg.ProyectoProgra3.entity.Message;
import com.umg.ProyectoProgra3.repository.ChannelRepository;
import com.umg.ProyectoProgra3.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rx.Observable;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/chat")
@CrossOrigin
public class ChatService {

    @Autowired
    ChannelRepository channelRepository;

    @Autowired
    MessageRepository messageRepository;

    public void prueba(){
        Integer[] numbers = {1, 2, 3, 4, 5};

        Observable<Integer> miObservable = Observable.from(numbers);

        Observable resultadoMap =
                miObservable
                        .map((item) -> {
                            return item * 10;
                        });

        resultadoMap.subscribe((item) -> {
            System.out.println("item:" + item);
        });
    }

    @GetMapping(path = "/find")
    private List<Message> find(){
        return messageRepository.findAll();
    }

    @GetMapping(path = "/findIdchat")
    private Optional<Message> findByMessageId(){
        return messageRepository.findByMessageId();
    }

}

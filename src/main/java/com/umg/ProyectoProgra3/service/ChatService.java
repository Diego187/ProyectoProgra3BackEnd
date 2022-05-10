package com.umg.ProyectoProgra3.service;

import com.umg.ProyectoProgra3.entity.Chat;
import com.umg.ProyectoProgra3.entity.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rx.Observable;

import java.util.List;

import static com.umg.ProyectoProgra3.ProyectoProgra3Application.chats;

@RestController
@RequestMapping("/chat")
@CrossOrigin
public class ChatService {

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
    private List<Chat> find(){
        for (Chat chat : chats){
            System.out.println(chat.getName());
        }
        return chats;
    }
}

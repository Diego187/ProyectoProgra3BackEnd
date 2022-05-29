package com.umg.ProyectoProgra3.service;

import com.umg.ProyectoProgra3.entity.Message;
import com.umg.ProyectoProgra3.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
@CrossOrigin
public class MessageService {
    @Autowired
    MessageRepository messageRepository;

    @PostMapping(path = "/add")
    private HttpStatus add(@RequestBody Message message) {
        messageRepository.save(message);
        return HttpStatus.OK;
    }
}

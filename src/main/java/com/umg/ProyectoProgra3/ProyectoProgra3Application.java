package com.umg.ProyectoProgra3;

import com.umg.ProyectoProgra3.entity.Chat;
import com.umg.ProyectoProgra3.entity.Message;
import com.umg.ProyectoProgra3.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.ArrayList;

@SpringBootApplication
public class ProyectoProgra3Application {

	public static ArrayList<Chat> chats;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoProgra3Application.class, args);

		//Practicas

		chats = new ArrayList<>();
		ArrayList<User> members = new ArrayList<>();
		ArrayList<Message> messages = new ArrayList<>();


		User user = new User();
		user.setUser("diboy");
		user.setIdclient(20);
		user.setFirstLastName("Diego");
		user.setFirstLastName("Iboy");
		members.add(user);

		Message message = new Message();
		message.setUser("Usuario 1");
		message.setDate("12/12/1212");
		message.setTime("12:12");
		message.setMessage("ME CAGO EN TODO!!, mensaje 1");
		messages.add(message);

		Message message2 = new Message();
		message2.setUser("Usuario 2");
		message2.setDate("12/12/1212");
		message2.setTime("12:12");
		message2.setMessage("ME CAGO EN *****!!, mensaje 2");
		messages.add(message2);

		Chat chat = new Chat();
		chat.setName("Canal 1");
		chat.setDescription("Prueba canal 1");
		chat.setMembers(members);
		chat.setMessages(messages);
		chats.add(chat);

		Chat chat2 = new Chat();
		chat2.setName("Canal 2");
		chat2.setDescription("Prueba canal 2");
		chat2.setMembers(members);
		chat2.setMessages(messages);
		chats.add(chat2);

	}

}

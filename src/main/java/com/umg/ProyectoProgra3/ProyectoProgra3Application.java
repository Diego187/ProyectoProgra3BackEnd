package com.umg.ProyectoProgra3;

import com.umg.ProyectoProgra3.entity.Chat;
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

		User user = new User();
		user.setUser("diboy");
		user.setIdclient(20);
		user.setFirstLastName("Diego");
		user.setFirstLastName("Iboy");
		members.add(user);

		Chat chat = new Chat();
		chat.setName("Canal 1");
		chat.setDescription("Prueba canal 1");
		chat.setMembers(members);
		chats.add(chat);

		Chat chat2 = new Chat();
		chat2.setName("Canal 2");
		chat2.setDescription("Prueba canal 2");
		chat2.setMembers(members);
		chats.add(chat2);



	}

}

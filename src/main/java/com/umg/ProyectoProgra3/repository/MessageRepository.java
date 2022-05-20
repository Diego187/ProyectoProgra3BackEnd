package com.umg.ProyectoProgra3.repository;


import com.umg.ProyectoProgra3.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Repository("messageRepository")
public interface MessageRepository  extends JpaRepository<Message, Serializable> {


    @Query(value = " SELECT user_idclient ,channel_idchannel , COUNT(*) as repeticiones FROM message where user_idclient = 1 GROUP BY user_idclient ,channel_idchannel HAVING COUNT(*)>0",nativeQuery = true)
    Optional<Message> findByMessageId();
}
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


    @Query(value = " SELECT userIdclient ,channelIdchannel , COUNT(*) as repeticiones FROM message where userIdclient = 1 GROUP BY userIdclient ,channelIdchannel HAVING COUNT(*)>0",nativeQuery = true)
    Optional<Message> findByMessageId();
}
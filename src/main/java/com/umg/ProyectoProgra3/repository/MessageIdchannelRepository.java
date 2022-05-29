package com.umg.ProyectoProgra3.repository;

import com.umg.ProyectoProgra3.entity.MessageIdchannel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import reactor.core.publisher.Flux;

import java.io.Serializable;
import java.util.List;

public interface MessageIdchannelRepository  extends JpaRepository<MessageIdchannel, Serializable> {

    @Query(value = "SELECT channel_idchannel,user_idclient from message m WHERE user_idclient =?1 GROUP by channel_idchannel,user_idclient ",nativeQuery = true)
    List<MessageIdchannel> findByMessageId(int idclient);


}

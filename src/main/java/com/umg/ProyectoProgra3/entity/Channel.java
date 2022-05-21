package com.umg.ProyectoProgra3.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "channel")
public class Channel implements Serializable {

    private static final long serialVersionUID = 3760988163877761705L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)

    @Column(name = "idchannel")
    private int idchannel;

    @Column(name = "name")
    private String name;

    @Column(name="description")
    private String description;

    @OneToMany(mappedBy = "channelIdchannel")
    private List<Message> messageList;

    public int getIdchannel() {
        return idchannel;
    }

    public void setIdchannel(int idchannel) {
        this.idchannel = idchannel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }
}

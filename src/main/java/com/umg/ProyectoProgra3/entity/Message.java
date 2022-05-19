package com.umg.ProyectoProgra3.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "message")
public class Message implements Serializable {

    private static final long serialVersionUID = 3760988163877761705L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)

    @Column(name = "idmessage")
    private int idmessage;

    @Column(name = "date")
    private String date;

    @Column(name = "time")
    private String time;

    @Column(name = "message")
    private String message;

    @Column(name = "channelIdchannel")
    private int channelIdchannel;

    @Column(name = "userIdclient")
    private int userIdclient;

    public int getIdmessage() {
        return idmessage;
    }

    public void setIdmessage(int idmessage) {
        this.idmessage = idmessage;
    }

   public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getChannelIdchannel() {
        return channelIdchannel;
    }

    public void setChannelIdchannel(int channelIdchannel) {
        this.channelIdchannel = channelIdchannel;
    }

    public int getUserIdclient() {
        return userIdclient;
    }

    public void setUserIdclient(int userIdclient) {
        this.userIdclient = userIdclient;
    }
}

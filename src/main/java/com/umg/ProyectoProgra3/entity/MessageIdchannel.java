package com.umg.ProyectoProgra3.entity;

import javax.persistence.*;

@Entity
@Table(name = "message")
public class MessageIdchannel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)

    @Column(name = "channelIdchannel")
    private int channelIdchannel;

    @Column(name = "userIdclient")
    private int userIdclient;

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

package com.umg.ProyectoProgra3.entity;

public class Chat {

    private String user;
    private int userIdclient;
    private String name;
    private String description;
    private int channelIdchannel;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getUserIdclient() {
        return userIdclient;
    }

    public void setUserIdclient(int userIdclient) {
        this.userIdclient = userIdclient;
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

    public int getChannelIdchannel() {
        return channelIdchannel;
    }

    public void setChannelIdchannel(int channelIdchannel) {
        this.channelIdchannel = channelIdchannel;
    }
}

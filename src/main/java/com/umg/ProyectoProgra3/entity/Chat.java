package com.umg.ProyectoProgra3.entity;

public class Chat {

    private String user;
    private int idclient;
    private String name;
    private String description;
    private int idchannel;

    public int getIdchannel() {
        return idchannel;
    }

    public void setIdchannel(int idchannel) {
        this.idchannel = idchannel;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getIdclient() {
        return idclient;
    }

    public void setIdclient(int idclient) {
        this.idclient = idclient;
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
}

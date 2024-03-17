package com.aravind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
public class Home {
    //POJO CLASS
    private   String owner;
    private int door_no;
    @Autowired
    private InternetConnection modem;
    public Home(){
        System.out.println("Home Home");
    }

    public String getOwner() {
        return owner;
    }

    public int getDoor_no() {
        return door_no;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setDoor_no(int door_no) {
        this.door_no = door_no;
    }
    void display(){
        modem.Switch();
        System.out.println("connected");
    }
}

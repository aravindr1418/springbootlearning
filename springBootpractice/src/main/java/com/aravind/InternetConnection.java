package com.aravind;

import org.springframework.stereotype.Component;

@Component
public class InternetConnection {
    private String Address;
    private int speed;

    public String getAddress() {
        return Address;
    }

    public int getSpeed() {
        return speed;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    void Switch(){
        System.out.println("Switch on.");
    }
}

package de.kai_morich.simple_bluetooth_terminal.aodv;

import java.util.Base64;

public abstract class Packet {

    private int hopAddress;
    private int prevHopAddress;

    public Base64 ToBase64(Object o){
        return null;
    }

    public String ToPlainText(Base64 base64){
        return null;
    }

    //public abstract void addPath(Packet packet);

    public int getHopAddress() {
        return hopAddress;
    }

    public void setHopAddress(int hopAddress) {
        this.hopAddress = hopAddress;
    }

    public int getPrevHopAddress() {
        return prevHopAddress;
    }

    public void setPrevHopAddress(int prevHopAddress) {
        this.prevHopAddress = prevHopAddress;
    }
}

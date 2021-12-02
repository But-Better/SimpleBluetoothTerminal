package de.kai_morich.simple_bluetooth_terminal.aodv;

import java.util.Base64;

public class RrepPacket extends ReqRepBase{
    private int ttl;

    public int getTtl() {
        return ttl;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }
}

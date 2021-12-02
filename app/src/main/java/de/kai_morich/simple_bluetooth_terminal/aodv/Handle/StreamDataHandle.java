package de.kai_morich.simple_bluetooth_terminal.aodv.Handle;

import java.util.Base64;

public class StreamDataHandle {

    public String readDataTraffic(byte[] msg) {
        return analysePacket(Base64.getEncoder().encodeToString(msg));
    }

    private String analysePacket(String text) {
        switch (text) {
            case "1":
                return "new AckPacket();";
        }
        return null;
    }
}
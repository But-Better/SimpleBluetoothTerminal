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

    /**
     * returns the type of the message as an integer
     * @param msg that is recieved
     * @return 0 for RREQ, 1 for RREP, 2 for RERR, 3 for MSG, 4 for ACK
     */
    public int getPacketType(byte[] msg){
        if(msg[0]%2==1){
            return ((msg[0] - 1) / (int) Math.pow(2, 4));
        }
        return ((msg[0]) / (int) Math.pow(2, 4));
    }

}
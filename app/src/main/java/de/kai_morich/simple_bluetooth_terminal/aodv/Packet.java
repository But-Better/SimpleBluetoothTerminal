package de.kai_morich.simple_bluetooth_terminal.aodv;

import java.util.Base64;

public abstract class Packet {

    public abstract Object ToBase64(Object o);
    public abstract String ToPlainText(Base64 base64);

}

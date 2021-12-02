package de.kai_morich.simple_bluetooth_terminal.aodv;

public abstract class Packet {

    public abstract Object ToBase64(Object o);
    public abstract String ToPlainText(Object o);

}

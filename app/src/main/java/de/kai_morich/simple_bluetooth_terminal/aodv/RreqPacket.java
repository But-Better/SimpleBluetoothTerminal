package de.kai_morich.simple_bluetooth_terminal.aodv;

public class RreqPacket extends ReqRepBase{
    private int originSequence;

    public void setOriginSequence(int originSequence) {
        this.originSequence = originSequence;
    }

    public int getOriginSequence() {
        return originSequence;
    }
}

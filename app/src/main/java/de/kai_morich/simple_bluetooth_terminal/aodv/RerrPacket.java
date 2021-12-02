package de.kai_morich.simple_bluetooth_terminal.aodv;

import java.util.Base64;

public class RerrPacket extends Packet{
    private int pathCount;
    private int[] destAdresses;
    private int[] destSequences;
    private static final byte PADDING_BLOCK = (byte)0;
}

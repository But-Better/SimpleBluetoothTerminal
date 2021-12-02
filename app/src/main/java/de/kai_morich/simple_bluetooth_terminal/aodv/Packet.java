package de.kai_morich.simple_bluetooth_terminal.aodv;

import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

import java.util.Base64;

public abstract class Packet {

    private int messageType;
    private int flags;
    private int hopAddress;
    private int prevHopAddress;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public byte[] ToBase64(@NonNull String text) {
        return Base64.getDecoder().decode(text);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public String ToPlainText(@NonNull byte[] base64) {
        return Base64.getEncoder().encodeToString(base64);
    }

    //public abstract void addPath(Packet packet);

    public int getHopAddress() {
        return hopAddress;
    }

    public int getMessageType() {
        return messageType;
    }

    public int getFlags() {
        return flags;
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

    public void setMessageType(int messageType) {
        this.messageType = messageType;
    }

    public void setFlags(int flags) {
        this.flags = flags;
    }
}

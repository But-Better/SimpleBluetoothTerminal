package de.kai_morich.simple_bluetooth_terminal.aodv;

import androidx.annotation.NonNull;

import java.util.Arrays;
import java.util.Objects;

public class RoutingTabelle {

    private byte destination;
    private byte NextHop;
    private byte[] precursors;
    private byte metric;
    private byte sequenceNumber;
    private boolean isValid;

    public RoutingTabelle() {
    }

    public RoutingTabelle(byte destination, byte nextHop, @NonNull byte[] precursors, byte metric, byte sequenceNumber, boolean isValid) {
        this.destination = destination;
        NextHop = nextHop;
        this.precursors = precursors;
        this.metric = metric;
        this.sequenceNumber = sequenceNumber;
        this.isValid = isValid;
    }

    public byte getDestination() {
        return destination;
    }

    public void setDestination(byte destination) {
        this.destination = destination;
    }

    public byte getNextHop() {
        return NextHop;
    }

    public void setNextHop(byte nextHop) {
        NextHop = nextHop;
    }

    public byte[] getPrecursors() {
        return precursors;
    }

    public void setPrecursors(byte[] precursors) {
        this.precursors = precursors;
    }

    public byte getMetric() {
        return metric;
    }

    public void setMetric(byte metric) {
        this.metric = metric;
    }

    public byte getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(byte sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoutingTabelle that = (RoutingTabelle) o;
        return destination == that.destination && NextHop == that.NextHop && metric == that.metric && sequenceNumber == that.sequenceNumber && isValid == that.isValid && Arrays.equals(precursors, that.precursors);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(destination, NextHop, metric, sequenceNumber, isValid);
        result = 31 * result + Arrays.hashCode(precursors);
        return result;
    }

    @Override
    public String toString() {
        return "RoutingTabelle{" +
                "destination=" + destination +
                ", NextHop=" + NextHop +
                ", precursors=" + Arrays.toString(precursors) +
                ", metric=" + metric +
                ", sequenceNumber=" + sequenceNumber +
                ", isValid=" + isValid +
                '}';
    }
}

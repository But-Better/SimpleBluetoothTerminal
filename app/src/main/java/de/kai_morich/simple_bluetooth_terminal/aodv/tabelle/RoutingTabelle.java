package de.kai_morich.simple_bluetooth_terminal.aodv.tabelle;

import java.util.Arrays;
import java.util.Objects;

public class RoutingTabelle extends Tabelle {

    private int NextHop;
    private int[] precursors;
    private int sequenceNumber;
    private boolean isValid;

    public RoutingTabelle(int destination, int metrix, int nextHop, int[] precursors, int sequenceNumber, boolean isValid) {
        super(destination, metrix);
        NextHop = nextHop;
        this.precursors = precursors;
        this.sequenceNumber = sequenceNumber;
        this.isValid = isValid;
    }

    public int getNextHop() {
        return NextHop;
    }

    public void setNextHop(int nextHop) {
        NextHop = nextHop;
    }

    public int[] getPrecursors() {
        return precursors;
    }

    public void setPrecursors(int[] precursors) {
        this.precursors = precursors;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int sequenceNumber) {
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
        if (!super.equals(o)) return false;
        RoutingTabelle that = (RoutingTabelle) o;
        return NextHop == that.NextHop && sequenceNumber == that.sequenceNumber && isValid == that.isValid && Arrays.equals(precursors, that.precursors);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), NextHop, sequenceNumber, isValid);
        result = 31 * result + Arrays.hashCode(precursors);
        return result;
    }

    @Override
    public String toString() {
        return "RoutingTabelle{" +
                "NextHop=" + NextHop +
                ", precursors=" + Arrays.toString(precursors) +
                ", sequenceNumber=" + sequenceNumber +
                ", isValid=" + isValid +
                '}';
    }
}

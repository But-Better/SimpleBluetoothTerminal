package de.kai_morich.simple_bluetooth_terminal.aodv.tabelle;

import java.util.Objects;

public class Tabelle {

    private int destination;
    private int metrix;

    Tabelle(int destination, int metrix) {
        this.destination = destination;
        this.metrix = metrix;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public int getMetrix() {
        return metrix;
    }

    public void setMetrix(int metrix) {
        this.metrix = metrix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tabelle tabelle = (Tabelle) o;
        return destination == tabelle.destination && metrix == tabelle.metrix;
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, metrix);
    }

    @Override
    public String toString() {
        return "Tabelle{" +
                "destination=" + destination +
                ", metrix=" + metrix +
                '}';
    }
}

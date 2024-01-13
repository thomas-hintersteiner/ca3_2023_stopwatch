package at.wifi.codingacademy.stopwatch;

import java.util.Date;

public class StopWatch {
    // Attribute
    protected long startTime = 0;
    protected long stopTime = 0;

    // Konstruktoren
    public StopWatch() {

    }

    // Methoden (Funktion innerhalb einer Klasse)

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.stopTime = System.currentTimeMillis();
    }

    public void reset() {
        this.startTime = 0;
        this.stopTime = 0;
    }

    public long difference() {
        // Nur wenn Startzeitpunkt vor dem Stoppzeitpunkt liegt
        if (this.startTime < this.stopTime) {
            return this.stopTime - this.startTime;
        }
        return 0;
    }

    @Override
    public String toString() {
        int diff = (int) (this.difference() / 1000);

        int hours = (int) Math.floor(diff / 3600);
        diff = diff - (3600 * hours);

        int min = (int) Math.floor(diff / 60); // 4
        diff = diff - (60 * min);

        return hours + ":" + min + ":" + diff;
    }
}

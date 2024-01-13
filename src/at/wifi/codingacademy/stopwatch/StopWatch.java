package at.wifi.codingacademy.stopwatch;

import java.util.Date;

public class StopWatch {
    // Attribute
    protected Date startTime = null;
    protected Date stopTime = null;

    // Konstruktoren
    public StopWatch() {

    }

    // Methoden (Funktion innerhalb einer Klasse)

    public void start() {
        this.startTime = new Date();
    }

    public void stop() {
        this.stopTime = new Date();
    }

    public void reset() {
        this.startTime = null;
        this.stopTime = null;
    }

    public long difference() {
        // Nur wenn sowohl Startzeit und Stoppzeit gesetzt wurden und der Startzeitpunkt vor dem Stoppzeitpunkt liegt
        if (this.startTime != null && this.stopTime != null && this.startTime.before(this.stopTime)) {
            return this.stopTime.getTime() - this.startTime.getTime();
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

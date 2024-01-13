package at.wifi.codingacademy.stopwatch;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        System.out.println("Geben Sie bitte eine Zahl ein: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        stopWatch.stop();

        System.out.println(stopWatch);
    }

}

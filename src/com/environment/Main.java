package com.environment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LuckyNumber game = new LuckyNumber();
        game.runLuckyNumber();
    }
}

class LuckyNumber {
    // Define Fields
    private String secret = "4359";
    private int bulls;
    private int cows;
    private String input;

    // scan for guess by user input
    public void inputScan() {
        Scanner scanner = new Scanner(System.in);
        this.input = scanner.next();
    }

    // iterate through input characters and check if
    // any char from the secret code matches it
    // if it matches then cows increase
    // if the position of the char is the same then bulls increase
    // ! and the cows decrease because the position overrides the the correctness
    private void bullsCows() {
        for (int i = 0; i < input.length(); i++) {
            char cache = input.charAt(i);
            for (int y = 0; y < secret.length(); y++) {
                if (secret.charAt(y) == cache) {
                    cows++;
                }
            }
            if (input.charAt(i) == secret.charAt(i)) {
                bulls++;
                cows--;
            }
        }
    }

    // output method
    private void outPut() {
        if (bulls != 0 && cows == 0) {
            System.out.println("Grade: " + bulls + " bull(s). The secret code is " + secret + ".");
        } else if (cows != 0 && bulls == 0) {
            System.out.println("Grade: " + cows + " cow(s). The secret code is " + secret + ".");
        } else if (cows != 0 && bulls != 0) {
            System.out.println("Grade: " + bulls + " bull(s) and " + cows + " cow(s). The secret code is " + secret + ".");
        } else {
            System.out.println("Grade: None. The secret code is " + secret + ".");
        }
    }

    // launcher
    public void runLuckyNumber() {
        inputScan();
        bullsCows();
        outPut();
    }
}
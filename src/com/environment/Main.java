package com.environment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LuckyNumber game = new LuckyNumber();
        game.runLuckyNumber();
    }
}

class LuckyNumber {

    private int in1;
    private int in2;
    private int in3;
    private int in4;
    private int in5;
    private int in6;
    private int sumFirstThree;
    private int sumLastThree;

    private void inputScan() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        in1 = input.charAt(Integer.parseInt(String.valueOf(0)));
        in2 = input.charAt(Integer.parseInt(String.valueOf(1)));
        in3 = input.charAt(Integer.parseInt(String.valueOf(2)));
        in4 = input.charAt(Integer.parseInt(String.valueOf(3)));
        in5 = input.charAt(Integer.parseInt(String.valueOf(4)));
        in6 = input.charAt(Integer.parseInt(String.valueOf(5)));

    }

    private void sumInputs() {
        sumFirstThree = in1 + in2 + in3;
        sumLastThree = in4 + in5 + in6;
    }

    private void outPut() {
        if (sumLastThree == sumFirstThree) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }

    }

    public void runLuckyNumber() {
        inputScan();
        sumInputs();
        outPut();
    }
}

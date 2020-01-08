package app;

import java.util.Scanner;

public class App {

    public static double getRandomNumber() {
        final double x = Math.random();
        return Math.round(x * 10);
    }

    public static void main(final String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        input.close();
        System.out.println("Cash: " + number);
        while (number > 0) {
            number -= 5;
            final double slot1 = getRandomNumber();
            final double slot2 = getRandomNumber();
            final double slot3 = getRandomNumber();
            System.out.println("__________________");
            System.out.println("| " + slot1 + " | " + slot2 + " | " + slot3 + " |");
            System.out.println("__________________");
            if (slot1 == slot2 && slot1 == slot3) {
                int jackpot = number * 2;
                number += jackpot;
                System.out.println("WIN");
                System.out.println("Current Cash: " + number);
                Thread.sleep(5000);
            } else if (slot1 == slot2 || slot2 == slot3) {
                number += 15;
                System.out.println("WIN");
                System.out.println("Current Cash: " + number);
                Thread.sleep(5000);
            } else {
                System.out.println("LOSS");
                System.out.println("Current Cash: " + number);
                Thread.sleep(5000);

            }
        }
    }

}
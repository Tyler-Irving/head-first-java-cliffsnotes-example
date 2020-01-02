package app;

public class App {

    public static double getRandomNumber() {
        final double x = Math.random();
        return Math.round(x * 10);
    }

    public static void main(final String[] args) throws Exception {
        System.out.println("This app is demonstrating what I went over in chapter one of 'Head First JAVA'");
        while (true) {
            final double randomNumber = getRandomNumber();
            if (randomNumber > 5) {
                System.out.println("The number is greater than 5");
                break;
            } else if (randomNumber < 5) {
                System.out.println("The number is less than 5");
                break;
            } else if (randomNumber == 5) {
                System.out.println("The number is 5");
                break;
            }
        }
    }

}
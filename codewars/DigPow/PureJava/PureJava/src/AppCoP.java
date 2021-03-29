import java.util.Scanner;

public class AppCoP {
    public static void main(String[] args) {
        System.out.println("Ejercicio CoP");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your command: > ");
        String userCommand = scanner.nextLine();
        System.out.println("User command is: " + userCommand);
        boolean isRunning = true;

        // do {
        while (isRunning) {
            if (userCommand.length() == 0) {
                System.out.println("Try again typing something");
                System.out.println("Please enter your command: > ");
            } else if (userCommand.equalsIgnoreCase("start")) {
                System.out.println("let's start");
                break;
            } else if (userCommand.equalsIgnoreCase("stop")) {
                System.out.println("let's stop");
                break;
            } else if (userCommand.equalsIgnoreCase("quit")) {
                System.out.println("let's quit");
                break;
            } else if (!(userCommand.equalsIgnoreCase("start")) && !(userCommand.equalsIgnoreCase("stop"))
                    && !(userCommand.equalsIgnoreCase("quit"))) {
                System.out.println("Unreconizable command");
                System.out.println("Please enter your command: > ");
            }
            userCommand = scanner.nextLine();
        }
        // } while (isRunning == true);

        scanner.close();
    }

}

package AD181.Gezha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int input = Main.readNumber();
        Main.evenOrOdd(input);
    }

    private static int readNumber() {
        Scanner console = new Scanner(System.in);
        System.out.print("Input an integer number: ");

        // repeats input request until an integer is given
        while(!console.hasNextInt()) {
            console.nextLine();
            System.out.print("Input is incorrect, please input an integer number: ");
        }

        return console.nextInt();
    }

    private static void evenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even");
        } else {
            System.out.println("The number " + number + " is odd");
        }
    }
}

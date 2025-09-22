import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age: ");

        if (in.hasNextInt()) {
            int age = in.nextInt();
            in.nextLine();

            if (age >= 21) {
                System.out.println("You get a paper wrist band.");
            }
        } else {
            String trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
        }

        in.close();


    }
}
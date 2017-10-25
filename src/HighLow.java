import java.util.Scanner;
import java.util.Random;

public class HighLow {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int random = random();
        int number;

        do {
            System.out.print("Guess a number 1-100: ");
            while (!scan.hasNextInt()) {
                scan.next();
            }
            number = scan.nextInt();

        } while ((number < 1) || (number > 100));

        do {
            if(number < random) {
                System.out.print("HIGHER: ");
                number = scan.nextInt();
            } else if (number > random){
                System.out.print("LOWER: ");
                number = scan.nextInt();
            }

        } while(number != random);

        System.out.print("GOOD GUESS!");

        }
    private static int random() {

        Random rand = new Random();
        int value = rand.nextInt(100) + 1;
        return value;

    }
}




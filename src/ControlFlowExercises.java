import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String yesorno = "yes";

        char symbol = '-';
        char grade = 'F';

        do {

            //enter an int 0-100
            System.out.print("Enter a number 0-100: ");
            int integer = scan.nextInt();
            int second = (integer % 10);
            if (integer < 100) {
                if (second < 5) {
                    symbol = '-';
                } else {
                    symbol = '+';
                }
            }

            if ((integer >= 60) && (integer < 70)) {
                grade = 'D';
            } else if ((integer >= 70) && (integer < 80)) {
                grade = 'C';
            } else if ((integer >= 80) && (integer < 90)) {
                grade = 'B';
            } else if (integer >= 90) {
                grade ='A';
            } else {
                grade = 'F';
            }

            System.out.println("Your grade is " + grade + symbol + "\n");

        } while (yesorno == "yes");

    }

}









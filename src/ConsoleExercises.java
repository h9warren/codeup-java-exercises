import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
//        int userString;
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        userString = scan.nextInt();
//
//        System.out.println("You entered: --> \"" + userString + "\" <--");

//        String userString;
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter 3 words: ");
//        userString = scan.next();
//        String userString2 = scan.next();
//        String userString3 = scan.next();
//
//        System.out.println("You entered: --> \"" + userString + userString2 + userString3 + "\" <--");

//        String sentence;
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Type a sentence: ");
//        sentence = scan.nextLine();
//
//        System.out.println("You entered: --> \"" + sentence + "\" <--");


        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the room's width: ");
        float width = scan.nextFloat();
        System.out.print("Enter the room's length: ");
        float length = scan.nextFloat();

        float area = (2 * length) + (2 * width);
        System.out.print(area);


    }
}



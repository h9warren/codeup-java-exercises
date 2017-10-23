import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
//        System.out.print("Hello ");
//        System.out.print("World");
//        int myFavoriteNumber = 13;
//        System.out.print(myFavoriteNumber);
//        String myString = "Great String";
//        float myNumber = 3.14f;
//        System.out.print(myNumber);
//        System.out.print(myString);
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//        String name = "Michael";
//        System.out.println(name);
//        int x = 4;
//        x = x + 5;
            String userInput;
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter something: ");
            userInput = sc.nextLine();

            System.out.println("You entered: --> \"" + userInput + "\" <--");
    }
}




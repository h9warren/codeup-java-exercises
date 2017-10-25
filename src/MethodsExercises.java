import java.util.Scanner;

public class MethodsExercises {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long add = addition(5, 6);
        long sub = subtraction(5, 6);
        long div = division(5, 6);
        long mult = multiplication(5, 6);
        long mod = modulus(72, 9);
        System.out.println(add);
        System.out.println(sub);
        System.out.println(div);
        System.out.println(mult);
        System.out.println(mod);
        range(3, 20, scan);
        factorial(range(3, 20, scan));
    }

    private static long addition(long num1, long num2) {
        return (num1 + num2);
    }

    private static long subtraction(long num1, long num2) {
        return (num1 - num2);
    }

    private static long division(long num1, long num2) {
        return (num1 / num2);
    }

    private static long multiplication(long num1, long num2) {
        return (num1 * num2);
    }

    private static long modulus(long num1, long num2) {
        return (num1 % num2);
    }

    private static int range(int min, int max, Scanner scan) {
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int intake = scan.nextInt();
        if ((intake < 1) || (intake > 10)) {
            System.out.print("Invalid Input: " + intake);
            return range(min, max, scan);
        } else {
            System.out.print("Valid Input: " + intake);
            return intake;
        }
    }

    private static int factorial(int number) {

        int otherNum = 1;
        String concat = "";
        for (int i = 1; i <= number; i++) {
            concat += (i == 1) ? i : " x " + i;
            System.out.println(i + " ! = " + concat + " = " + (otherNum *= i));
        }

        return 0;

    }
}

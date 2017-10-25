import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args){

        long add = addition(5,6);
        long sub = subtraction(5,6);
        long div = division(5,6);
        long mult = multiplication(5,6);
        long mod = modulus(72, 9);
        System.out.println(add);
        System.out.println(sub);
        System.out.println(div);
        System.out.println(mult);
        System.out.println(mod);
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

}

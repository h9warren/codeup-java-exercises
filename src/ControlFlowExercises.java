import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String yesorno = "yes";

        while((yesorno == "yes")) {

            System.out.println("What number would you like to go up to? ");
            int integer = scan.nextInt();

            String table = "\nHere is your table";
            System.out.println(table + "\n");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            for(int i = 0; i <= integer; i++) {

                System.out.printf("%-6s", (int)Math.pow(i,1));
                System.out.print(" | ");
                System.out.printf("%-7s", (int)Math.pow(i,2));
                System.out.print(" | ");
                System.out.printf("%-6s", (int)Math.pow(i,3));
                System.out.printf("\n");
            }
            System.out.println("\nWould you like to continue?");

            String response = scan.next();

            if (! response.equals("yes")) {
                break;
            }

        }

    }

}










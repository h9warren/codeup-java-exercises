import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean bob = true;
        while(bob == true) {
            System.out.print("Say something to bob: ");
            String input = sc.nextLine();

            int length = input.length();
            char tone = input.charAt(length-1);



            switch (tone) {
                case '!':
                    System.out.println("Whoa, chill out!");
                    break;
                case '?':
                    System.out.println("Sure.");
                    break;
                case 'b':
                    if (input.equalsIgnoreCase("bob")){
                    System.out.println("Fine. Be that way!");
                    } else {
                    System.out.println("Whatever.");
                    }
                    break;
                default:
                    System.out.println("Whatever.");
                    break;

            }
        }
    }
}

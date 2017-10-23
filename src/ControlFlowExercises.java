public class ControlFlowExercises {

    public static void main(String[] args) {

        long num = 2;

        do {

            System.out.println(num);
            num = num * num;

        } while (num < 1000000);
    }

}

public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); // TODO: Read the first string argument (replace this line)
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int numOdd = 0;
        int a = 1;
        int b = 1;

        for (int i = 0; i < x; i++) {
            int current;
            if (i == 0 || i == 1) {
                current = 1;
            } else {
                current = a + b;
                a = b;
                b = current;
            }

            System.out.print(current);
            if (current % 2 != 0) {
                numOdd++;
            }
            if (i < x - 1)
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}

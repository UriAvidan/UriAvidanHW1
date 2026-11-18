
public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);

        int[] fibonacciArr = new int[x];
        System.out.println("The first " + x + " Fibonacci numbers are:");

        for (int i = 1; i <= x; i++) {
            fibonacciArr[i - 1] = (int) ((Math.pow((1 + Math.sqrt(5)), (double) i) - (Math.pow((1 - Math.sqrt(5)), i)))
                    / ((Math.pow(2.0, i)) * Math.sqrt(5.0)));
        }

        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            System.out.print(fibonacciArr[i]);
            if (fibonacciArr[i] % 2 == 1)
                numOdd++;
            if (i < x - 1)
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();

        //////////////////////////////////////////////////

        System.out.println("The number of odd numbers is: " + numOdd);
    }
}

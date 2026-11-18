public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;

        double input = Integer.parseInt(args[0]);

        for (int i = 1; i <= input; i++) {
            approxPi += (Math.pow(-1, i + 1)) * (1.0 / ((2.0 * i) - 1.0));

        }
        approxPi *= 4;

        System.out.println(approxPi + " " + actualPi);
    }
}

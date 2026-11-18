public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String str : args) {
            char ch = str.charAt(0);
            if ((int) ch % 5 == 0) {
                System.out.println(ch);
            }
        }

    }
}

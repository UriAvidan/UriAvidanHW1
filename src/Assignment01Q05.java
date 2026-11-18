import java.util.Arrays;

public class Assignment01Q05 {

    public static int findShortestPath(int[][] m, int i, int j) {
        // System.out.println("===================");
        return findShortestPathRecursion(m, i, j, 0, i);
    }

    public static int findShortestPathRecursion(int[][] m, int i, int j, int hops, int root) {
        // System.out.println("new call: " + i + " " + j + " " + hops + " " + root);
        if (j == i)
            return hops;
        if (i == root && hops != 0)
            return -1;
        int[] routsArray = new int[m[i].length];
        for (int index = 0; index < m[i].length; index++) {
            if (m[i][index] == 1) {
                routsArray[index] = findShortestPathRecursion(m, index, j, hops + 1, root);
            } else {
                routsArray[index] = -1;
            }
        }

        // System.out.println("the hop: " + hops + " res:" +
        // Arrays.toString(routsArray));

        if (max(routsArray) == -1) {
            // System.out.println("no match here!");
            return -1;
        } else {
            // System.out.println("this is the minimal hops:" + min(routsArray));
            return min(routsArray);
        }

    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (min == -1 || (num < min && num != -1)) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(
                findShortestPath(new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }, 0, 1)); // -1
        System.out.println(
                findShortestPath(new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }, 1, 1)); // 0
        System.out.println(
                findShortestPath(new int[][] { { 0, 1, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 1 }, { 1, 0, 0, 0 } }, 0, 2)); // 2
        System.out.println(
                findShortestPath(new int[][] { { 0, 1, 0, 1 }, { 0, 0, 0, 1 }, { 0, 0, 0, 0 }, { 0, 0, 1, 0 } }, 0, 2)); // 2
    }
}
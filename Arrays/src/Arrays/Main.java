package Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ArrayTasks.even(5)));
        System.out.println(ArrayTasks.allSimilar(new int[]{2, 2, 2, 2}));
        System.out.println(ArrayTasks.hasSimilar(new int[]{2, 1, 2, 5}));
        System.out.println(ArrayTasks.mean(new int[]{2, 2, 3, 4}));
        int[] a = {1, 2, 3 ,4};
        ArrayTasks.shift(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(ArrayTasks.copyShift(a)));
        int[][] b = new int[5][3];
        MultidimentionalArrays.fillArray(b);
        System.out.println("----------------------");
        MultidimentionalArrays.printTable(b);
        System.out.println("----------------------");
        MultidimentionalArrays.printTableAligned(b);
        MultidimentionalArrays.thirdTask();
    }
}

class ArrayTasks {
    public static int[] even(int n) {
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = (i + 1) * 2;
        }
        return x;
    }
    public static boolean allSimilar(int[] a) {
        if (a.length < 2) {   return true;   }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] != a[j]) {   return false;   }
            }
        }
        return true;
    }
    public static boolean hasSimilar(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {   return true;   }
            }
        }
        return false;
    }
    public static double mean(int[] a) {
        double s = 0;
        for (int j : a) {
            s += j;
        }
        s /= a.length;
        return s;
    }
    public static void shift(int[] a) {
        int buf = a[a.length-1];
        for (int i = a.length-1; i > 0; i--) {
            a[i] = a[i-1];
        }
        a[0] = buf;
    }
    public static int[] copyShift(int[] a) {
        int[] b = a.clone();
        int buf = b[b.length-1];
        for (int i = b.length-1; i > 0; i--) {
            b[i] = b[i-1];
        }
        b[0] = buf;
        return b;
    }
}

class MultidimentionalArrays {
    public static void fillArray(int[][] a) { //создаёт двумерный массив с равновероятным количеством разрядов у элем.
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int digit_number  = 1 + (int) (Math.random() * 5);
                int random_number = 0;
                if (digit_number == 1) { random_number = (int) (Math.random() * 9); }
                if (digit_number == 2) { random_number = (int) (Math.random() * 99); }
                if (digit_number == 3) { random_number = (int) (Math.random() * 999); }
                if (digit_number == 4) { random_number = (int) (Math.random() * 9999); }
                if (digit_number == 5) { random_number = (int) (Math.random() * 99999); }
                a[i][j] = random_number;
            }
        }
    }
    public static void printTable(int[][] matrix) {
        for (int[] row : matrix) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void printTableAligned(int[][] matrix) {
        for (int[] row : matrix) {
            for (int i : row) {
                System.out.printf("%6d", i);
            }
            System.out.println();
        }
    }

    public static void thirdTask () {
        char[][] c = createTable(20, '.');
        System.out.println("- Изначальный масс.: -");
        printTableAligned(c);

        System.out.println("- Заполним строки: -");
        fillFirstAndLastLines(c, '#');
        printTableAligned((c));

        System.out.println("- Заполним столбцы: -");
        fillFirstAndLastColumns(c, '#');
        printTableAligned((c));
    }
    private static void printTableAligned(char[][] matrix) {
        for (char[] row : matrix) {
            for (int i : row) {
                System.out.printf(Character.toString(i));
            }
            System.out.println();
        }
    }
    private static char[][] createTable(int x, char s) {
        char[][] c = new char[x][x];
        for (char[] row: c)
            Arrays.fill(row, s);
        return c;
    }
    private static void fillFirstAndLastLines(char[][] matrix, char s) {
        Arrays.fill(matrix[0], s);
        Arrays.fill(matrix[matrix.length - 1], s);
    }
    private static void fillFirstAndLastColumns(char[][] matrix, char s) {
        for (char[] row: matrix) {
            row[0] = s;
            row[matrix.length - 1] = s;
        }
    }
}
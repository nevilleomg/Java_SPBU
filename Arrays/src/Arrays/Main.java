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
        MultidimentionalArrays.printTable(b);
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
    public static void fillArray(int[][] a) {
        for (int[] ints : a) {
            Arrays.fill(ints, 5);
        }
    }
    public static void printTable(int[][] a) {
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + ' ');
            }
            System.out.println();
        }
    }
    public static void printTableAligned(int[][] a) {
        
    }
}
import java.util.Scanner;

public class IntroTasks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(introTask3Digits(num));
        num = in.nextInt();
        System.out.println(IntroTaskLast5(num));
        num = in.nextInt();
        System.out.println(IntroTaskSameDigits(num));
        num = in.nextInt();
        System.out.println(IntroTaskLeap(num));
        num = in.nextInt();
        System.out.println(IntroTaskCat(num));
        num = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        System.out.println(IntroTaskQuadraticEquation(num, num2, num3));
        num = in.nextInt();
        System.out.println(PrimalityTest(num));
        in.close();
    }

    private static boolean introTask3Digits(int x) {
        return Math.abs(x) > 99 && Math.abs(x) < 1000;
    }

    private static boolean IntroTaskLast5(int x) {
        return Math.abs(x) % 10 == 5;
    }

    private static boolean IntroTaskSameDigits(int x) {
        return Math.abs(x) % 10 == (Math.abs(x) / 10) % 10;
    }

    private static boolean IntroTaskLeap(int x) {
        return x % 100 != 0 && x % 4 == 0 || x % 400 == 0;
    }

    private static String IntroTaskCat(int x) {
        String s = x + " ";
        if (x % 100 > 4 && x % 100 < 21) {
            s += "котов";
            return s;
        }
        if (x % 10 == 0 || x % 10 >= 5) s += "котов";
        if (x % 10 == 1) s += "кот";
        if (x % 10 > 1 && x % 10 < 5) s += "кота";
        return s;
    }

    private static String IntroTaskQuadraticEquation(int a, int b, int c) {
        if (a == 0 && c == 0 && b == 0) {
            return "решений бесконечно много";
        }
        if (a == 0 && c == 0) {
            return "одно решение x = 0";
        }
        if (a == 0) {
            return "одно решение x = " + -c / b;
        }
        int D = b * b - 4 * a * c;
        if (D < 0) {
            return "решений нет";
        } else if (D == 0) {
            return "одно решение x = " + -(b / 2 / a);
        } else {
            return "два решения x1 = " + (-b + Math.sqrt(D)) / 2 / a + " x2 = " + (-b - Math.sqrt(D)) / 2 / a;
        }
    }

    private static boolean PrimalityTest(int x) {
        for (int i = 2; i <= Math.round(Math.sqrt(x)); i++) {
            if (x % i == 0) {
                return false;
            } // true - простое число, false - нет
        }
        return true;
    }
}
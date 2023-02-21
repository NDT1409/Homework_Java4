package homework.second;

import java.util.Scanner;

public class Second {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please type 1st amount:");
        int a = sc.nextInt();
        System.out.println("Please type 2nd amount:");
        int b = sc.nextInt();

        int add = add(a, b);
        System.out.println("Addition results: " + add);
        int sub = sub(a, b);
        System.out.println("Subtraction results: " + sub);
        int mult = mult(a, b);
        System.out.println("Multiplication result: " + mult);
        int div = div(a, b);
        System.out.println("Division result: " + div);
    }
    private static int add(int a, int b) {
        int x = a + b;
        return x;
    }

    private static int sub(int a, int b) {
        int x = a - b;
        return x;
    }
    private static int mult(int a, int b) {
        int x = a * b;
        return x;
    }
    private static int div(int a, int b) {
        int x = a / b;
        return x;

    }

}

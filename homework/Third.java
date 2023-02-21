package homework;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please type the amount in US dollar:");
        int a = sc.nextInt();

        double euro = curr(a);
        System.out.println("Result in Euro: " + euro);
    }

    private static double curr(int a) {
        double x = a * 0.94;
        return x;
    }

}

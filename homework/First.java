package homework;

import java.util.Scanner;

public class First {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("please type 2 words in separate lines: ");

        String phrase1 = scan.nextLine();
        String phrase2 = scan.nextLine();

        System.out.println("Answer: " +
                (phrase1.substring(0, (phrase1.length()/2)) +
                phrase2.substring(phrase2.length()/2)));
    }

}

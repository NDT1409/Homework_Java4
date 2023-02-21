package homework;


public class Fourth {

//    Напишите программу, которая подсчитает, сколько дополнительных калорий будет, если вы купите
//    пиццу диаметром 28 см вместо пиццы диаметром 24 см. Будем считать, что в каждом квадратном
//    сантиметре пиццы содержится 40 калорий.

    public static void main(String[] args) {
        int a = 24;
        int b = 28;
        int c = 40;

        double pizza24 = cal1(a);
        double pizza28 = cal2(b);
        System.out.println("Extra calories in 28 cm2 pizza will be: " +
                (pizza28 - pizza24) * c);
    }
    private static double cal1(int a) {
        double x = a * 3.14;
        return x;
    }

    private static double cal2(int b) {
        double x = b * 3.14;
        return x;
    }
}

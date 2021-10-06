package lesson3;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println(doOne(3, 5));
        doTwo(-5);
        System.out.println(doThree(-7));
        doFour("Привет", 3);
        doFive(2021);
        int currentYear = 2000;
        System.out.println("Year " + currentYear + " is Leap? > " + doFive(currentYear));
    }

    public static boolean doOne(int x1, int x2) {
        System.out.println("Задание 1.");
        int sum = x1 + x2;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    public static void doTwo(int x) {
        System.out.println("Задание 2.");
        if (x >= 0) {
            System.out.println("Число " + x + " положительное");
        } else {
            System.out.println("Число " + x + " отрицательное");
        }
    }

    public static boolean doThree(int x) {
        System.out.println("Задание 3.");
        if (x < 0) return true;
        return false;
    }

    public static void doFour(String word, int times) {
        System.out.println("Задание 4.");
        for (int i = 0; i < times; i++) {
            System.out.println("String#" + i + ": " + word);
        }
    }

    public static boolean doFive(int year) {
        System.out.println("Задание 5.");
        return  (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}

}

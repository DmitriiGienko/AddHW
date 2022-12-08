import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("_____Задача1_____");

        System.out.println("Введите переменную A ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Введите переменную B");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();

        int cel = a / b;
        int ost = a % b;

        System.out.println("Результат деления " + a + " и " + b + " будет равен: " + cel + " целых и в остатке " + ost);

    }

    public static void task2() {
        System.out.println("_____Задача2_____");

        System.out.println("Введите переменную не больше 99");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(); //44
        if (a <= 99) {
            int dec = a / 10;
            int ed = a % 10;
            int rez = dec + ed;
            System.out.println(rez);
        } else System.out.println("Ввел не то что сказано было!");
    }

    public static void task3() {
        System.out.println("_____Задача3_____");

        System.out.println("Введите переменную не больше 999");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(); //44
        if (a <= 999) {
            int sot = a / 100;
            int dec = (a / 10) % 10;
            int ed = a % 10;
            int rez = dec + ed + sot;
            System.out.println("Сумма цифр числа " + a + " равна " + rez);
        } else System.out.println("Ввел не то что сказано было!");
    }

    public static void task4() {
        System.out.println("_____Задача4_____");

        System.out.println("Введите цену цветов ");
        Scanner input = new Scanner(System.in);
        int flower = input.nextInt();
        System.out.println("Введите цену открытки");
        Scanner sc2 = new Scanner(System.in);
        int picture = sc2.nextInt();
        int price = (int) ((flower + picture) * 0.9);
        System.out.println("Букет обошелся в " + price + " рублей. Сумма скидки- " + ((flower + picture) - price));
    }


}
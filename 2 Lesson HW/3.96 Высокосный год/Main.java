public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите год");

        int g = sc.nextInt();

        //Условие адекватности год не может быть отрицательным;

        if (g <= 0) {
            System.out.println("Нарушено условие задачи");
        }

        /*
         *Если год без остачи делится на 4;
         *но с остачей на 100 - это не высокосный год;
         */

        System.out.println("Является ли год высокосным?");

        if ((g%4 == 0 && g%100!=0)||g%400 == 0) {
            System.out.println("да");
        }   else {
            System.out.println("нет");
            }
        }
    }

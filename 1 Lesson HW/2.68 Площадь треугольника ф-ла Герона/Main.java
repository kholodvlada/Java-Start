public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите сторону а");
        double a = sc.nextInt();
        if (a > 0) {
            System.out.println("Введите сторону b");
        } else {
            System.out.println("Нарушено условие задачи");
        }
        double b = sc.nextInt();
        if (b > 0) {
            System.out.println("Введите сторону c");
        } else {
            System.out.println("Нарушено условие задачи");
        }
        double c = sc.nextInt();
        if (c > 0) {
            if (a + b > c && a + c > b && b + c > a) {
                double p = (a + b + c) / 2;
                double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                System.out.println("Площадь треугольника = " +s);
            }
            else {
                System.out.println("Фигура не является треугольником!");
            }
        }
        else {
            System.out.println("Нарушено условие задачи");
            }


        }
    }

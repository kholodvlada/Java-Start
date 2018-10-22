public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите радиус круга");
        double r = sc.nextInt();

        if (r > 0) {
            double c = 2 * r * Math.PI;
            System.out.println("Длина окружности = " + c);
        } else {
            System.out.println("Условия задачи нарушены");
        }
    }
}

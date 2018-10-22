public class Main {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int x;

            System.out.println("Введите 5-е число");

            x = number.nextInt();

        int x5 = x%10;
            x = x/10;
        int x4 = x%10;
            x = x/10;
        int x3 = x%10;
            x = x/10;
        int x2 = x%10;
            x = x/10;
        int x1 = x%10;

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);

    }
}

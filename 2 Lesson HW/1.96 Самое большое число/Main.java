public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число №1");
            int n1 = sc.nextInt();

            System.out.println("Введите число №2");
                int n2 = sc.nextInt();

                System.out.println("Введите число №3");
                    int n3 = sc.nextInt();

                    System.out.println("Введите число №4");
                        int n4 = sc.nextInt();
    int nmax;

    if (n1>=n2) {
        nmax = n1;
        }
        else {
        nmax = n2;
        }
    if (nmax<=n3){
        nmax = n3;
        }
    if (nmax<=n4) {
        nmax = n4;
        }
        System.out.println("Самое большое число = "+ nmax);
        }
}

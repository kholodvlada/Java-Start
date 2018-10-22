public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите № квартиры");

            double x = sc.nextInt();
            int p;
            double e;

            if (x<1 || x>144){
                System.out.println("Такой квартиры нет в доме");
            }
            else {
                p = x<=36 ? 1 : 0;
                if (p!=0) {
                    x = x-(36*(p-1));
                    e = Math.ceil(x/4);
                    System.out.println("Этаж " + e);
                    System.out.println("Подъезд " + p);
                }
                p = x>=37 && x<=72 ? 2: 0;
                if (p!=0) {
                    x = x-(36*(p-1));
                    e = Math.ceil(x/4);
                    System.out.println("Этаж " + e);
                    System.out.println("Подъезд " + p);
                }
                p = x>=73 && x<=108 ? 3: 0;
                if (p!=0) {
                    x = x-(36*(p-1));
                    e = Math.ceil(x/4);
                    System.out.println("Этаж " + e);
                    System.out.println("Подъезд " + p);
                }
                p = x>=109 ? 4: 0;
                if (p!=0) {
                    x = x-(36*(p-1));
                    e = Math.ceil(x/4);
                    System.out.println("Этаж " + e);
                    System.out.println("Подъезд " + p);
                }
                }
    }

}

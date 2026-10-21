public class Main {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}

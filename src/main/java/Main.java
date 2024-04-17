import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe:");

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        System.out.println("Podaj znak:");
        char sign = scanner.next().charAt(0);
        System.out.println("");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(sign + " ");
            }
            System.out.println();
        }
    }
}
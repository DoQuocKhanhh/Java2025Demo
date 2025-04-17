import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhập số nguyên dương: ");
            n = scanner.nextInt();
        } while (n <= 0);

        long giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }

        System.out.println("Giai thừa của " + n + " là: " + giaiThua);
        scanner.close();
    }
}

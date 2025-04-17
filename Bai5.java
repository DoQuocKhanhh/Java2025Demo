import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tong = 0;

        while (tong <= 100) {
            System.out.print("Nhập một số nguyên: ");
            int so = scanner.nextInt();
            tong += so;
        }

        System.out.println("Tổng các số đã nhập là: " + tong);
        scanner.close();
    }
}

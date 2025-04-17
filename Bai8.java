import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử n: ");
        int n = scanner.nextInt();

        int tong = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập số thứ " + i + ": ");
            int so = scanner.nextInt();
            tong += so;
        }

        double trungBinh = (double) tong / n;
        System.out.println("Trung bình cộng là: " + trungBinh);
        scanner.close();
    }
}

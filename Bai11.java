import java.util.Arrays;
import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] A = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

        System.out.println("Mảng ban đầu: " + Arrays.toString(A));

        Arrays.sort(A);

        System.out.println("Mảng sau khi sắp xếp tăng dần: " + Arrays.toString(A));
    }
}

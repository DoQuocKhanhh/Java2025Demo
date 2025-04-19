import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi (không quá 80 ký tự): ");
        String str = scanner.nextLine();

        if (str.length() > 80) {
            System.out.println("Chuỗi vượt quá 80 ký tự.");
            return;
        }

        System.out.println("Nhập ký tự cần đếm: ");
        char ch = scanner.next().charAt(0);

        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) count++;
        }

        System.out.println("Số lần xuất hiện của '" + ch + "': " + count);
    }
}
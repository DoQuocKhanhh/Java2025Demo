import java.util.Scanner;
import java.time.Year;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập tên và năm sinh
        System.out.print("Nhập tên: ");
        String ten = scanner.nextLine();

        System.out.print("Nhập năm sinh: ");
        int namSinh = scanner.nextInt();

        // Tính tuổi
        int namHienTai = Year.now().getValue();
        int tuoi = namHienTai - namSinh;

        // Phân loại tuổi
        if (tuoi < 16) {
            System.out.println("Bạn " + ten + " ở độ tuổi vị thành niên.");
        } else if (tuoi >= 16 && tuoi < 18) {
            System.out.println("Bạn " + ten + " ở độ tuổi trưởng thành.");
        } else {
            System.out.println("Bạn " + ten + " đã trưởng thành.");
        }

        scanner.close();
    }
}

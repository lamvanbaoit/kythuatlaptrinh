import java.util.Scanner;

public class Bai115 {
    // Viết chương trình nhập họ tên, điểm toán, điểm văn của 1 học sinh. Tính điểm trung bình và xuất ra kết quả.
    public static void trungbinh(float a, float b){
        float s = (float) (a + b) / 2;
        System.out.println("Diem trung binh " + s);
    }

    public static void main(String[] argc){
        System.out.println("Nhap ho ten: ");
        Scanner sc1 = new Scanner(System.in);
        String hoten = sc1.nextLine();
        System.out.println("Ho va Ten: " + hoten);
        System.out.println("Nhap toan va van: ");
        Scanner sc2 = new Scanner(System.in);
        float toan = sc2.nextInt();
        float van = sc2.nextInt();
        trungbinh(toan,van);
    }
}

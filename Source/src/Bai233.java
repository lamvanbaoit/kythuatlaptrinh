import java.util.Scanner;

public class Bai233 {
    // Bài 233: Hãy liệt kê tần suất của các giá trị xuất hiện trong dãy.
    // Lưu ý: mỗi giá trị liệt kêt tần suất 1 lần
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int KiemTraBiTrung(int a[], int n, int vitri){
        for (int i = vitri - 1; i >= 0; i--) {
            if (a[i] == a[vitri]) {
                return 0; // bi trung
            }
        }
        return 1; // ko bi trung
    }
    // Đếm xem từ vị trí hiện tại trở về sau có bao nhiêu phần tử bị trùng
    public static int DemSoLuongPhanTuTrung(int a[], int n, int vitri){
        int dem = 1;
        for (int i = vitri + 1; i < n; i++) {
            if (a[i] == a[vitri]) {
                dem++;
            }
        }
        return dem++;
    }

    public static void Bai233(int[] a, int n){
        for (int i = 0; i < n; i++) {
            if (KiemTraBiTrung(a,n,i) == 1) {
                    int dem = DemSoLuongPhanTuTrung(a,n,i);
                    System.out.println("Phan tu " + a[i] + " xuat hien " + dem + " lan" );
            }
        }
    }


    public static void xuatmang(int[] a) {
        System.out.print("Các phần tử của mảng là: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);
        Bai233(a, n);
        xuatmang(a);
    }
}

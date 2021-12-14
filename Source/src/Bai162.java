import java.util.Scanner;

public class Bai162 {
// 162. Cho mảng một chiều các số thực. Hãy viết hàm tìm một vị trí trong mảng
// thỏa hai điền kiện: có hai giá trị lân cận và giá trị tại vị trí đó bằng tích hai giá trị lân cận.
// Nếu mảng không tồn tại giá trị như vậy thì hàm trả về giá trị - 1.
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void xuatmang(int[] a) {
        System.out.print("Các phần tử của mảng là: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\t ");
    }

    public static int Bai162(int[] a, int n){
        int i = 1;
        for ( ; i < n - 1; i++) {
            if (a[i] == a[i-1] * a[i+1]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] argc) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);
        int kq = Bai162(a, n);
        System.out.println("Vi tri thoa dieu kien la: " + kq);

        xuatmang(a);
    }
}

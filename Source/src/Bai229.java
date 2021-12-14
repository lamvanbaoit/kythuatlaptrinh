import java.util.Scanner;

public class Bai229 {
    // Bài 229: Đếm số lượng các giá trị phân biệt có trong mảng
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int Bai229(int[] a, int n){
        int dem = 0, flag;
        for (int i = 0; i < n; i++) {
            flag = 1;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                dem++;
            }
        }
        return dem;
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
        int KQ = Bai229(a, n);
        System.out.println("So luong cac gia tri phan biet trong mang: " + KQ);
        xuatmang(a);
    }
}

import java.util.Scanner;

public class Bai176 {
    // Bài 176: Hãy liệt kê các số âm trong mảng 1 chiều các số thực.

    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void Bai176(int a[], int n){
        for (int i = 0; i < n; i++) {
            if (a[i] < 0){
                System.out.print("Các số âm trong mảng là: " + a[i]);
            }
        }
        System.out.println();
    }

    public static void xuatmang(int[] a) {
        System.out.print("Các phần tử của mảng là: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc){
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);
        Bai176(a, n);
        xuatmang(a);
    }
}

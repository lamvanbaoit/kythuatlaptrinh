import java.util.Scanner;

public class Bai283 {
    // Bài 283: Đảo ngược mảng ban đầu
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }


    public static void Bai283(int a[], int n)
    {
        int temp = 0;
        for(int i = 0, j = n - 1; i < j; i++, j--)
        {
            temp = a[j];
            a[j] = a[i];
            a[i] = temp;
        }
    }

    public static void xuatmang(int[] a) {
        System.out.println("Các phần tử của mảng là: ");
        for(int i = 0; i < a.length; i++) {
            System.out.println("Mang dao nguoc: " + a[i]);
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);
        Bai283(a,n);
        xuatmang(a);
    }
}

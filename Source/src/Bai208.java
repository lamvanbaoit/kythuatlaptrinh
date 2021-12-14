import java.util.Scanner;

public class Bai208 {
    // Bài 208: Tính tổng các giá trị chính phương trong mảng 1 chiều các số nguyên
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static boolean KiemTraChinhPhuong(int n)
    {
        return Math.sqrt((float)n) == (int)Math.sqrt((float)n);
    }

    public static int Bai208(int[] a, int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(KiemTraChinhPhuong(a[i]) == true)
                sum += a[i];
        }
        return sum;
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
        int KQ = Bai208(a, n);
        System.out.println("Sum = " + KQ);
        xuatmang(a);
    }
}

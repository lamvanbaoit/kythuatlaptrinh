import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Bai151 {
    // Hãy tìm số nguyên tố lớn nhất trong mảng 1 chiều các số nguyên. Nếu mảng không có số nguyên tố thì trả về 0 (or -1)
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static boolean kiemtrasonguyento(int n){
        if(n < 2)
            return false;
        for(int i = 2; i <= sqrt(n); ++i){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static int Bai151(int[] a, int n) {
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max && kiemtrasonguyento(a[i]) )
                max = a[i];
        }
        if( kiemtrasonguyento(n) == false )
            return 0;
        else
            return max;
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = nhapmang(n);

        int kq = Bai151(a,n);
        System.out.println("Số nguyên tố lớn nhất trong mảng: " + kq);
        xuatmang(a);
    }
}

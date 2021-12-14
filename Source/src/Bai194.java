import java.util.Scanner;

public class Bai194 {
//    Bài 194: Cho mảng 1 chiều các số nguyên có nhiều hơn 2 giá trị.
//    Hãy viết hàm liệt kê các cặp giá trị gần nhau nhất
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void Bai194(int a[], int n){
        int i, j;
        int khoangCachGanNhat = Math.abs(a[0] - a[1]);
        for(i = 0; i < n; i++)
        {
            for(j = i + 1; j < n - 1; j++)
            {
                if(Math.abs(a[i] - a[j]) < khoangCachGanNhat)
                {
                    khoangCachGanNhat = Math.abs(a[i] - a[j]);
                }
            }
        }
        System.out.print("Nhung cap gia tri gan nhau nhat: ");

        for(i = 0; i < n; i++)
        {
            for(j = i + 1; j < n - 1; j++)
            {
                if(Math.abs(a[i] - a[j]) == khoangCachGanNhat)
                {
                    System.out.println(a[i]+ " " + a[j] + " " + i + " " + j);
                }
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
        Bai194(a, n);
        xuatmang(a);
    }
}

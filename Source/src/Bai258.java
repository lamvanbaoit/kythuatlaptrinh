import java.util.Scanner;

public class Bai258 {
//   Bài 258: Sắp xếp số nguyên tố tăng dần nhưng giá trị khác giữ nguyên vị trí
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int KiemTraNguyenTo(int n)
    {
        if(n < 2)
        {
            return 0;
        }
        else if(n > 2)
        {
            if(n % 2 == 0)
            {
                return 0;
            }
            for(int i = 3; i <= Math.sqrt((float)n); i+= 2)
            {
                if(n % i == 0)
                {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void Bai258(int[] a, int n){
        int temp = a[0];
        for (int i = 0; i < n - 1; i++) {
            if(KiemTraNguyenTo(a[i]) == 1) {
                for (int j = i + 1; j < n; j++) {
                    if (KiemTraNguyenTo(a[j]) == 1 && a[i] > a[j]) {
                        temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                    }
                }
            }
        }

    }

    public static void xuatmang(int[] a) {
        System.out.print("Mang sau khi sap xep nguyen to tang dan: ");
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
        Bai258(a, n);
        xuatmang(a);
    }
}

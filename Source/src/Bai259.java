import java.util.Scanner;

public class Bai259 {
    // Bài 259: Sắp xếp số hoàn thiện giảm dần nhưng giá trị
    // khác giữ nguyên vị trí
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int KiemTraHoanThien(int n)
    {
        int tong = 0;
        for(int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                tong += i;
            }
        }
        if(tong == n)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static void Bai259(int[] a, int n){
        int temp = a[0];
        for (int i = 0; i < n - 1; i++) {
            if(KiemTraHoanThien(a[i]) == 1) {
                for (int j = i + 1; j < n; j++) {
                    if (KiemTraHoanThien(a[j]) == 1 && a[i] < a[j]) {
                        temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                    }
                }
            }
        }

    }

    public static void xuatmang(int[] a) {
        System.out.print("Mang sau khi sap xep hoan thien giam dan: ");
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
        Bai259(a, n);
        xuatmang(a);
    }
}

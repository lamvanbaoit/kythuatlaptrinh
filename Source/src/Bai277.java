import java.util.Scanner;

public class Bai277 {
    //Bài 277: Xóa tất cả các số nguyên tố trong mảng
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void Xoa1PhanTu(int a[], int n, int ViTriXoa)
    {
        for(int i = ViTriXoa; i < n; i++)
        {
            a[i] = a[i + 1];
        }
        n--;
    }

    public static int KiemTraNguyenTo(int n)
    {
        if (n < 2)
        {
            return 0;
        }
        else if (n > 2)
        {
            if (n % 2 == 0)
            {
                return 0;
            }
            for (int i = 3; i <= Math.sqrt((float)n); i += 2)
            {
                if (n % i == 0)
                {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void Bai277(int[] a, int n){
        for(int i = 0; i < n; i++)
        {
            if(KiemTraNguyenTo(a[i]) == 1)
            {
                Xoa1PhanTu(a, n, i);
                i--;
            }
        }
    }

    public static void xuatmang(int[] a) {
        System.out.print("");
        for(int i = 0; i < a.length; i++) {
            System.out.print("Mang sau khi xoa tat cac cac gia tri nguyen to: ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);

        int ViTriXoa;

        Bai277(a, n);
        xuatmang(a);
    }
}

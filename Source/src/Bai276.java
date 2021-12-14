import java.util.Scanner;

public class Bai276 {
    //Bài 276: Xóa tất cả các phần tử trùng với x
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

    public static void Bai276(int[] a, int n, int x){
        for(int i = 0; i < n; i++)
        {
            if((a[i]) == x)
            {
                Xoa1PhanTu(a, n, i);
                i--;
            }
        }
    }

    public static void xuatmang(int[] a) {
        System.out.print("");
        for(int i = 0; i < a.length; i++) {
            System.out.print("Mang sau khi xoa tat cac cac gia tri trung: ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);

        int ViTriXoa,x;
        System.out.println("Nhập x: ");
        Scanner sc3 = new Scanner(System.in);
        x = sc3.nextInt();

        Bai276(a, n,x);
        xuatmang(a);
    }
}

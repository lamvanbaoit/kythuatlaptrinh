import java.util.Scanner;

public class Bai278 {
//Bài 278: Xóa tất cả các phần tử trùng nhau trong mảng
// và chỉ giữ lại duy nhất 1 phần tử
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

    public static void Bai278(int[] a, int n){
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(a[i] == a[j])
                {
                    Xoa1PhanTu(a, n, j);
                    j--;
                }
            }
        }
    }

    public static void xuatmang(int[] a) {
        System.out.print("");
        for(int i = 0; i < a.length; i++) {
            System.out.print("Mang sau khi xoa tat cac cac gia tri trung nhau: ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);

        int ViTriXoa;

        Bai278(a, n);
        xuatmang(a);
    }
}

import java.util.Scanner;

public class Bai272 {
    //Bài 272: Hãy xóa tất cả số lớn nhất trong mảng các số thực
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void Xoa1PhanTu(int[] a, int n, int ViTriXoa)
    {
        for(int i = ViTriXoa; i < n; i++)
        {
            a[i] = a[i + 1];
        }
        n--;
    }

    public static float TimMax(int a[], int n)
    {
        int max = a[0];
        for(int i = 1; i < n; i++)
        {
            max = (max < a[i]) ? a[i] : max;
        }
        return max;
    }

    public static void Bai272(int[] a, int n){
        float max =TimMax(a, n);
        for(int i = 0; i < n; i++)
        {
            if(a[i] == max)
            {
                Xoa1PhanTu(a, n, i);
                i--;
            }
        }
    }

    public static void xuatmang(int[] a) {
        System.out.print("");
        for(int i = 0; i < a.length; i++) {
            System.out.print("Các phần tử trong mảng: ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc) {
        System.out.print("Mang sau khi xoa cac gia tri lon nhat: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);

        Bai272(a, n);
        xuatmang(a);
    }
}

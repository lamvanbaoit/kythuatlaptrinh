import java.util.Scanner;

public class Bai282 {
    //Bài 282: Đưa các số chia hết cho 3 về đầu mảng
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void DoiCho(int a[], int n, int ViTriDoi)
    {
        int tam = a[ViTriDoi];
        for(int i = ViTriDoi; i > 0; i--)
        {
            a[i] = a[i - 1];
        }
        a[0] = tam;
    }

    public static void Bai282(int a[], int n)
    {
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 3 == 0)
            {
                DoiCho(a, n, i);
            }
        }
    }

    public static void xuatmang(int[] a) {
        System.out.print("Các phần tử của mảng là: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "Dua tat ca so chia het cho 3 ve dau mang: ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);
        Bai282(a,n);

        xuatmang(a);
    }
}

import java.util.Scanner;

public class Bai289 {
    // Bài 289: Xuất mảng: chẵn nằm trên 1 mảng, lẻ nằm trên hàng tiếp theo
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void Bai289(int a[], int n)
    {
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)
            {
                System.out.println("chan: " + a[i]);
            }
        }
        System.out.println("\n\t");
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 != 0)
            {
                System.out.println("le: " + a[i]);
            }
        }
    }

    public static void xuatmang(int[] a) {
        System.out.println("Các phần tử của mảng là: ");
        for(int i = 0; i < a.length; i++) {
            System.out.println("");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);
        Bai289(a,n);
        xuatmang(a);
    }
}

import java.util.Scanner;

public class Bai293 {
    // Bài 293: Liệt kê tất cả các mảng con
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }


    public static void Bai293(int[] a, int n){
        System.out.println("Liệt kê tất cả mảng con: ");
        int ChieuDai;  // độ dài mảng con
        for(int i = 0; i < n; i++)
        {   // nếu bỏ vòng for này thì sao ?
            for(ChieuDai = 1; ChieuDai <= n; ChieuDai++)
            {
                for(int j = i; j < ChieuDai; j++)
                {
                    System.out.print(a[j]);
                }
                System.out.println();
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
        Bai293(a,n);
        xuatmang(a);
    }
}

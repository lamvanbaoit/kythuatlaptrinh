import java.util.Scanner;

public class Bai294 {
    // Bài 294: Liệt kê mảng con có độ dài lớn hơn 2 phần tử
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }


    public static void Bai294(int[] a, int n){
        System.out.println("Tat ca cac mang con co do dai lon hon 2 phan tu la: ");
        int ChieuDai;  // độ dài mảng con
        for(int i = 0; i < n; i++)
        {
            for(ChieuDai = 3 + i; ChieuDai <= n; ChieuDai++) // nếu bỏ vòng for này thì sao ?
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
        Bai294(a,n);
        xuatmang(a);
    }
}

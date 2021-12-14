import java.util.Scanner;

public class Bai227 {
    // Bài 227: Hãy xác định số lượng phần tử kề nhau mà cả 2 trái dấu
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int Bai227(int[] a, int n){
        int dem = 0;
        for(int i = 0; i < n; i++)
        {
            if(a[i] * a[i + 1] < 0)
            {
                dem++;
            }
        }
        if(dem != 0)
        {
            dem++;
        }
        return dem;
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
        int KQ = Bai227(a, n);
        System.out.println("So luong phan tu ke nhau ma ca 2 trai dau: " + KQ);
        xuatmang(a);
    }
}

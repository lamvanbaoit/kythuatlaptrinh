import java.util.Scanner;

public class Bai214 {
    // Bài 214: Tính trung bình nhân các giá trị dương có trong mảng 1 chiều các số thực
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int Bai214(int[] a, int n){
        int Tich = 1;
        float dem = 0;
        for(int i = 0; i < n; i++)
        {
            if(a[i] > 0)
            {
                Tich *= a[i];
                dem++;
            }
        }
        if(dem == 0)
        {
            System.out.println("\nMang khong co so thoa yeu cau");
            return 0;
        }
        return (int) Math.pow(Tich,1.0/dem);
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
        int KQ = Bai214(a, n);
        System.out.println("Sum = " + KQ);
        xuatmang(a);
    }
}

import java.util.Scanner;

public class Bai213 {
    //Bài 213: Tính trung bình cộng các giá trị lớn hơn giá trị x trong mảng 1 chiều các số thực
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int KiemTraSoChanDauTien(int n)
    {
        while(n >= 10)
        {
            n /= 10;
        }
        if(n % 2 == 0)
        {
            return 1;
        }
        return 0;
    }

    public static int Bai213(int[] a, int n){
        int Tong = 0;
        float dem = 0;
        int x = 10; // x đây tự cho
        for(int i = 0; i < n; i++)
        {
            if(a[i] > x)
            {
                Tong += a[i];
                dem++;
            }
        }
        if(dem == 0)
        {
            System.out.println("\nMang khong co so thoa yeu cau");
            return 0;
        }
        return (int) (Tong/dem);
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
        int KQ = Bai213(a, n);
        System.out.println("Sum = " + KQ);
        xuatmang(a);
    }
}

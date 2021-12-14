import java.util.Scanner;

public class Bai211 {
    //Bài 211: Tính trung bình cộng các số nguyên tố trong mảng 1 chiều các số nguyên
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int KiemTraNguyenTo(int n)
    {
        if (n < 2)
        {
            return 0;
        }
        else if (n > 2)
        {
            if (n % 2 == 0)
            {
                return 0;
            }
            for (int i = 3; i <= Math.sqrt((float)n); i += 2)
            {
                if (n % i == 0)
                {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static int Bai211(int[] a, int n){

        int Tong = 0;
        float dem = 0;
        for(int i = 0; i < n; i++)
        {
            if(KiemTraNguyenTo(a[i]) == 1)
            {
                Tong += a[i];
                dem++;
            }
        }
        if(dem == 0)
        {
            System.out.println("\nMang khong co so nguyen to");
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
        int KQ = Bai211(a, n);
        System.out.println("Sum = " + KQ);
        xuatmang(a);
    }
}

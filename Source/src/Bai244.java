import java.util.Scanner;

public class Bai244 {
    // Bài 244: Kiểm tra mảng thỏa tính chất: mảng không có số hoàn thiện lớn hơn 256.
    // Có trả về 1, không có trả về 0
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int KiemTraHoanThien(int n)
    {
        int tong = 0;
        for(int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                tong += i;
            }
        }
        if(tong == n)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static int Bai244(int[] a, int n){
        int flag = 0; // lúc đầu chưa có
        for(int i = 0; i < n; i++)
        {
            if(KiemTraHoanThien(a[i]) == 1 && a[i] < 256)
            {
                flag = 1;
                break;
            }
        }
        return flag;
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
        int flag = Bai244(a, n);
        if(flag == 1)
        {
            System.out.println("Mang co so hoan thien");
        }
        else
        {
            System.out.println("Khong tim thay");
        }
        xuatmang(a);
    }
}

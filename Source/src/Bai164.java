import java.util.Scanner;

public class Bai164 {
    //Cho mảng một chiều các số nguyên, hãy viết hàm tìm giá trị đầu tiên trong mảng thỏa tính chất số gánh.
    // (ví dụ giá trị 12321).
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void xuatmang(int[] a) {
        System.out.print("Các phần tử của mảng là: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\t ");
    }

    public static int SoGanh(int x){
        int SoDao = 0;
        int themang = x;
        while (themang != 0)
        {
            SoDao = SoDao * 10 + themang % 10;
            themang /= 10;
        }
        if(x == SoDao)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static int Bai164(int[] a, int n){
        for (int i = 0; i < n; i++)
        {
            if (SoGanh(a[i]) == 1)
            {
                return a[i];
            }
        }
        return -1;
    }

    public static void main(String[] argc) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);
        int kq = Bai164(a, n);
        System.out.println("So ganh dau tien la: " + kq);
        xuatmang(a);
    }
}

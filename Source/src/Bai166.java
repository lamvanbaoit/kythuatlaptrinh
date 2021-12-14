import java.util.Scanner;

public class Bai166 {
// Bài 166: Cho mảng 1 chiều các số nguyên.
// Hãy viết hàm tìm giá trị đầu tiên trong mảng có dạng 2^k.
// Nếu mảng không có giá trị dạng 2k thì hàm sẽ trả về 0
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

    public static int KiemTraDang2K(int x){
        if (x <= 1)
            return 1;
        while(x > 1)
        {
            if(x % 2 != 0)
                return 0;
            x /= 2;
        }
        return 1;
    }

    public static int Bai166(int[] a, int n){
        for(int i = 0; i < n; i++)
        {
            if(KiemTraDang2K(a[i]) == 1)
            {
                return a[i];
            }
        }
        return 0;
    }

    public static void main(String[] argc) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);
        int kq = Bai166(a, n);
        System.out.println("Gia tri 2k dau tien la: " + kq);
        xuatmang(a);
    }
}

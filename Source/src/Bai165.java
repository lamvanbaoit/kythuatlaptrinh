import java.util.Scanner;

public class Bai165 {
    //  Hãy tìm giá trị đầu tiên trong mảng một chiều các số nguyên có chữ số đầu tiên là chữ số lẻ (dauledautien).
    //  Nếu trong mảng không tồn tại giá trị như vậy thì hàm sẽ trả về giá trị 0.
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

    public static int ChuSoDau(int x){
        int dv;
        while (x >= 10)
        {
            dv = x % 10;
            x = x / 10;
        }
        if (x % 2 == 0)
            return 0;
        return 1;
    }

    public static int Bai165(int[] a, int n){
        for(int i = 0; i < n; i++)
        {
            if (ChuSoDau(a[i]) == 1)
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
        int kq = Bai165(a, n);
        System.out.println("Ket qua la: " + kq);
        xuatmang(a);
    }
}

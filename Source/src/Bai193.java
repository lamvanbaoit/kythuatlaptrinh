import java.util.Scanner;

public class Bai193 {
//    Bài 193: Cho mảng 1 chiều các số nguyên.
//    Hãy viết hàm liệt kê các giá trị trong mảng có dạng 3^k.
//    Nếu mảng không có giá trị đó thì trả về 0
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int KiemTraDang3K(int n){
        int flag=1;
        n = n < 0 ? -n : n;
        if(n < 2)
            return 1;
        while(n > 1)
        {
            int du = n % 3;
            if(du != 0)  // nếu dư mà khác 0. lập tức báo sai
                flag = 0;
            n /= 3;
        }
        if(flag == 1)
            return 1;
        else
            return 0;
    }

    public static void Bai193(int a[], int n){
        for (int i = 0; i <n ; i++) {
            if( KiemTraDang3K(a[i]) == 1){
                System.out.println("Cac gia tri co dang 3^k trong mang la: " + a[i]);
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
        Bai193(a, n);
        xuatmang(a);
    }
}

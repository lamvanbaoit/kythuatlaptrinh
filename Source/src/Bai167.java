import java.util.Scanner;

public class Bai167 {
// Bài 167: Hãy tìm giá trị thỏa điều kiện toàn chữ số lẻ và
// là giá trị lớn nhất thỏa điều kiện ấy trong mảng 1 chiều các số nguyên.
// Nếu mảng không có giá trị thỏa điều kiện trên thì trả về 0
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

    public static int KiemTraToanLe(int x){
        int dv;
        while (x != 0)
        {
            dv = x % 10;
            if (dv % 2 == 0)
                return 0;
            x = x / 10;
        }
        return 1;
    }

    public static int Bai167(int[] a, int n){
        int max = 0;
        int dem = 0;
        for(int i = 0; i < n; i++)
        {
            if(KiemTraToanLe(a[i]) == 1)
            {
                max = a[i]; // max lúc này là a[i]
                dem++;  // Đếm là 1
                break;     // lập tức thoát ra
            }
        }
        if(dem == 0)
        {
            return 0;
        }
        for(int i = 0; i < n; i++)
        {
            if (KiemTraToanLe(a[i]) == 1)
            {
                max = ( max > a[i]) ? max : a[i] ;
            }
        }
        return max;
    }

    public static void main(String[] argc) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);
        int kq = Bai167(a, n);
        System.out.println("Ket qua la: " + kq);
        xuatmang(a);
    }
}

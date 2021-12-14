import java.util.Scanner;

public class Bai163 {
    // 163. Tìm số chính phương đầu tiên trong mảng một chiều các số nguyên.
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

    public static int KiemTraChinhPhuong(int z){
        if (Math.sqrt((float)z) == (int)Math.sqrt((float)z)) {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static int Bai163(int[] a, int n){
        for(int i = 0; i < n; i++)
        {
            if(KiemTraChinhPhuong(a[i]) == 1)
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
        int kq = Bai163(a, n);
        System.out.println("So chinh phuong dau tien trong mang: " + kq);
        xuatmang(a);
    }
}

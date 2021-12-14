import java.util.Scanner;

public class Bai148 {
    // Tìm số nguyên tố cuối cùng trong mảng 1 chiều các số nguyên.
    // Nếu mảng không có số nguyên tố thì trả về -1
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static float kiemtrasonguyento(int n){
        if(n < 2)
            return 0;
        for(int i = 2; i < n; ++i){
            if(n%i==0)
                return 0;
        }
        return 1;
    }

    private static int Bai148(int[] a, int n){
        for (int i = n-1; i >= 0; i--) {
            if(kiemtrasonguyento((int) a[i]) == 1){
                return a[i];
            }
        }
        return -1;
    }

    public static void xuatmang(int[] a) {
        System.out.print("Các phần tử của mảng là: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc){
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = nhapmang(n);
        int kq = Bai148(a,n);
        System.out.println("So nguyen to cuoi cung trong mang: " + kq);
        xuatmang(a);
    }

}

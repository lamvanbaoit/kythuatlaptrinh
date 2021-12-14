import java.util.Scanner;

public class Bai145 {
    // Tìm số hoàn thiện đầu tiên trong mảng 1 chiều số nguyên.
    // Nếu mảng không có số hoàn thiện thì trả về -1
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static boolean kientrasohoanthiet(int n){
        int s = 0;
        for(int i = 1; i < n; ++i){
            if(n%i == 0){
                s += i;
            }
        }
        if(s==n)
            return true;
        return false;
    }

    public static int Bai145(int[] a, int n){
        for(int i = 0; i < n; ++i){
            if (kientrasohoanthiet(a[i] )== true) {
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
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);
        int kq = Bai145(a,n);
        System.out.println("Gia tri dau tien cua so hoan thien: " + kq);
        xuatmang(a);
    }
}

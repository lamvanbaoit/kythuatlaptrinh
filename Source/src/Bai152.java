import java.util.Scanner;

public class Bai152 {
    // Hãy tìm số hoàn thiện nhỏ nhất trong mảng 1 chiều các số nguyên. Nếu mảng không có số hoàn thiện thì trả về 0 (or -1)

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

    public static int Bai152(int[] a, int n){
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] < min && kientrasohoanthiet(a[i]) )
                min = a[i];
        }
        if (kientrasohoanthiet(n) == false)
            return -1;
        return min;
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
        int kq = Bai152(a,n);
        System.out.println("Số hoàn thiện nhỏ nhất trong mảng: " + kq);
        xuatmang(a);
    }

}

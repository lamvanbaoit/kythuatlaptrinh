import java.util.Scanner;

public class Bai202 {
    // Bài 202: Tính tổng các giá trị có chữ số đầu tiên là chữ số lẻ trong mảng 1 chiều các số nguyên
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int TimChuSoDauLe(int n){
        int donvi;
        n = Math.abs(n);
        while(n >= 10)
        {
            donvi = n % 10;
            n /= 10;
        }
        if(n % 2 == 0)
        {
            return 0;
        }
        return 1;
    }

    public static int Bai202(int[] a, int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(TimChuSoDauLe(a[i]) == 1)
                sum += a[i];
        }
        return sum;
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
        int KQ = Bai202(a, n);
        System.out.println("Tính tổng các phần tử trong mảng: " + KQ);
        xuatmang(a);
    }
}

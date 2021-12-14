import java.util.Scanner;

public class Bai203 {
//    Bài 203: Tinh tổng các chữ số có chữ số hàng chục là 5 trong mảng 1 chiều các số nguyên
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int TimSoHangChuc5(int n)
    {
        n = Math.abs(n);
        n = n / 10;
        int hangchuc = n % 10;
        if(hangchuc == 5)
        {
            return 1;
        }
        return 0;
    }

    public static int Bai203(int[] a, int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(TimSoHangChuc5(a[i]) == 1)
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
        int KQ = Bai203(a, n);
        System.out.println("Tính tổng các phần tử trong mảng: " + KQ);
        xuatmang(a);
    }
}

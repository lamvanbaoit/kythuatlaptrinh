import java.util.Scanner;

public class Bai210 {
//    Bài 210: Tính tổng các giá trị có chữ số đầu tiên là chữ số chẵn trong mảng các số nguyên
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int KiemTraSoChanDauTien(int n)
    {
        while(n >= 10)
        {
            n /= 10;
        }
        if(n % 2 == 0)
        {
            return 1;
        }
        return 0;
    }

    public static int Bai209(int[] a, int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(KiemTraSoChanDauTien(a[i]) == 1)
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
        int KQ = Bai209(a, n);
        System.out.println("Sum = " + KQ);
        xuatmang(a);
    }
}

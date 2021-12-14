import java.util.Scanner;

public class Bai190 {
//    Bài 190: Hãy liệt kê các giá trị có toàn chữ số lẻ
//    trong mảng 1 chiều các số nguyên
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int KiemTraToanLe(int n){
        int dv;
        while (n != 0)
        {
            dv = n % 10;
            if (dv % 2 == 0)
                return 0;
            n = n / 10;
        }
        return 1;
    }

    public static void Bai190(int a[], int n){
        for (int i = 0; i <n ; i++) {
            if(KiemTraToanLe(a[i]) == 1){
                System.out.println("Cac so toan chu so le la: " + a[i]);
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

    public static void main(String[] argc){
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);
        Bai190(a,n);
        xuatmang(a);
    }
}

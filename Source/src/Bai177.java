import java.util.Scanner;

public class Bai177 {
    //  Bài 177: Hãy liệt kê các số trong mảng 1 chiều các số thực
    //  thuộc đoạn [x, y] cho trước
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void Bai177(int a[], int n, int x, int y){
        for (int i = 0; i < n; i++) {
            if (a[i] <= x && a[i] <= y){
                System.out.println("Các số trong mảng thuộc đoạn x và y cho trước là: " + a[i]);
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
        int x = 10;
        int y = 50;
        Bai177(a,n,x,y);
        xuatmang(a);
    }
}

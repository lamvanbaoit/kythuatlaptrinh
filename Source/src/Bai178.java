import java.util.Scanner;

public class Bai178 {
// Bài 178: Hãy liệt kê các số chẵn trong mảng 1 chiều các số nguyên
// thuộc đoạn [x, y] cho trước (x, y là các số nguyên)
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void Bai178(int a[], int n, int x, int y){
        for (int i = 0; i < n; i++) {
            if (a[i] <= x && a[i] <= y && a[i] % 2 == 0 ){
                System.out.println("Các số chẵn trong mảng thuộc đoạn x và y cho trước là: " + a[i]);
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
        int x = 1;
        int y = 50;
        Bai178(a,n,x,y);
        xuatmang(a);
    }
}

import java.util.Scanner;

public class hamnhap1 {
    // Nhập và xuất mảng
    public static int[] nhapmangcach1(int n){
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
            System.out.println("Nhập các phần tử của mảng: a[" + i +"]: " + a[i]);
        }
        return a;
    }

    public static void xuatmangcach1(int[] a) {
        System.out.print("Các phần tử của mảng là : ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\t ");
    }

    public static int[] nhapmangcach2(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void xuatmangcach2(int[] a) {
        System.out.print("Các phần tử của mảng là: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc){
        // Cách 1
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int[] a = nhapmangcach1(n);
        xuatmangcach1(a);
        // Cách 2
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n1 = sc2.nextInt();
        int[] a1 = nhapmangcach2(n1);
        xuatmangcach2(a1);
    }
}

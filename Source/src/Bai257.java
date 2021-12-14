import java.util.Scanner;

public class Bai257 {
    //Bài 257: Sắp xếp lẻ tăng dần nhưng giá trị khác giữ nguyên vị trí
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void Bai257(int[] a, int n){
        int temp = a[0];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                if (a[i] > a[j] && a[j]%2 != 0 ){
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

    }

    public static void xuatmang(int[] a) {
        System.out.print("Mảng sau khi sắp xếp lẻ tăng dần: ");
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
        Bai257(a, n);
        xuatmang(a);
    }
}

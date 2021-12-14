import java.util.Scanner;

public class Bai262 {
//    Bài 262: Sắp xếp chẵn, lẻ tăng dần nhưng vị trí tương đối
//    giữa các số không thay đổi
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void Bai262(int[] a, int n){
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            if((a[i]) > 0) {
                for (int j = i + 1; j < n; j++) {
                    if (((a[i] % 2 == 0 && a[j] % 2 == 0) || (a[i] % 2 != 0 && a[j] % 2 != 0)) && a[i] > a[j]) {
                        temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                    }
                }
            }
        }
    }

    public static void xuatmang(int[] a) {
        System.out.print("Mang sau khi sap xep chan le tang dan nhung vi tri tuong doi giua cac so ko thay doi: ");
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
        Bai262(a, n);
        xuatmang(a);
    }
}

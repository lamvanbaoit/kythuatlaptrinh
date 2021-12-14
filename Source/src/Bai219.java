import java.util.Scanner;

public class Bai219 {
    // Bài 219: Đếm số lần xuất hiện của giá trị x trong mảng
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int Bai218(int[] a, int n, int x){
        int count = 0;
        for (int i = 0; i <n ; i++) {
            if(a[i] == x){
                count++;
            }
        }
        return count;
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
        int x = 10; // do mình cho.
        int KQ = Bai218(a, n,x);
        System.out.println("So sanh so luong so chan va so le: " + KQ);
        xuatmang(a);
    }
}

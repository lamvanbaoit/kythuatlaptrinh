import java.util.Scanner;

public class Bai217 {
//    Bài 217: Đếm số dương chia hết cho 7 trong mảng
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int Bai217(int[] a, int n){
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(a[i]%7==0 && a[i] > 0){
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
        int KQ = Bai217(a, n);
        System.out.println("So luong chia het cho 7 la: " + KQ);
        xuatmang(a);
    }
}

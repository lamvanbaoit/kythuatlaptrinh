import java.util.Scanner;

public class Bai218 {
//    Bài 218: Đếm số đối xứng trong mảng
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static float KiemTraSoDoiXung(int n){
        int dv = 0;
        int daonguoc = 0;
        int tam = n;
        while (n>0){
            dv = tam % 10;
            tam /= 10;
            daonguoc = daonguoc * 10 + dv;
        }
        if (daonguoc == n) {
            return 1;
        }
        return 0;
    }

    public static int Bai218(int[] a, int n){
        int count = 0;
        for (int i = 0; i <n ; i++) {
            if(a[i] < 0){
                break;
            }
            if (KiemTraSoDoiXung(a[i]) == 1 ) {
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
        int KQ = Bai218(a, n);
        System.out.println("Số đối xứng trong mảng là: " + KQ);
        xuatmang(a);
    }
}

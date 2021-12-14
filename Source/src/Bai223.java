import java.util.Scanner;

public class Bai223 {
    // Bài 223: Đếm số nguyên tố trong mảng
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static boolean nto(int z){
        if(z < 2)
            return false;
        else if (z > 2) {
            if (z % 2 == 0)
                return false;
            for (int i = 3; i <= Math.sqrt(z) ; i += 2) {
                if(z%i==0)
                    return false;
            }
        }
        return true;
    }

    public static int Bai223(int a[], int n){
        int count = 0;
        for (int i = 0; i <n ; i++) {
            if(nto(a[i]) == true){
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

    public static void main(String[] argc){
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);
        int KQ = Bai223(a,n);
        System.out.println("So luong so nguyen to la: " + KQ);
        xuatmang(a);
    }
}

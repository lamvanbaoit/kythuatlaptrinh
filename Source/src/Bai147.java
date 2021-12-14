import java.util.Scanner;

public class Bai147 {
    // Tìm số dương cuối cùng trong mảng số thực.
    // Nếu mảng không có giá trị dương thì trả về -1
    public static float[] nhapmang(int n){
        float[] a = new float[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextFloat();
        }
        return a;
    }

    private static float Bai147(float[] a, int n){
        for (int i = n-1; i >= 0; i--) {
            if(a[i] > 0){
                return a[i];
            }
        }
        return -1;
    }

    public static void xuatmang(float[] a) {
        System.out.print("Các phần tử của mảng là: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc){
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] a = nhapmang(n);
        float kq = Bai147(a,n);
        System.out.println("So duong cuoi cung trong mang: " + kq);
        xuatmang(a);
    }
}

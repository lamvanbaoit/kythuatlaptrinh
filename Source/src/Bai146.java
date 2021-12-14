import java.util.Scanner;

public class Bai146 {
    // Tìm giá trị âm đầu tiên trong mảng 1 chiều các số thực.
    // Nếu mảng không có giá trị âm thì trả về -1
    public static float[] nhapmang(int n){
        float[] a = new float[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextFloat();
        }
        return a;
    }

    public static float Bai146(float[] a, int n){
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
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
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        float[] a = nhapmang(n);
        float kq = Bai146(a,n);
        System.out.println("Gia tri am dau tien: " + kq);
        xuatmang(a);
    }
}

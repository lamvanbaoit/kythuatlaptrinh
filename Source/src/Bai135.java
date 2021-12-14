import java.util.Scanner;

public class Bai135 {
    // Viết hàm tìm giá trị dương đầu tiên trong mảng 1 chiều các số thực.
    // Nếu mảng không có giá trị dương thì trả về -1
    public static float[] InputArray(int n){
        float[] a = new float[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextFloat();
        }
        return a;
    }

    public static float Bai135(float[] a, int n){
        for (int i = 0; i < n; i++) {
            if(a[i] > 0) {
                return a[i];
            }
        }
        return -1;
    }

    public static void PrintArray(float[] a) {
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
        float[] a = InputArray(n);
        float kq = Bai135(a,n);
        System.out.println("Giá trị dương đầu tiên: " + kq);
        PrintArray(a);
    }
}

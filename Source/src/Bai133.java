import java.util.Scanner;

public class Bai133 {
    // Viết hàm liệt kê các vị trí mà giá trị tại đó là giá trị âm trong mảng 1 chiều các số thực.
    public static float[] InputArray(int n){
        float[] a = new float[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextFloat();
        }
        return a;
    }


    public static void Bai133(float[] a, int n){
        System.out.print("Các giá trị âm: ");
        for (int i = 0; i < n; i++) {
            if(a[i] < 0){
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("\t ");
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
        int n = (int) sc.nextFloat();
        float[] a = InputArray(n);
        Bai133(a,n);
        PrintArray(a);
    }
}

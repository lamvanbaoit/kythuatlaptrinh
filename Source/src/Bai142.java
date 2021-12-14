import java.util.Scanner;

public class Bai142 {
    // Tìm giá trị nhỏ nhất trong mảng 1 chiều số thực
    public static float[] InputArray(int n){
        float[] a;
        a = new float[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextFloat();
        }
        return a;
    }

    public static void Bai142(float[] a, int n){
        float min;
        min = a[0];
        for(int i = 1; i < n; ++i) {
            if(a[i] < min)
                min = a[i];
        }
        System.out.println("Giá trị nhỏ nhất: " + min);
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
        Bai142(a,n);

        PrintArray(a);
    }
}

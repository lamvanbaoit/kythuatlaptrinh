import java.util.Scanner;

public class Bai137 {
    // Tìm 1 vị trí mà giá trị tại vị trí đó là giá trị nhỏ nhất trong mảng 1 chiều các số thực.
    public static float[] InputArray(int n){
        float[] a = new float[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextFloat();
        }
        return a;
    }

    public static float Bai137(float[] a, int n){
        float min = a[0];
        for (int i = 0; i < n; i++) {
            if(min > a[i]) {
                min = a[i];
            }
        }
        return min;
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
        float kq = Bai137(a,n);
        System.out.println("Vị trí nhỏ nhất: " + kq);
        PrintArray(a);
    }
}

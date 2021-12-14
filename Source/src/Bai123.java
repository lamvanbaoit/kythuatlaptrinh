import java.util.Scanner;
// Kỹ thuật lính canh.
public class Bai123 {
    // Viết hàm tìm 1 vị trí mà giá trị tại vị trí đó là giá trị nhỏ nhất trong mảng 1 chiều các số nguyên.

    public static int[] InputArray(int n){
        int[] a = new int[n];
        for(int i = 0; i < n; ++i){
            System.out.print("Nhập các phần tử của mảng : a[" + i +"]: ");
            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static float Bai123(int[] a, int n){
        float min = a[0];
        for(int i = 0; i<n; ++i){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }

    public static void PrintArray(int[] a) {
        System.out.print("Các phần tử của  mảng : ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc){
        System.out.print(" Nhập số phần tử của mảng là : ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = InputArray(n);

        int min = (int) Bai123(a,n);
        System.out.println("Giá trị nhỏ nhất trong một mảng là số: " + min);

        PrintArray(a);
    }
}

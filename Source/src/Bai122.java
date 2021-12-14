import java.util.Scanner;
// Kỹ thuật lính canh.
public class Bai122 {
    // Viết hàm tìm giá trị lớn nhất trong mảng 1 chiều các số thực.

    public static int[] InputArray(int n){
        int[] a = new int[n];
        for(int i = 0; i < n; ++i){
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void Bai122(int[] a, int n){
        float max = a[0];
        for(int i = 0; i<n; ++i){
            if(max < a[i]){
                max = a[i];
            }
        }
        System.out.println("Giá trị lớn nhất trong một mảng là số: " + max);
    }

    public static void PrintArray(int[] a) {
        System.out.print("Các phần tử của mảng : ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc){
        System.out.print("Nhập số phần tử của mảng là: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = InputArray(n);
        Bai122(a,n);
        PrintArray(a);
    }
}

import java.util.Scanner;
// Kỹ thuật tính tổng
public class Bai126 {
    // Viết hàm tính tổng các giá trị âm trong mảng 1 chiều các số thực
    public static int[] InputArray(int n){
        int[] a = new int[n];
        for(int i = 0; i < n; ++i){
            System.out.print("Nhập các phần tử của mảng : a[" + i +"]: ");
            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void Bai126(int[] a, int n){
        int s = 0;
        for (int i = 0; i < n; ++i){
            if (a[i] < 0){
                s += a[i];
            }
        }
        System.out.println("Tổng các giá trị âm: " + s);
    }

    public static void PrintArray(int[] a) {
        System.out.print("Các phần tử của  mảng : ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc){
        System.out.print("Nhập số phần tử của mảng là : ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = InputArray(n);
        Bai126(a,n);
        PrintArray(a);

    }


}

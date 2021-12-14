import java.util.Scanner;

public class Bai132 {
    // Viết hàm liệt kê các giá trị chẵn trong mảng 1 chiều các số nguyên

    public static int[] InputArray(int n){
        int[] a = new int[n];
        for(int i = 0; i < n; ++i){
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void Bai132(int[] a, int n){
        System.out.print("Các giá trị chẵn: ");
        for(int i = 0; i < n; ++i){
            if(a[i]%2==0){
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("\t ");
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
        Bai132(a,n);
        PrintArray(a);
    }
}

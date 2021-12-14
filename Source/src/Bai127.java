import java.util.Scanner;
// Kỹ thuật sắp xếp
public class Bai127 {
    // Viết hàm sắp xếp mảng 1 chiều các số thực tăng dần.
    public static int[] InputArray(int n){
        int[] a = new int[n];
        for(int i = 0; i < n; ++i){
            System.out.print("Nhập các phần tử của mảng : a[" + i +"]: ");
            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void Bai127(int[] a, int n){
        int temp = a[0];
        for (int i = 0; i < n - 1; i++){
            for (int j = i + 1; j < n; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
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
        Bai127(a,n);
        PrintArray(a);

    }
}

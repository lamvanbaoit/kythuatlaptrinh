import java.util.Scanner;

public class Bai136 {
    // Tìm số chẵn cuối cùng trong mảng 1 chiều các số nguyên. Nếu mảng không có giá trị chẵn thì trả về -1
    public static int[] InputArray(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int Bai136(int[] a, int n){
        for (int i = n -1; i >= 0; i--) {
            if(a[i]%2==0) {
                return a[i];
            }
        }
        return -1;
    }

    public static void PrintArray(int[] a) {
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
        int[] a = InputArray(n);
        int kq = Bai136(a,n);
        System.out.println("Giá trị chẵn cuối: " + kq);
        PrintArray(a);
    }
}

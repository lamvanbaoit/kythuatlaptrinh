import java.util.Scanner;

public class Bai207 {
//    Bài 207: Tính tổng các phần tử “cực trị” trong mảng.
//    Một phần tử được gọi là cực trị khi nó lớn hơn hoặc nhỏ hơn các phần tử xung quanh nó
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int Bai207(int[] a, int n){
        int Tong = 0;
        for(int i = 0; i < n; i++)
        {
            if(i == 0 && a[i] != a[i + 1])   // xét đầu
            {
                Tong += a[i];
            }
            else if(i == n - 1 && a[i] != a[i - 1])  // xét đuôi
            {
                Tong += a[i];
            }
            else if((a[i] < a[i + 1] && a[i] < a[i - 1]) || (a[i] > a[i + 1] && a[i] > a[i - 1]))
            {
                Tong += a[i];
            }
        }
        return Tong;
    }

    public static void xuatmang(int[] a) {
        System.out.print("Các phần tử của mảng là: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);
        int KQ = Bai207(a, n);
        System.out.println("Sum = " + KQ);
        xuatmang(a);
    }
}

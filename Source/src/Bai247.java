import java.util.Scanner;

public class Bai247 {

    // Bài 247: Ta định nghĩa 1 mảng có tính chất lẻ,
    // khi tổng của 2 phần tử liên tiếp luôn là lẻ.
    // Kiểm tra mảng có tính chất lẻ hay không
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int Bai247(int[] a, int n){
        int flag = 1;
        for(int i = 0; i < n; i++)
        {
            if((a[i] + a[i + 1] % 2) == 0)
            {
                flag = 0;
                break;
            }
        }
        return flag;
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
        int flag = Bai247(a, n);
        if(flag == 1)
        {
            System.out.println("Mang co tinh chat le");
        }
        else
        {
            System.out.println("Khong thoa DK");
        }
        xuatmang(a);
    }
}

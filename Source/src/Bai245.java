import java.util.Scanner;

public class Bai245 {
    // Bài 245: Kiểm tra mảng có toàn số chẵn không?
    // Có trả về 1, không có trả về 0
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }


    public static int Bai245(int[] a, int n){
        int flag = 1;
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 != 0)
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
        int flag = Bai245(a, n);
        if(flag == 1)
        {
            System.out.println("Mang toan so chan");
        }
        else
        {
            System.out.println("Khong tim thay");
        }
        xuatmang(a);
    }
}

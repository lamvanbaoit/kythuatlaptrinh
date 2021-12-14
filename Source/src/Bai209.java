import java.util.Scanner;

public class Bai209 {
//    Bài 209: Tính tổng các giá trị đối xứng trong mảng các số nguyên
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int KiemTraTinhDoiXung(int n)
    {
        int donvi, tam = n;
        int sodaonguoc = 0;
        while(tam != 0)
        {
            donvi = tam % 10;
            sodaonguoc = sodaonguoc * 10 + donvi;
            tam /= 10;
        }
        if(sodaonguoc == n)
        {
            return 1;
        }
        return 0;
    }

    public static int Bai209(int[] a, int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(KiemTraTinhDoiXung(a[i]) == 1)
                sum += a[i];
        }
        return sum;
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
        int KQ = Bai209(a, n);
        System.out.println("Sum = " + KQ);
        xuatmang(a);
    }
}

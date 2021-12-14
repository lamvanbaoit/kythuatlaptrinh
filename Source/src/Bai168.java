import java.util.Scanner;

public class Bai168 {
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void xuatmang(int[] a) {
        System.out.print("Các phần tử của mảng là: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\t ");
    }

    public static int KiemTraDang5K(int x){
        if (x <= 1)
            return 1;
        while(x > 1)  // vòng lặp kết thúc khi n == 5
        {
            if(x % 5 != 0)  // Có thể viết n % 5
                return 0;
            x /= 5;
        }
        return 1;
    }

    public static int Bai168(int[] a, int n){
        int max = 0;
        int dem = 0;
        for(int i = 0; i < n; i++)
        {
            if (KiemTraDang5K(a[i]) == 1)
            {
                max = a[i];
                dem ++;
                break;
            }
        }
        if (dem == 0)
            return 0;
        for(int i = 0; i < n; i++)
            if (KiemTraDang5K(a[i]) == 1)
                max = (max > a[i]) ? max : a[i] ;
        return max;
    }

    public static void main(String[] argc) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);
        int kq = Bai168(a, n);
        System.out.println("Gia tri 5k lon nhat la: " + kq);
        xuatmang(a);
    }

}

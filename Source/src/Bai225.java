import java.util.Scanner;

public class Bai225 {
    // Bài 225: Đếm số lượng giá trị lớn nhất có trong mảng
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int Bai220(int[] a, int n){
        int dem = 0;
        int max = a[0];
        for(int i = 0; i < n; i++)
        {
            if(max == a[i])
            {
                dem++;
            }
            else if(a[i] > max)
            {
                max = a[i];
                dem = 1;
            }
        }
        return dem;
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
        int KQ = Bai220(a, n);
        System.out.println("So luong gia tri lon nhat la: " + KQ);
        xuatmang(a);
    }
}

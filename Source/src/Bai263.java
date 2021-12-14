import java.util.Scanner;

public class Bai263 {
    //Bài 263: Sắp xếp số dương tăng dần, âm giảm dần.
    // Vị trí tương đối không thay đổi
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void Bai263(int[] a, int n){
        int temp = 0;
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(a[i] > 0 && a[j] > 0 && a[i] > a[j])
                {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
                else if(a[i] < 0 && a[j] < 0 && a[i] < a[j])
                {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

    public static void xuatmang(int[] a) {
        System.out.print("Mang sau khi sap xep so duong tang dan, " +
                "so am giam dan nhung vi tri tuong doi giua cac so ko thay doi: ");
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
        Bai263(a, n);
        xuatmang(a);
    }
}

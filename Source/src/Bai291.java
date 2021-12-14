import java.util.Scanner;

public class Bai291 {
    //Bài 291: Biến đổi mảng bằng cách thay giá trị max = giá trị min và ngược lại
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void TimMinMax(int a[], int n, int max, int min)
    {
        max = a[0];
        min = a[0];
        for(int i = 1; i < n; i++)
        {
            max = (a[i] > max) ? a[i] : max;
            min = (a[i] < min) ? a[i] : min;
        }
    }

    public static void Bai291(int a[], int n, int max, int min)
    {
        for(int i = 0; i < n; i++)
        {
            if(a[i] == max)
            {
                a[i] = min;
            }
            else if(a[i] == min)
            {
                a[i] = max;
            }
        }
    }

    public static void xuatmang(int[] a) {
        System.out.println("Các phần tử của mảng là: ");
        for(int i = 0; i < a.length; i++) {
            System.out.println("Dao nguoc min bang max va nguoc lai: " + a[i]);
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);
        int max=0,min = 0;
        Bai291(a,n,max,min);
        xuatmang(a);
    }
}

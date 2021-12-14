import java.util.Scanner;

public class Bai290 {
    //Bài 290: Đảo ngược thứ tự số chẵn và lẻ trong mảng nhưng giữ vị trí tương đối
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void Bai290(int a[], int n)
    {
        int temp = 0;
        int i, j;
        for(i = 0; i < n; i++)
        {
            for(j = i + 1; j < n; j++)
            {
                if(a[i] % 2 == 0 && a[j] % 2 == 0)
                {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
                else if(a[i] % 2 != 0 && a[j] % 2 != 0)
                {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

    public static void xuatmang(int[] a) {
        System.out.println("Các phần tử của mảng là: ");
        for(int i = 0; i < a.length; i++) {
            System.out.println("Dao nguoc chan le: " + a[i]);
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);
        Bai290(a,n);
        xuatmang(a);
    }
}

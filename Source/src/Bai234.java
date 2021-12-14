import java.util.Scanner;

public class Bai234 {
    // Bài 234: Cho 2 mảng a, b.
    // Đếm số lượng giá trị chỉ xuất hiện 1 trong 2 mảng
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int Bai234(int[] a, int[] b, int na, int nb){
        int flag, dem = 0;
        for(int i = 0; i < na; i++)
        {
            flag = 1;
            for(int j = 0; j < nb; j++)
            {
                if(a[i] == b[j])
                {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1)
            {
                dem++;
            }
        }
        for(int i = 0; i < nb; i++)
        {
            flag = 1;
            for(int j = 0; j < na; j++)
            {
                if(b[j] == a[i])
                {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1)
            {
                dem++;
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
        System.out.print("Nhập số phần tử của mảng 1: ");
        Scanner sc2 = new Scanner(System.in);
        int na = sc2.nextInt();
        int[] a = nhapmang(na);
        xuatmang(a);
        System.out.print("Nhập số phần tử của mảng 2: ");
        Scanner sc3 = new Scanner(System.in);
        int nb = sc3.nextInt();
        int[] b = nhapmang(nb);
        xuatmang(b);

        int KQ = Bai234(a, b, na, nb);
        System.out.println("So phan tu chi xuat hien 1 trong 2 mang la: "+ KQ);
    }
}

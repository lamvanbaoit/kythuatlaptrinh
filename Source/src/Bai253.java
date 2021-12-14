import java.util.Scanner;

public class Bai253 {
    // Bài 253: Hãy cho biết tất cả các phần tử trong mảng a có nằm trong mảng b không
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int Bai253(int[] a, int[] b, int na, int nb){
        int flag = 0;
        int dem = 0;
        for(int i = 0; i < na; i++)
        {
            for(int j = 0; j < nb; j++)
            {
                if(a[i] == b[j])
                {
                    dem++;
                }
            }
        }
        if(dem == na)
        {
            flag = 1;
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

        int flag = Bai253(a,b,na,nb);
        if(flag == 1)
        {
            System.out.println("Tat ca cac phan tu trong mang A deu nam trong mang B");
        }
        else
        {
            System.out.println("Khong thoa DK");
        }
        xuatmang(a);
    }
}

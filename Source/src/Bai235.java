import java.util.Scanner;

public class Bai235 {
    // Bài 235: Cho 2 mảng a, b.
    // Liệt kê các giá trị chỉ xuất hiện 1 trong 2 mảng
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void Bai235(int[] a, int[] b, int na, int nb){
        int i, j, flag;
        for(i = 0; i < na; i++)
        {
            flag = 1;
            for(j = 0; j < nb; j++)
            {
                if(a[i] == b[j])
                {
                    flag = 0;
                    System.out.println("Trong mang A co phan tu a["+i+"] = " + a[i] + " nam trong mang B");
                    break;
                }
            }
            if(flag == 1)
                System.out.println(a[i]);
        }
        for(i = 0; i < nb; i++)
        {
            flag = 1;
            for(j = 0; j < na; j++)
            {
                if(b[i] == a[j])
                {
                    flag = 0;
                    System.out.println("Trong mang B co phan tu a["+i+"] = " + a[i] + " nam trong mang A");
                    break;
                }
            }
            if(flag == 1)
                System.out.println(b[i]);
        }
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

        Bai235(a, b, na, nb);
    }
}

import java.util.Scanner;

public class Bai292 {
    //Bài 292: Biến đổi mảng số thực bằng cách thay tất cả phần tử trong mảng bằng số nguyên
    // gần nó nhất (giống làm tròn)
    public static float[] nhapmang(int n){
        float[] a = new float[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextFloat();
        }
        return a;
    }

    public static void Bai292(float a[], float n)
    {
        int phannguyen = (int)(n);
        float phanle = n - phannguyen;
        for(int i = 0; i < n; i++)
        {

            // làm tròn
            if(phanle <= 0.5)
            {
                n = (float)phannguyen;
            }
            else
            {
                n = (float)phannguyen + 1;
            }
        }
    }

    public static void xuatmang(float[] a) {
        System.out.println("Các phần tử của mảng là: ");
        for(int i = 0; i < a.length; i++) {
            System.out.println("Mang sau khi lam tron: " + a[i]);
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        float[] a = nhapmang(n);
        Bai292(a,n);
        xuatmang(a);
    }
}

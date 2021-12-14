import java.util.Scanner;

import static java.lang.StrictMath.abs;

//Bài 158: Cho mảng 1 chiều các số thực, hãy tìm giá trị x sao cho đoạn [-x, x] chứa tất cả các giá trị trong mảng.
public class Bai158 {

    public static float[] nhapmang(int n){
        float a[] = new float[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap cac phan tu cua mang a ["+ i +"]: ");
            a[i] = sc.nextFloat();
        }

        return a;
    }

    public static float Bai158(float[] a, int n){
        float x = a[0];
        for (int i = 1; i < n; i++) {
            x = x > abs(a[i]) ? x : abs(a[i]);
        }
        return x;
    }

    public static float[] xuatmang(float[] a){
        System.out.print("Cac phan tu cua mang la: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        return a;
    }

    public static void main(String[] argc){
        System.out.print("Nhap so phan tu trong mang: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] a = nhapmang(n);
        float kq = Bai158(a,n);
        System.out.println(kq);
        xuatmang(a);
    }
}

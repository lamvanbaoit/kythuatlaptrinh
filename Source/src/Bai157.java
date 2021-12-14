import java.util.Scanner;
//Bài 157: Cho mảng 1 chiều các số thực, hãy tìm đoạn [a, b]
// sao cho đoạn này chứa tất cả các giá trị trong mảng
public class Bai157 {
    public static float[] nhapmang(int n){
        float[] a = new float[n];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.print("Nhap cac phan tu cua mang a["+ i +"]: ");
            a[i] = sc.nextFloat();
        }
        return a;
    }

    public static void Bai157(float[] a, int n){
        float Max = a[0];
        float Min = a[0];
        for (int i = 0; i < n; i++) {
            Max = a[i] > Max ? a[i] : Max;
            Min = a[i] < Min ? a[i] : Min;
        }
        System.out.println("["+ Max + " " + Min + "] la doan chua cac gia tri trong mang");
    }

    public static void xuatmang(float[] a) {
        System.out.print("Cac phan tu cua mang la: ");
        for(float i = 0; i < a.length; i++) {
            System.out.print(a[(int)i] + " ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc){
        System.out.print("Nhap so phan tu trong mang: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] a = nhapmang(n);
        Bai157(a,n);
        xuatmang(a);
    }
}

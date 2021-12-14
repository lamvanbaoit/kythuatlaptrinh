import java.util.Scanner;

public class Bai160 {
// Cho mảng 1 chiều các số thực, hãy tìm giá trị âm cuối cùng lớn hơn giá trị -1.
// Nếu mảng không có giá trị thỏa điều kiện trên thì trả về -1.
    public static float[] nhapmang(int n){
        float[] a = new float[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a["+ i +"]: ");
            a[i] = sc.nextFloat();
        }
        return a;
    }

    public static float Bai160(float[] a, int n){
        for (int i = n-1; i >= 0; i--) {
            if(a[i] > -1 &&  a[i] < 0){
                return  a[i];
            }
        }
        return -1;
    }


    public static void xuatmang(float[] a) {
        System.out.print("Các phần tử của mảng là: ");
        for(float i = 0; i < a.length; i++) {
            System.out.print(a[(int)i] + " ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc){
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] a = nhapmang(n);
        float kq = Bai160(a,n);
        System.out.println("Gia tri am cuoi cung lon hon gia tri -1 la: " + kq);
        xuatmang(a);
    }
}

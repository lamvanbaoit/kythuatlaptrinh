import java.util.Scanner;

public class Bai159 {
// Cho mảng một chiều các số thực hãy tìm giá trị đầu tiên lớn hơn giá trị 2003
// (dautien). Nếu mảng không có giá trị thỏa điều kiện trên
// thì hàm trả về giá trị là 0.
    public static float[] nhapmang(int n){
        float[] a = new float[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a["+ i +"]: ");
            a[i] = sc.nextFloat();
        }
        return a;
}
    public static float Bai159(float[] a, int n){
        float Max = 2003;
        for (int i = 0; i < n; i++) {
            if(a[i] > Max){
                return  Max = a[i];
            }
        }
        return 0;
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
        float kq = Bai159(a,n);
        System.out.println("Giá trị đầu tiên lớn hơn 2003 là: " + kq);
        xuatmang(a);
    }
}

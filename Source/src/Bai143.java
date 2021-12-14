import java.util.Scanner;

public class Bai143 {
    // Viết hàm tìm số chẵn đầu tiên trong mảng các số nguyên.
    // Nếu mảng không có giá trị chẵn thì trả về -1.
    public static float[] InputArray(int n){
        float[] a;
        a = new float[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextFloat();
        }
        return a;
    }

    public static float Bai143(float[] a, int n){
        for(int i = 0; i < n; ++i){
            if(a[i] % 2 == 0){
                return a[i];
            }
        }
        return -1;
    }

    public static void PrintArray(float[] a) {
        System.out.print("Các phần tử của mảng là: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc){
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc = new Scanner(System.in);
        int n = (int) sc.nextFloat();
        float[] a = InputArray(n);
        float kq = Bai143(a,n);
        System.out.println("Gia tri dau tien: " + kq);
        PrintArray(a);
    }

}

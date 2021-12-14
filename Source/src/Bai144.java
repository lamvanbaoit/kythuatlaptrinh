import java.util.Scanner;

public class Bai144 {
    // Tìm số nguyên tố đầu tiên trong mảng 1 chiều các số nguyên.
    // Nếu mảng không có số nguyên tố thì trả về – 1.
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

    public static int kiemtrasonguyento(int n){
        if(n < 2)
            return 0;
        for(int i = 2; i < n; ++i){
            if(n%i==0)
                return 0;
        }
        return 1;
    }

    public static int Bai144(float[] a, int n){
        for(int i = 0; i < n; ++i){
            if(kiemtrasonguyento((int) a[i]) == 1){
                return (int) a[i];
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
        int kq =  Bai144(a,n);
        System.out.println("Gia tri nguyen to dau tien: " + kq);
        PrintArray(a);
    }
}

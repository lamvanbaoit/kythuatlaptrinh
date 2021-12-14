import java.util.Scanner;
// Kỹ thuật đếm
public class Bai125 {
    // Viết hàm đếm số lượng số nguyên tố nhỏ hơn 100 trong mảng
    public static int[] InputArray(int n){
        int[] a = new int[n];
        for(int i = 0; i < n; ++i){
            System.out.print("Nhập các phần tử của  mảng: a[" + i +"]: ");
            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int KiemTraNguyenTo(int n){
        if(n<2){
            return 0;
        }
        for (int i = 2; i<Math.sqrt(n); ++i){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }

    public static void Bai125(int[] a, int n){
        int count = 0;
        for (int i = 0; i < n; ++i){
            if(KiemTraNguyenTo(a[i]) == 1 && a[i] < 100){
                count += 1;
            }
        }
        System.out.println("Số lượng nguyên tố nhỏ hơn 100 là: " + count);
    }

    public static void PrintArray(int[] a) {
        System.out.print("Các phần tử của  mảng: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc){
        System.out.print("Nhập số phần tử của  mảng là: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = InputArray(n);
        Bai125(a,n);
        PrintArray(a);
    }
}
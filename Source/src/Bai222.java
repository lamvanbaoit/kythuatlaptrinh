import java.util.Scanner;

public class Bai222 {
//    Bài 222: Đếm phần tử lớn hơn hay nhỏ hơn phần tử xung quanh mảng
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int Bai222(int[] a, int n){
        int count = 0;
        for (int i = 0; i <n ; i++) {
            if(i == 0 && a[i] != a[i+1]){
                count++;
            }else if(i == n-1 && a[i-1] != a[i]){
                count++;
            }else if((a[i - 1] > a[i] && a[i] < a[i + 1]) || (a[i - 1] < a[i] && a[i] > a[i + 1])){
                count++;
            }
        }
        return count;
    }

    public static void xuatmang(int[] a) {
        System.out.print("Các phần tử của mảng là: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);
        int KQ = Bai222(a, n);
        System.out.println("So luong phan tu lon hon hoac nho hon phan tu xung quanh: " + KQ);
        xuatmang(a);
    }
}

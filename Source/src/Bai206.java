import java.util.Scanner;

public class Bai206 {
//Bài 206: Tính tổng các giá trị lớn hơn các giá trị xung quanh trong mảng 1 chiều các số thực
//Lưu ý: Một giá trị trong mảng có tối đa 2 giá trị xung quang
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int Bai206(int[] a, int n){
        int sum = 0 ;
        for (int i = 0; i < n; i++) {
            if (i == 0 && a[i] > a[i+1]) { // phần đầu
                sum += a[i];
            }
            else if (i != 0 && a[i] > a[i+1] && a[i] > a[i-1]) { // phần giữa
                sum += a[i];
            }
            else if(i == n-1 && a[i] > a[i-1] ){ // // phần cuối
                sum += 0;
            }
        }
        return sum;
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
        int KQ = Bai206(a, n);
        System.out.println("Sum = " + KQ);
        xuatmang(a);
    }
}

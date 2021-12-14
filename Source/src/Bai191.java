import java.util.Scanner;

public class Bai191 {
//    Bài 191: Hãy liệt kê các giá trị cực đại trong mảng 1 chiều các số thực.
//    Một phần tử được gọi là cực đại khi lớn hơn các phần tử lân cận

    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void Bai191(int a[], int n){
        for (int i = 0; i < n-1 ; i++) {
            if(a[i] > a[i+1] && a[i] > a[i-1]){
                System.out.println("Cac phan tu cuc dai la: " + a[i]);
            }
        }
    }

    public static void xuatmang(int[] a) {
        System.out.print("Các phần tử của mảng là: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc){
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);
        Bai191(a,n);
        xuatmang(a);
    }
}

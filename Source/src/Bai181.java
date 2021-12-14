import java.util.Scanner;

public class Bai181 {
    // Bài 181: Cho mảng 1 chiều các số nguyên.
    // Hãy viết hàm liệt kê các giá trị chẵn
    // có ít nhất 1 lân cận cũng là giá trị chẵn
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void Bai181(int a[], int n){
        int flag = 0;
        for (int i = 0; i <n ; i++) {
            if( a[i]%2==0 && a[i-1]%2 == 0 || a[i+1]%2 == 0){
                flag = 1;
                System.out.println(a[i]);
            }
        }
        if(flag == 0)
            System.out.println("Mảng ko có giá trị đó.");
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
        Bai181(a,n);
        xuatmang(a);
    }
}

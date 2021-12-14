import java.util.Scanner;

public class Bai182 {
//    Bài 182: Cho mảng 1 chiều các số thực.
//    Hãy viết hàm liệt kê tất cả các giá trị trong mảng
//    có ít nhất 1 lận cận trái dấu với nó
public static int[] nhapmang(int n){
    int[] a = new int[n];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
        System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
        a[i] = sc.nextInt();
    }
    return a;
}

    public static void Bai182(int a[], int n){
        int flag = 0;
        for (int i = 0; i <n ; i++) {

            if((a[i] * a[i - 1] < 0) || (a[i] * a[i + 1] < 0)){
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
        Bai182(a,n);
        xuatmang(a);
    }

}

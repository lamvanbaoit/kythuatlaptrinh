import java.util.Scanner;

public class Bai186 {
    //Bài 186: Hãy liệt kê các vị trí trong mảng 1 chiều các số thực
    // mà giá trị tại đó bằng giá trị âm đầu tiên trong mảng
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int Am(int n, int a[]){
        for (int i = 0; i < n; i++) {
            if(a[i] < 0){
                return a[i];
            }
        }
        return 0;
    }

    public static void Bai186(int a[], int n){
        for (int i = 0; i <n ; i++) {
            if(a[i] ==  Am(n,a)){
                System.out.println("Vị trí âm đầu tiên: " + i);
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
        Bai186(a,n);
        xuatmang(a);
    }
}

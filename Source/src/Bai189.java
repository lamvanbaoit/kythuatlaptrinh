import java.util.Scanner;

public class Bai189 {
//Bài 189: Hãy liệt kê các giá trị trong mảng 1 chiều
// các số nguyên có chữ số đầu tiên là chữ số lẻ
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int TimChuSoDauLe(int n){
        int dv;
        while (n >= 10){
            dv = n % 10;
            n = n / 10;
        }
        if(n % 2 == 0){
            return 0;
        }
        return 1;
    }

    public static void Bai189(int a[], int n){
        for (int i = 0; i <n ; i++) {
            if(TimChuSoDauLe(a[i]) == 1){
                System.out.println("Cac so co chu so dau le la: " + a[i]);
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
        Bai189(a,n);
        xuatmang(a);
    }
}


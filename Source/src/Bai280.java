import java.util.Scanner;

public class Bai280 {
    //Bài 280: Hãy đưa số 1 về đầu mảng
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void DoiCho(int a[], int n, int vitridoi){
        for (int i = vitridoi; i < n; i--) {
            a[i] = a[i-1];
        }
        a[0] = 1;
    }


    public static void Bai280(int[] a, int n){
        for (int i = 0; i < n; i++) {
            if(a[i] == 1){
                DoiCho(a,n,i);
            }
        }
    }

    public static void xuatmang(int[] a) {
        System.out.print("");
        for(int i = 0; i < a.length; i++) {
            System.out.print("Đưa số 1 về đầu mảng: ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);
        Bai280(a, n);
        xuatmang(a);
    }
}

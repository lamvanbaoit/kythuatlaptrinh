import java.util.Scanner;

public class Bai188 {
// Bài 188: Hãy liệt kê các vị trí chẵn lớn nhất trong mảng 1 chiều
// các số nguyên
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int SoChanDauTien(int n, int a[]){
        for (int i = 0; i < n; i++) {
            if(a[i]%2 == 0){
                return a[i];
            }
        }
        return 0;
    }

    public static int SoChanLonNhat(int n, int a[]){
        int SoChanLonNhat = SoChanDauTien(n,a);
        for (int i = 0; i < n; i++) {
            if(a[i]%2 == 0 && a[i] > SoChanLonNhat ){
                SoChanLonNhat = a[i];
            }
        }
        return SoChanLonNhat;
    }


    public static void Bai188(int a[], int n){
        for (int i = 0; i <n ; i++) {
            if(a[i] ==  SoChanLonNhat(n,a)){
                System.out.println("Vị trí chẵn lớn nhất: " + i);
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
        Bai188(a,n);
        xuatmang(a);
    }
}

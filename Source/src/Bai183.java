import java.util.Scanner;

public class Bai183 {
    //Bài 183: Hãy liệt kê các vị trí mà giá trị tại đó
    // là giá trị tại đó là giá trị lớn nhất trong mảng 1 chiều các số thực
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int TimMax(int a[], int n){
        int Max = a[0];
        for (int i = 0; i < n; i++) {
            if(a[i] > Max)
                Max = a[i];
        }
        return Max;
    }

    public static void Bai183(int a[], int n){
        int Max = TimMax(a,n);
        for (int i = 0; i <n ; i++) {
            if(a[i] == Max){
                System.out.println("Vi tri ma gia tri tai do lon nhat la: " + i);
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
        Bai183(a,n);
        xuatmang(a);
    }
}

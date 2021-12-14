import java.util.Scanner;

public class Bai187 {

    //Bài 187: Hãy liệt kê các vị trí mà giá trị tại các vị trí đó
    // bằng giá trị dương nhỏ nhất trong mảng 1 chiều các số thực
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int timduongdautien(int n, int a[]){
        for (int i = 0; i < n; i++) {
            if(a[i] > 0){
                return a[i];
            }
        }
        return 0;
    }

    public static int timgiatriduongnhonhat(int n, int a[]){
        int duongnhonhat = timduongdautien(n,a);
        for (int i = 0; i < n; i++) {
            if(a[i] > 0 && a[i] < duongnhonhat){
                duongnhonhat = a[i];
            }
        }
        return duongnhonhat;
    }

    // Cách 2
//    public static int timgiatriduongnhonhat(int n, int a[]){
//        int Max = a[0];
//        for (int i = 0; i < n; i++) {
//            if(a[i] > Max){
//                return a[i];
//            }
//        }
//        return 0;
//    }

    public static void Bai187(int a[], int n){
        for (int i = 0; i <n ; i++) {
            if(a[i] ==  timgiatriduongnhonhat(n,a)){
                System.out.println("Vi tri ma gia tri tai do bang gia tri duong nho nhat: " + i);
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
        Bai187(a,n);
        xuatmang(a);
    }
}

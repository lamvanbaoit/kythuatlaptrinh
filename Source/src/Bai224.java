import java.util.Scanner;

public class Bai224 {
//    Bài 224: Đếm số hoàn thiện trong mảng
public static int[] nhapmang(int n){
    int[] a = new int[n];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
        System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
        a[i] = sc.nextInt();
    }
    return a;
}

    public static boolean kientrasohoanthiet(int n){
        int s = 0;
        for(int i = 1; i < n; ++i){
            if(n%i == 0){
                s += i;
            }
        }
        if(s==n)
            return true;
        return false;
    }

    public static int Bai224(int[] a, int n){
        int count = 0;
        for(int i =  0; i < n; i++){
            if (kientrasohoanthiet( a[i])== true) {
                count++;
            }
        }
        return count;
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = nhapmang(n);
        int kq = Bai224(a,n);
        System.out.println("So luong so hoan thien la: " + kq);
        xuatmang(a);
    }
}

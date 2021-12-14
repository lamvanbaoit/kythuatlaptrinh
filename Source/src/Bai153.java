import java.util.Scanner;

public class Bai153 {
    // Hãy tìm giá trị chẵn nhỏ nhất trong mảng 1 chiều các số nguyên.
    // Nếu mảng không có số chẵn thì trả về -1
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int timvitrichandau(int[] a, int n){
        for(int i = 0; i < n; ++i){
            if(a[i]%2==0){
                return i;
            }
        }
        return -1;
    }

    public static int Bai153(int[] a, int n){
        int minchan = a[0];
        for(int i = 0; i < n; ++i){
            if(a[i]%2==0 && a[i] < minchan){
                minchan = a[i];
            }
        }
        if(timvitrichandau(a, n) == -1)
            return -1;
        return minchan;
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
        int kq = Bai153(a,n);
        System.out.println("Giá trị chẳn nhỏ nhất: " + kq);
        xuatmang(a);
    }
}

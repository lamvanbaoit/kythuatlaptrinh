import java.util.Scanner;

public class Bai228 {
//    Bài 228: Hãy xác định số lượng phần tử kề nhau
//    mà số đứng sau cùng dấu số đứng trước và có giá trị tuyệt đối lớn hơn
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int Bai228(int[] a, int n){
        int dem = 0;
        for(int i = 0; i < n; i++)
        {
            if(a[i] * a[i - 1] > 0 && Math.abs(a[i - 1]) < Math.abs(a[i]))
            {
                dem++;
            }
        }
        return dem;
    }

    public static void xuatmang(int[] a) {
        System.out.print("Các phần tử của mảng là: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);
        int KQ = Bai228(a, n);
        System.out.println("So luong phan tu ke nhau ma so dung sau cung dau" +
                " so dung truoc va co tri tuyet doi lon hon: " + KQ);
        xuatmang(a);
    }
}

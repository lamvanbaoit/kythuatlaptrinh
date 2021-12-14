import java.util.Scanner;

public class Bai271 {
    //Bài 271: Xóa các phần tử có chỉ số k trong mảng
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void Bai271(int[] a, int n, int ViTriXoa){
        for(int i = ViTriXoa; i < n; i++)
        {
            a[i] = a[i + 1];
        }
        n--;
    }

    public static void xuatmang(int[] a) {
        System.out.print("");
        for(int i = 0; i < a.length; i++) {
            System.out.print("Mang sau khi xoa phan tu tai vi tri: ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);

        int ViTriXoa;
        do
        {
            System.out.println("Nhap vao vi tri xóa: ");
            Scanner sc3 = new Scanner(System.in);
            ViTriXoa = sc3.nextInt();

            if (ViTriXoa < 0 || ViTriXoa > n)
            {
                System.out.print("Vi tri khong hop le. Xin kiem tra lai !");
            }
        } while (ViTriXoa < 0 || ViTriXoa > n);



        Bai271(a, n, ViTriXoa);
        xuatmang(a);
    }
}

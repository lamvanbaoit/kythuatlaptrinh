import java.util.Scanner;

public class Bai266 {
    // Bài 266: Thêm 1 phần tử x vào mảng tại vị trí k
    public static int[] nhapmang(int n){
    int[] a = new int[n];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
        System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
        a[i] = sc.nextInt();
    }
    return a;
}

    public static void Bai266(int[] a, int n, int ViTriThem, int PhanTuThem){
        for(int i = n; i > ViTriThem; i--)
        {
            a[i] = a[i - 1];
        }
        a[ViTriThem] = PhanTuThem;
        n++;
    }

    public static void xuatmang(int[] a) {
        System.out.print("");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "Mang sau khi them: ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);

        int ViTriThem, PhanTuThem;

        // 0 <= ViTriThem <= n
        do
        {
            System.out.println("Nhap vao vi tri can them " + 0 +" đến "+ (n-1));
            Scanner sc3 = new Scanner(System.in);
            ViTriThem = sc3.nextInt();

            if (ViTriThem < 0 || ViTriThem > n)
            {
                System.out.print("Vi tri khong hop le. Xin kiem tra lai !");
            }
        } while (ViTriThem < 0 || ViTriThem > n);

        System.out.println("Nhap vao phan tu can them: ");
        Scanner sc4 = new Scanner(System.in);
        PhanTuThem = sc4.nextInt();

        Bai266(a, n, ViTriThem, PhanTuThem);
        xuatmang(a);
    }

}

import java.util.Scanner;

public class Bai230 {

    // Bài 230: Liệt kê tần suất xuất hiện các giá trị trong mảng
    // (mỗi giá trị liệt kê 1 lần)
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void Bai230(int[] a, int n){
        for(int i = 0; i < n; i++)
        {
            int dem = 0;
            for(int j = 0; j < n; j++) // j chạy từ 0
            {
                if(a[i] == a[j])
                {
                    if(i <= j)
                    {
                        dem++;
                    }
                    else
                    {
                        break;    // bỏ qua phần tử bị trùng
                    }
                }
            }
            if(dem != 0)
            {
                System.out.println("Gia tri "+ a[i] + " co tan suat xuat hien la " + dem);
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

    public static void main(String[] argc) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);
        Bai230(a, n);
       xuatmang(a);
    }
}

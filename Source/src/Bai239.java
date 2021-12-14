import java.util.Scanner;

public class Bai239 {
    // Bài 239: Hãy đếm số lượng số nguyên tố phân biệt trong mảng
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int KiemTraNguyenTo(int x){
        if (x < 2)
        {
            return 0;
        }
        else if (x > 2)
        {
            if (x % 2 == 0)
            {
                return 0;
            }
            for (int i = 3; i <= Math.sqrt((float)x); i += 2)
            {
                if (x % i == 0)
                {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static int KiemTraBiTrung(int a[], int n, int index)
    {
        for (int i = index - 1; i >= 0; i--)
        {
            if (a[i] == a[index])
            {
                return 0; // Bị trùng
            }
        }
        return 1; // Không bị trùng
    }

    public static int Bai239(int[] a, int n){
        int dem = 0;
        for(int i = 0; i < n; i++)
        {
            int CheckTrung = KiemTraBiTrung(a, n, i);
            {
                if (CheckTrung == 1)  // chỉ xử lý khi không trùng
                {
                    if(KiemTraNguyenTo(a[i]) == 1)
                    {
                        dem++;
                    }
                }
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
        int dem = Bai239(a, n);
        System.out.println("So luong so nguyen to phan biet " + dem);
        xuatmang(a);
    }
}

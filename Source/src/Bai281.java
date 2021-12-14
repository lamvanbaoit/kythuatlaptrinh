import java.util.Scanner;

public class Bai281 {
    //Bài 281: Hãy đưa chẵn về đầu, lẻ về cuối, phần tử 0 nằm giữa mảng
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void DuaChanVeDau(int a[], int vitridoi){
        int temp = a[vitridoi];
        for (int i = vitridoi; i > 0; i--) {
            a[i] = a[i-1];
        }
        a[0] = temp;
    }

    public static void Dua0VaoGiua(int a[], int vitridoi, int vitrichancuoi){
        // Do 0 nằm giữa mảng nên 0 sẽ là giá trị chẵn cuối để thỏa yêu cầu bài toán
        for(int i = vitridoi; i > vitrichancuoi; i--)
        {
            a[i] = a[i - 1];
        }
        a[vitrichancuoi] = 0;
    }


    public static void Bai281(int[] a, int n){
        int i, dem;
        int ViTriChanCuoi = 0;
        for(i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0 && a[i] != 0)
            {
                DuaChanVeDau(a, i);
            }
        }
        for(i = 0; i < n; i++)
        {
            if(a[i] % 2 != 0)
            {
                ViTriChanCuoi = i;
                break;
            }
        }
        for(i=0; i < n; i++) // bỏ khởi tạo i để tránh dư 1 số 0
        {
            if(a[i] == 0)
            {
                Dua0VaoGiua(a, i, ViTriChanCuoi);
            }
        }
    }

    public static void xuatmang(int[] a) {
        System.out.print("");
        for(int i = 0; i < a.length; i++) {
            System.out.print("Dua chan ve dau, le ve cuoi, 0 nam giua mang: ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);
        Bai281(a, n);
        xuatmang(a);
    }
}

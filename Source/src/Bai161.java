import java.util.Scanner;

public class Bai161 {
    // 161. Cho mảng một chiều các số nguyên, hãy tìm giá trị đầu tiên trong mảng nằm trong khoảng (x,y)
    // cho trước (dautientrongdoan). Nếu mảng không có giá trị thỏa điều kiện trên thì hàm trả về giá trị là x.
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void xuatmang(int[] a) {
        System.out.print("Các phần tử của mảng là: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\t ");
    }

    public static int Bai162(int[] a, int x, int y, int n){
        int dem = 0;
        int i;
        for (i = 0; i < n ; i++) {
            if(a[i] >= x && a[i] <= y){
                dem++;
                break;
            }
        }
        if(dem == 0) {
            return x;
        }
        return a[i];
    }

    public static void main(String[] argc){
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);

        int x = 10;
        int y = 20;

        int  kq = Bai162(a,x,y,n);
        System.out.println("Gia tri dau tien nam trong doan [" + x + " "+ y + "] la: " + kq);

        xuatmang(a);
    }
}

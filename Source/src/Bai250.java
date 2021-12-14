import java.util.Scanner;

public class Bai250 {
    // Bài 250: Hảy cho biết các phần tử trong mảng có lập thành cấp số cộng hay không? Nếu có chỉ ra công sai d
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int Bai250(int[] a, int n, int d){
        d = a[1] - a[0];
        int flag = 1;
        for(int i = 2; i < n - 1; i++)
        {
            if((a[i + 1] - a[i]) != d)
            {
                flag = 0;
                break;
            }
        }
        return flag;
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
        int d = 0;
        int flag = Bai250(a, n, d);
        if(flag == 1)
        {
            System.out.println("Cac phan tu trong mang lap thanh cap so cong voi cong sai d = " + d);
        }
        else
        {
            System.out.println("Khong thoa DK");
        }
        xuatmang(a);
    }
}

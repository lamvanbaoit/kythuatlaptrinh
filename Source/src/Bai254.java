import java.util.Scanner;

public class Bai254 {
    // Bài 254: Hãy đếm giá trị trong mảng thỏa: 
    // lớn hơn tất cả các giá trị đứng đằng trước nó
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int Bai254(int[] a, int n){
        int dem = 0;
        for(int i = 1; i < n; i++)
        {
            int flag = 1;
            for(int j = 0; j < i; j++)
            {
                if(a[i] < a[j] || a[i] == a[j])
                {
                    flag = 0;
                }
            }
            if(flag == 1)
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
        int dem = Bai254(a, n);
        System.out.println("Gia tri trong mang thoa: lon hon tat ca cac gia tri dang truoc no " + dem);
    }
}

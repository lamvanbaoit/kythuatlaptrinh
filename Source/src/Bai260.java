import java.util.Scanner;

public class Bai260 {
//    Bài 260: Cho 2 mảng a, b. Hãy cho biết mảng b có phải là hoán vị của mảng a không
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void SapXepTangDan(int a[], int n) {
        int temp = 0;
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(a[i] > a[j])
                {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

    public static void Bai260(int[] a, int[] b, int na, int nb){
        if(na != nb)
        {
            System.out.println("Khong phai");
            // Số lượng phần tử phải bằng nhau
        }
        SapXepTangDan(a, na);           // Sắp xếp mảng a
        SapXepTangDan(b, nb);           // Sắp xếp mảng b
        for(int i = 0; i < na; i++)
        {
            if(a[i] != b[i])
            {
                System.out.println("Khong phai");
            }
        }
        System.out.println("Phai");
    }


    public static void xuatmang(int[] a) {
        System.out.print("Các phần tử của mảng là: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc) {
        System.out.print("Nhập số phần tử của mảng 1: ");
        Scanner sc2 = new Scanner(System.in);
        int na = sc2.nextInt();
        int[] a = nhapmang(na);
        xuatmang(a);
        System.out.print("Nhập số phần tử của mảng 2: ");
        Scanner sc3 = new Scanner(System.in);
        int nb = sc3.nextInt();
        int[] b = nhapmang(nb);
        xuatmang(b);

        Bai260(a, b, na, nb);
    }
}

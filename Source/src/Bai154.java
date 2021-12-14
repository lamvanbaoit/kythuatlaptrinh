import java.util.Scanner;

public class Bai154 {
    // Hãy tìm vị trí giá trị âm nhỏ nhất trong mảng các số thực. Nếu mảng không có số âm thì trả về -1
    public static float[] nhapmang(int n){
        float[] a = new float[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a["+ i +"]: ");
            a[i] = sc.nextFloat();
        }
        return a;
    }

    public static float timvitriamdau(float[] a, int n){
        for (int i = 0; i < n; i++) {
            if(a[i] < 0)
                return a[i];
        }
        return -1;
    }

    private static float Bai154(float[] a, int n){
        float minam = a[0];
        for (int i = 0; i < n; i++) {
            if(a[i] < 0 && a[i] < minam){
                minam = a[i];
            }
        }
        if (timvitriamdau(a,n) == -1)
            return -1;
        return minam;
    }

    public static void xuatmang(float[] a) {
        System.out.print("Các phần tử của mảng là: ");
        for(float i = 0; i < a.length; i++) {
            System.out.print(a[(int)i] + " ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc){
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] a = nhapmang(n);
        float kq = Bai154(a,n);
        System.out.println("Giá trị âm nhỏ nhât: " + kq);

        xuatmang(a);
    }
}

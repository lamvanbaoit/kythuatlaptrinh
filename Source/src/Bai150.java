import java.util.Scanner;

public class Bai150 {
    // Hãy tìm giá trị âm lớn nhất trong mảng 1 chiều các số thực.
    // Nếu mảng không có giá trị âm thì trả về -1
    public static float[] nhapmang(int n){
        float[] a = new float[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextFloat();
        }
        return a;
    }

    public static float Bai150(float[] a, int n){
        float max = 0;
        int dem =0;
        int i;
        for (i=0; i<n; i++)
        {
            if(a[i]<0)
            {
                dem++;
                max = a[i];
                break;
            }
        }
        if (dem ==0)
            return 0;
        for (i=i+1; i<n; i++)
        {
            if((a[i]<0)&&(max<a[i]))
            {
                max = a[i];
            }
        }
        return max;
    }

    public static void xuatmang(float[] a) {
        System.out.print("Các phần tử của mảng là: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc){
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] a = nhapmang(n);
        float kq = Bai150(a,n);
        System.out.println("Gia tri am lon nhat trong mang: " + kq);
        xuatmang(a);
    }
}

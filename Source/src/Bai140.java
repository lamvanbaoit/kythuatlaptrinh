import java.util.Scanner;

public class Bai140 {
    // Hãy tìm giá trị dương nhỏ nhất trong mảng 1 chiều các số thực.
    // Nếu mảng không có giá trị dương thì sẽ trả về -1
    public static float[] InputArray(int n){
        float[] a = new float[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextFloat();
        }
        return a;
    }

    public static float Bai140(float[] a, int n){
        float min;
        int count = 0;
        int i;
        for(i = 0; i < n; ++i){
            if(a[i] > 0){ // kiểm tra đó có phải là số dương hay không
                count++; // điếm số lượng dương.
                break;
            }
        }
        if (count !=0)
        {
            min = a[i];
            for (i=i+1; i<n; i++)
            {
                if((a[i]>0)&&(a[i]<min))
                {
                    min = a[i];
                }
            }
            return min;
        }
        return -1;
    }

    public static void PrintArray(float[] a) {
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
        float[] a = InputArray(n);
        float kq = Bai140(a,n);
        System.out.println("Vị trí giá trị dương nhỏ nhất: " + kq);
        PrintArray(a);
    }
}

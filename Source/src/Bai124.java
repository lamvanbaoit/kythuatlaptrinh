import java.util.Scanner;
// Kỹ thuật cờ hiệu.
public class Bai124 {
    // Viết hàm kiểm tra trong mảng các số nguyên có tồn tại giá trị chẵn nhỏ hơn 2004 hay không.

    public static int[] InputArray(int n){
        int[] a = new int[n];
        for(int i = 0; i < n; ++i){
            System.out.print("Nhập các phần tử của  mảng: a[" + i +"] : ");
            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int Bai124(int[] a, int n){
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if(a[i]%2==0 && a[i]<2004){
                flag = 1;
            }
        }
        if(flag == 1)
        {
            System.out.println("Tim thay");
        }
        else
        {
            System.out.println("Khong Tim thay");
        }
        return flag;
    }

    public static void PrintArray(int[] a) {
        System.out.print("Các phần tử của mảng: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc){
        System.out.print("Nhập số phần tử của mảng là: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = InputArray(n);
        Bai124(a,n);
        PrintArray(a);

    }
}

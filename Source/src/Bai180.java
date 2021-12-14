import java.util.Scanner;

public class Bai180 {
//    Bài 180: Hãy liệt kê các giá trị trong mảng mà thỏa điều kiện
//    nhỏ hơn trị tuyệt đối của giá trị đứng liền sau nó
//    và lớn hơn trị tuyệt đối của giá trị đứng liền trước nó
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void Bai180(int a[], int n){
        int flag = 0;
        for (int i = 0; i <n ; i++) {

            if(a[i] > Math.abs(a[i-1]) && a[i] < Math.abs(a[i+1])){
                flag = 1;
                System.out.println(a[i]);
            }
        }
        if(flag == 0)
            System.out.println("Mảng ko có giá trị đó.");
    }

    public static void xuatmang(int[] a) {
        System.out.print("Các phần tử của mảng là: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] argc){
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = nhapmang(n);
        Bai180(a,n);
        xuatmang(a);
    }
}

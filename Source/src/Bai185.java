import java.util.Scanner;

public class Bai185 {
    //Bài 185: Hãy liệt kê các vị trí mà giá trị tại đó là số chính phương trong mảng 1 chiều các số nguyên.
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static boolean chinhphuong(int z){
        return (Math.sqrt((float)z) == (int)Math.sqrt((float)z));
    }

    public static void Bai185(int a[], int n){
        int flag = 0;
        for (int i = 0; i <n ; i++) {
            if(chinhphuong(a[i]) == true){
                flag = 1;
                System.out.println("Vị trí của số chính phương: " + i);
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
        Bai185(a,n);
        xuatmang(a);
    }
}

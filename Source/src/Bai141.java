import java.util.Scanner;

public class    Bai141 {
    // Hãy tìm vị trí giá trị dương nhỏ nhất trong mảng 1 chiều các số thực.
    // Nếu mảng không có giá trị dương thì trả về -1.
    public static int[] InputArray(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int Bai141(int[] a, int n){
        int min = 0;
        int count = 0;
        int i;
        for(i = 0; i < n; ++i){
            if(a[i] > 0){ // kiểm tra đó có phải là số dương hay không
                min = i; // i là vị trí min
                count++; // điếm số lượng dương.
                break;
            }
        }
        if (count == 0)
            return -1;
        for (i=i+1; i<n; i++)
        {
            if((a[i]>0)&&(a[min]>a[i]))
            {
                min = i;
            }
        }
        return min;
    }

    public static void PrintArray(int[] a) {
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
        int[] a = InputArray(n);
        int vitrinhonhat = Bai141(a,n);
        System.out.println("Vị trí dương nhỏ nhất: i = " + vitrinhonhat);
        PrintArray(a);
    }
}

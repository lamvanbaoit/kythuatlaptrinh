import java.util.Scanner;

public class bai221 {
//    Bài 221: Cho biết sự tương quan giữa số lượng chẵn và lẻ trong mảng
//    Hàm trả về 1 trong 3 giá trị -1, 0, 1
//    Giá trị -1 là chẵn nhiều hơn lẻ
//    Giá trị 0 là chẵn bằng lẻ
//    Giá trị 1 là chẵn ít hơn lẻ
    public static int[] nhapmang(int n){
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử của mảng: a[" + i +"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int Bai221(int[] a, int n){
        int demchan = 0;
        for (int i = 0; i < n; i++) {
            if(a[i]%2 == 0){
                demchan++;
            }
        }
        if (demchan > n - demchan) {
            return -1;
        }
        else if(demchan == n - demchan){
            return 0;
        }
        return 1;
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
        int KQ = Bai221(a, n);
        System.out.println("So sanh so luong so chan va so le: " + KQ);
        xuatmang(a);
    }
}

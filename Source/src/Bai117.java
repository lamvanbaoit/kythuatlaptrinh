import java.util.Scanner;

public class Bai117 {
    // Viết chương trình nhập n và tính tổng S(n) = x + x^2 + x^3 + … + x^n.
    public static void Bai117(int n){
        int x;
        do{
            System.out.println("Nhap x: ");
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
            if(x<0){
                System.out.println("Nhap sai nhap lai");
            }
        }while (x<0);

        int T = 1;
        int S = 0;
        for(int i = 1; i <= n; ++i){
            T = T*x;
            S += T;
        }
        System.out.println("KQ: "+ S);
    }

    public static void main(String[] argc){
        int n;
        do{
            System.out.println("Nhap a: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            if(n<0){
                System.out.println("Nhap sai nhap lai");
            }
        }while (n<0);
        Bai117(n);
    }
}

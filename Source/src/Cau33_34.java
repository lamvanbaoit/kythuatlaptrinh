import java.util.Scanner;
import java.lang.Math;

public class Cau33_34 {

    public static void cau33(int n){
        float s = (float) Math.sqrt(2);
        for(int i = 2; i <= n; ++i){
            s = (float) Math.sqrt(2 + s);
        }
        System.out.println("Ket qua cau 33: " + s);
    }
    public static void cau34(int n){
        float s = (float) Math.sqrt(1);
        for(int i = 2; i <= n; ++i){
            s = (float) Math.sqrt(i + s);
        }
        System.out.println("Ket qua cau 34: " + s);
    }
    public static void main(String[] argc){
        int n;
        do {
            System.out.println("Enter n: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            if (n<0)
                System.out.println("Nhap sai nhap lai: ");
        }while (n<0);
        cau33(n);
        cau34(n);
    }
}

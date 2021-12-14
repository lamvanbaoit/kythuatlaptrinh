import java.util.Scanner;

public class Bai116 {
    // Viết chương trình nhập n và tính tổng S = 1 + 2 + 3 + … + n
    public static void Bai116(int a){
        int s = 0;
        for(int i = 1; i<=a; i++){
            s += i;
        }
        System.out.println("KQ: " + s);
    }

    public static void main(String[] argc){
        int a;
        do{
            System.out.println("Nhap a: ");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            if(a<0){
                System.out.println("Nhap sai thi nhap lai");
            }
        }while (a<0);
        Bai116(a);
    }
}

public class Bai111 {
    /*
        Viết chương trình in ra tam giác cân có độ cao h
        a. Tam giác cân đặc nằm giữa màn hình
        b. Tam giác cân rỗng nằm giữa màn hình
        c. Tam giác vuông cân đặc
        d. Tam giác vuông cân rỗng
    */

    // a. Tam giác cân đặc nằm giữa màn hình
    public  static void Bai111a(int h){
        for (int i = 1; i <= h ; i++) {
            for(int j=1; j<=h-i; j++)
                System.out.print(" ");
            for(int j=1; j<=2*i-1; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
    // b. Tam giác cân rỗng nằm giữa màn hình
    public  static void Bai111b(int h){
        for (int i=h;i>0;i--) {
            for (int j=1;j<i;j++)
                System.out.print(" ");
            for (int k=1;k<=(2*(h-i)+1);k++)
                if ((k==1)||(k==(2*(h-i)+1))||(i==1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.print("\n");
        }
    }
    // c. Tam giác vuông cân đặc
    public  static void Bai111c(int h){
        for(int i = 1; i <= h; i++) {
            for(int k = 1; k <= i; k++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
    // d. Tam giác vuông cân rỗng
    public static void Bai111d(int h){
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == h)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }



    public static void main(String[] argc){
        int h = 4;
        Bai111a(h);
        System.out.print("\n");
        Bai111b(h);
        System.out.print("\n");
        Bai111c(h);
        System.out.print("\n");
        Bai111d(h);
    }
}

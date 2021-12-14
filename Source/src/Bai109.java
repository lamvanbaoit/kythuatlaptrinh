public class Bai109 {
    // Viết chương trình in bảng cửu chương ra màn hình.
    public  static void Bai109(int n){
        int s;
        for(int i = 1; i<=10; ++i){
            s = i * n;
            System.out.println(n + " * " + i + " = " + s);
        }

    }

    public static void main(String[] argc){
        System.out.println("Nhap ban cua chuong tu 1 den 9");
        int n = 9;
        Bai109(n);
    }
}

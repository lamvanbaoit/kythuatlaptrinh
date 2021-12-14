public class Bai083 {
    // Viết chương trình nhập vào hai số thực. Kiểm tra xem chúng có cùng dấu hay không.
    public static void Bai083(int a, int b){
        if(a*b>0){
            System.out.println("Cung dau " + "giua so " + a + " va " + b);
        }else {
            System.out.println("Khong Cung dau " + "giua so " + a + " va " + b);
        }
    }

    public static void main(String[] argc){
        int a = 3;
        int b = -2;
        Bai083(a,b);
    }
}

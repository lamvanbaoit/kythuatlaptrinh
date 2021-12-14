public class Bai100 {
//    Viết chương trình giải phương trình bậc 2.
public static void Bai100(int a, int b, int c){
    // kiểm tra các hệ số
    if (a == 0) {
        if (b == 0) {
            System.out.println("Phương trình vô nghiệm!");
        } else {
            System.out.println("Phương trình có một nghiệm: "
                    + "x = " + (-c / b));
        }
        return;
    }
    // tính delta
    float delta = b*b - 4*a*c;
    float x1;
    float x2;
    // tính nghiệm
    if (delta > 0) {
        x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
        x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
        System.out.println("Phương trình có 2 nghiệm là: "
                + "x1 = " + x1 + " và x2 = " + x2);
    } else if (delta == 0) {
        x1 = (-b / (2 * a));
        System.out.println("Phương trình có nghiệm kép: "
                + "x1 = x2 = " + x1);
    } else {
        System.out.println("Phương trình vô nghiệm!");
    }
}
    public static void main(String[] argc){
        int a = 2;
        int b = 1;
        int c = -1;
        Bai100(a,b,c);
    }
}

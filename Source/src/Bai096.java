public class Bai096 {
    // Viết chương trình nhập giá trị x sau tính giá trị của hàm số:
    //          2x^2 + 5x + 9 khi x >= 5
    // f(x) =
    //          -2x^2 + 4x - 9 khi x < 5
    public static void Bai096(int x){
        int s;
        if(x>=5){
            s = (int) (2*Math.pow(x,2)) + 5*x + 9;
        }else {
            s = (int) (-2*Math.pow(x,2)) + 4*x - 9;
        }
        System.out.println("KQ: " + s);
    }

    public static void main(String[] argc){
        int x = 0;
        Bai096(x);
    }
}

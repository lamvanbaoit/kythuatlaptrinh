public class Bai108 {
    // Viết hàm tính S = x^y.
    public  static void Bai108(float x, float y){
        float s = (float) Math.pow(x,y);
        System.out.println("KQ: " + s);
    }

    public static void main(String[] argc){
        float x = 3;
        float y = 2;
        Bai108(x,y);
    }
}

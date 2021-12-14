public class Bai107 {
    // Viết hàm tính S = x^1/n. (n là số nguyên dương)
    public  static void Bai107(float x, float n){
        float s = (float) Math.pow(x,1/2);
        System.out.println("KQ: " + s);
    }

    public static void main(String[] argc){
        float x = 3;
        float n = 2;
        Bai107(x,n);
    }
}

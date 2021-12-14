public class Bai033 {
    // Tính S(n)=√(2+√(2+√(2+⋯√(2+√2) ) ) ) có n dấu căn
    public static void Bai033(int n){
        float s = (float) Math.sqrt(2);
        for (int i = 2; i<=n; ++i){
            s = (float) Math.sqrt(2 + s);
        }
        System.out.println("KQ: " + s);
    }

    public static void main(String[] argc){
        int n = 3;
        Bai033(n);
    }
}

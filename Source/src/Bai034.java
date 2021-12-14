public class Bai034 {
    // Tính S(n)= √(n+√(n-1+√(n-2+⋯√(2+√1) ) ) ) có n dấu căn.
    public static void Bai034(int n){
        float s = (float) Math.sqrt(1);
        for(int i = 2; i <= n; ++i){
            s = (float) Math.sqrt(i + s);
        }
        System.out.println("KQ: " + s);
    }

    public static void main(String[] argc){
        int n = 3;
        Bai034(n);
    }
}

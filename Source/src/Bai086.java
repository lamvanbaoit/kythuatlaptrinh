public class Bai086 {
    // s = 1^3 + 2^3 + 3^3 +...+N^3
    public static void Bai086(int n){
        int s = 0;
        int i = 1;
        while (i<=n)
        {
            s += i*i*i;
            i += 1;
        }
        System.out.println("KQ: " + s);
    }

    public static void main(String[] argc){
        int n = 3;
        Bai086(n);
    }
}

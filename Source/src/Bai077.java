public class Bai077 {
    // Viết chương trình tính tổng của dãy số S(n) = 1 + 2 + 3 + ... + n.
    public static void Bai077(int n){
        int s = 0;
        int i = 1;
        while (i<=n){
            s += i;
            i = i + 1; // i++;
        }
        System.out.println("KQ: " + s);
    }

    public static void main(String[] argc){
        int n = 3;
        Bai077(n);
    }
}

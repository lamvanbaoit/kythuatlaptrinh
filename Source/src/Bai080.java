public class Bai080 {
    // S(n)=x+x^2/(1+2)+x^3/(1+2+3)+...+x^n/(1+2+3+...+n)
    public static void Bai080(int n){
        int x = 3;
        float S = 0;
        float T = 1;
        float P = 0;
        float i = 1;
        while (i <= n) {
            T = T*x;
            P = P+i;
            S += T/P;
            i = i + 1; // i++;
        }
        System.out.println("KQ: " + S);
    }

    public static void main(String[] argc){
        int n = 3;
        Bai080(n);
    }
}

public class Bai119 {
    // Liệt kê tất cả các số nguyên tố nhỏ hơn n.
    public static boolean nto(int n){
        if (n<2)
            return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void lietke_nto(int n){
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i = i + 2){
            if (nto(i)){
                System.out.print(" " + i);
            }
        }
    }

    public static void main(String[] argc){
        int n = 100;
        lietke_nto(n);
    }
}

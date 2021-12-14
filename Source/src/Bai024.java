public class Bai024 {
    // Câu 24 Liệt kê tất cả "ước số lẻ" của số nguyên dương n.
    public static void Bai024(int n){
        for(int i = 1; i<=n; ++i){
            if (n%i==0){
                if (i%2!=0){
                    System.out.println("Uoc so " + n + " la " + i);
                }
            }
        }
    }
    public static void main(String[] argc){
        int n = 24;
        Bai024(n);
    }
}

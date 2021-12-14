public class Bai020 {
    // Câu 20 Liệt kê tất cả "ước số" của số nguyên dương n.
    public static void Bai020(int n){
        for(int i = 1; i <= n; ++i){
            if (n%i == 0){
                System.out.println("Uoc so " + n + " la " + i);
            }
        }
    }

    public static void main(String[] argc){
        int n = 24;
        Bai020(n);
    }
}

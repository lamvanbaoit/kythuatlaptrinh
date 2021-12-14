public class Bai022 {
    // Câu 22 Tính tích tất cả "ước số" của số nguyên dương n.
    public static void Bai022(int n){
        int s = 1;
        for(int i = 1; i<=n; ++i){
            if(n%i==0){
                s *= i;
                System.out.println("Uoc so " + n + " la " + i);
            }
        }
        System.out.println("Tich uoc so cua " + n + " la " + s);
    }

    public static void main(String[] argc){
        int n = 24;
        Bai022(n);
    }
}

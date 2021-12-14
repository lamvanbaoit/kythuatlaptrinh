public class Bai021 {
    // Câu 21 Tính tổng tất cả "ước số" của số nguyên dương n.
    public static void Bai021(int n){
        int s = 0;
        for(int i = 1; i<=n; ++i){
            if(n%i==0){
                s += i;
                System.out.println("Uoc so " + n + " la " + i);
            }
        }
        System.out.println("Tong uoc so cua: " + n + " la " + s);
    }

    public static void main(String[] argc){
        int n = 24;
        Bai021(n);
    }
}

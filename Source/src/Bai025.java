public class Bai025 {
    // Câu 25 Tính tổng tất cả "ước số chẵn" của số nguyên dương n.
    public static void Bai025(int n){
        int s = 0;
        for(int i = 1; i<=n; ++i){
            if(n%i==0){
//                System.out.println("Uoc so " + n + " la " + i);
                if(i%2==0){
                    s += i;
                    System.out.println("Uoc so chan " + n + " la " + i);
                }
            }
        }
        System.out.println("Tong uoc so chan cua " + n + " la " + s);
    }

    public static void main(String[] argc){
        int n = 24;
        Bai025(n);
    }
}

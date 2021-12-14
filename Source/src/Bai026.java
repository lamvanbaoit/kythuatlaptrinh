public class Bai026 {
    // Câu 26 Tính tích tất cả "ước số lẻ" của số nguyên dương n.
    public static void Bai026(int n){
        int s = 1;
        for(int i = 1; i<=n; ++i){
            if(n%i==0){
//                System.out.println("Uoc so " + n + " la " + i);
                if(i%2!=0){
                    s *= i;
                    System.out.println("Uoc so le " + n + " la " + i);
                }
            }
        }
        System.out.println("Tong uoc so le cua " + n + " la " + s);
    }

    public static void main(String[] argc){
        int n = 24;
        Bai026(n);
    }
}

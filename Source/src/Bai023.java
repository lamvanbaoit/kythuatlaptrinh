public class Bai023 {
    // Câu 23 Đếm số lượng "ước số" của số nguyên dương n.
    public static void Bai023(int n){
        int count = 0;
        for(int i = 1; i<=n; ++i){
            if (n%i==0){
                count++;
                System.out.println("Uoc so " + n + " la " + i);
            }
        }
        System.out.println("Dem so luong cua uoc so " + n + " la " + count);
    }
    public static void main(String[] argc){
        int n = 24;
        Bai023(n);
    }
}

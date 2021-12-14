public class Bai027 {
    // Câu 27 Đếm số lượng "ước số chẵn" của số nguyên dương n.
    public static void Bai023(int n){
        int count = 0;
        for(int i = 1; i<=n; ++i){
            if (n%i==0){
                if(i%2==0){
                    count++;
                    System.out.println("Uoc so chan " + n + " la " + i);
                }
            }
        }
        System.out.println("Dem so luong cua uoc so chan " + n + " la " + count);
    }
    public static void main(String[] argc){
        int n = 24;
        Bai023(n);
    }
}

public class Bai079 {
    // Hãy đếm số lượng chữ số của số nguyên dương n;
    public static void Bai079(int n){
        int count = 0;
        while (n >0){
            n = n/10;
            count += 1;
        }
        System.out.println("KQ: " + count);
    }

    public static void main(String[] argc){
        int n = 13;
        Bai079(n);
    }
}

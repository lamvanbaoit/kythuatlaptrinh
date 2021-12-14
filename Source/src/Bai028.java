public class Bai028 {
    // Câu 28 Cho số nguyên dương n. Tính tổng các ước số nhỏ hơn chính nó.
    public static void Bai028(int n){
        int s = 0;
        for(int i = 1; i<n;++i){
            if(n%i==0){
                s +=i;
                System.out.println("Uoc so nho hon " + n + " la " + i);
            }
        }
        System.out.println("Tong uoc so nho hon chinh no cua so " + n + " la " + s);
    }

    public static void main(String[] argc){
        int n = 24;
        Bai028(n);
    }
}

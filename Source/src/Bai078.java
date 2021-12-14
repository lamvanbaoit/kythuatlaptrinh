public class Bai078 {
    // Liệt kê tất cả các ước số của số nguyên dương n.
    public static void Bai078(int n){
        int s = 0;
        int i = 1;
        while (i<=n){
            if(n%i==0){
                System.out.println("uoc so cua " + n + " la " + i);
            }
            i++; // i = i + 1;
        }
    }

    public static void main(String[] argc){
        int n = 24;
        Bai078(n);
    }
}

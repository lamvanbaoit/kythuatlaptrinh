public class Bai089 {
    // Viết chương trình tính tổng các giá trị lẻ nguyên dương nhỏ hơn n.
    public static void Bai089(int n){
        int s = 0;
        for(int i=1; i<=n;i++) {
            if (i % 2 != 0) {
                s = s + i;
                System.out.println("So nguyen duong le: " + i);
            }
        }
        System.out.println("KQ: " + s);
    }

    public static void main(String[] argc){
        int n = 10;
        Bai089(n);
    }
}

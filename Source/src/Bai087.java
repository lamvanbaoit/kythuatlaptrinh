public class Bai087 {
    // Đoạn chương trình dưới đây sẽ cho số nguyên dương n nhỏ nhất sao cho 1 + 2 +...+ n > 10000
    public static void Bai087(int n){
        int s = 0;
        while (s < 10000)
        {
            n++;
            s = s + n;
        }
        System.out.println("KQ: " + n);
    }

    public static void main(String[] argc){
        int n = 0;
        Bai087(n);
    }
}

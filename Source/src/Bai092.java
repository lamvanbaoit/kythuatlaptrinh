public class Bai092 {
    // Tìm ước số chung lớn nhất của hai số nguyên dương.
    // Giải thích
    /*
        Tại mỗi bước lặp nó sẽ kiểm tra giá trị hiện tại của a và b xem thằng nào lớn hơn.
        Ví dụ với hai số a = 7, b = 5
        L1: a > b => a = 2, b = 5
        L2: b > a => a = 2, b = 3
        L3: b > a => a = 2, b = 1
        L4: a > b => a = 1, b = 1
        L5: a == b => trả về a hoặc b đều được => KQ là 1
    */

    public static void Bai092(int a, int b){
        while (a!=b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("KQ: " + b); // a or b cung deu in ket qua nhu nhau
    }

    public static void main(String[] argc){
        int a = 7;
        int b = 5;
        Bai092(a,b);
    }
}

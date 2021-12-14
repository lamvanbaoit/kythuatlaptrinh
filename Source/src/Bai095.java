public class Bai095 {
    // Viết chương trình nhập ba số thực. Hãy thay số âm bằng giá trị tuyết đối của nó.
    // VD: a = 2; b = -5; c = -8
    // KQ: a = 2; b = 5; c = 8
    public static void Bai095(int a, int b, int c){
        if (a<0)
            a = -a;
        if (b<0)
            b = -b;
        if (c<0)
            c = -c;
        System.out.println("KQ: " + a + " " + b + " " + c);
    }

    public static void main(String[] argc){
        int a = 2;
        int b = -5;
        int c = -8;
        Bai095(a,b,c);
    }
}

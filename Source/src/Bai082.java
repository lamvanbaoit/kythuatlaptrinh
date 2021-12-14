public class Bai082 {
    // Viết chương trình tìm số lớn nhất trong 3 số thực a,b,c.
    public static void Bai082(int a, int b, int c){
        int lonnhat = a;
        if(lonnhat < b)
            lonnhat = b;
        if (lonnhat < c)
            lonnhat = c;
        System.out.println("So lon ngat trong 3 so la so: " + lonnhat);
    }

    public static void main(String[] argc){
        int a = 3;
        int b = 1;
        int c = 10;
        Bai082(a,b,c);
    }
}

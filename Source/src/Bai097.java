public class Bai097 {
    // Viết chương trình nhập 3 cạnh của một tam giác. Hãy cho biết tam giác đó là tam giác gì?
    public static void Bai097(int a, int b, int c){
        if(a == b || a == c || b == c){
            System.out.println("Tam giac can");
        }
        if(a==b & b==c){
            System.out.println("Tam giac deu");
        }
        if(a * a + b * b == c * c || a * c + c * c == b * b || b * b + c * c == a * c){
            System.out.println("Tam giac vuong");
        }
    }

    public static void main(String[] argc){
        // tam giac can
//        int a = 2;
//        int b = 2;
//        int c = 1;
        // tam giac deu
        int a = 3;
        int b = 3;
        int c = 3;
        // tam giac vuong
//        int a = 3;
//        int b = 4;
//        int c = 5;

        Bai097(a,b,c);
    }
}

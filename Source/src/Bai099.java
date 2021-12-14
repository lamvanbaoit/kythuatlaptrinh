public class Bai099 {
    // Viết chương trình nhập 3 số thực. Hãy in 3 số thực ấy ra màn hình theo thứ tự tăng dần mà chỉ dùng tối đa 2 biến phụ.

    public static void Bai099(int a, int b, int c){
        int temp;
        if(a>b){
            temp=a;
            a=b;
            b=temp;
        }
        if(a>c){
            temp=a;
            a=c;
            c=temp;
        }
        if(b>c){
            temp=b;
            b=c;
            c=temp;
        }
        System.out.println("Thu tu tang dan: " + a + " " + b + " " + c);
    }

    public static void main(String[] argc){
        int a = 2;
        int b = 5;
        int c = 3;
        Bai099(a,b,c);
    }
}

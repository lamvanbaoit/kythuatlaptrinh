public class Bai090 {
    // Viết chương trình tìm số nguyên dương m lớn nhất sao cho 1+2+3+...+m<n.
    public static void Bai090(int n){
        int m = 0;
        int s = 0;
        do{
            m = m + 1;
            s = s + m;
        }while (s+m+1<n);
        System.out.println("KQ: " + m);
    }

    public static void main(String[] argc){
        int n = 100;
        Bai090(n);
    }
}

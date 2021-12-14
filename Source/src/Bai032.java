public class Bai032 {
    // Câu 32 Cho số nguyên dương n. Kiểm tra số nguyên dương n có phải là số chính phương hay không?
    public static void Bai032(int n){
        if (Math.sqrt((float)n) == (int)Math.sqrt((float)n))
            System.out.println(n + " La so chinh phuong ");
        else
            System.out.println(n + " Ko la so chinh phuong ");
    }
    public static void main(String[] argc){
        int n = 4;
        Bai032(n);
    }
}

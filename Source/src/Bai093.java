public class Bai093 {
    // Viết chương trình kiểm tra 1 số có phải là số nguyên tố hay không.
    public static void Bai093(int n){
        int count = 0;
        if (n<2)
            System.out.println("Ko phai so nguyen to " + n);
        for(int i = 2; i <=Math.sqrt(n); ++i){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 0){
            System.out.println("La so nguyen to " + n);
        }else{
            System.out.println("Ko phai so nguyen to " + n);
        }
    }

    public static void main(String[] argc){
        int n = 97;
        Bai093(n);
    }
}

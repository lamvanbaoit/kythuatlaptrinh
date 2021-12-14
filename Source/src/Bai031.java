
public class Bai031 {
    // Câu 31 Cho số nguyên dương n. Kiểm tra số nguyên dương n có phải là số nguyên tố hay không?
    public static void Bai031(int n){
        int count = 0;
        if (n<2)
            System.out.println(n+ "Ko phai so nguyen to ");
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 0){
            System.out.println(n + " la so nguyen to ");
        }else{
            System.out.println(n + " Ko phai so nguyen to ");
        }
    }

    public static void main(String[] argc){
        int n = 5;
        Bai031(n);
    }
}

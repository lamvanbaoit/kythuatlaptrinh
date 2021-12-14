public class Bai030 {
    // Câu 30 Cho số nguyên dương n. Kiểm tra số nguyên dương n có phải là số hoàn thiện hay không?
    public static void Bai030(int n){
        int s = 0;
        for (int i = 1; i<=n/2; ++i){
            if(n%i==0){
                s += i;
            }
        }
        if(s==n){
            System.out.println("La so hoan thien");
        }else{
            System.out.println("Khong La so hoan thien");
        }
    }


    public static void main(String[] argc){
        int n = 6;
        Bai030(n);
    }
}

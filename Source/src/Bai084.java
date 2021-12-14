public class Bai084 {
    // Viết chương trình giải và biện luận phương trình bậc nhất ax+b=0;
    public static void Bai084(int a, int b){
        if(a==0){
            if(b==0){
                System.out.println("PT co vo so nghiem");
            }else{
                System.out.println("PT vo nghiem");
            }
        }else{
            int x =-b/a;
            System.out.println("PT co nghiem la " + x);
        }
    }

    public static void main(String[] argc){
        int a = 1;
        int b = 2;
        Bai084(a,b);
    }
}

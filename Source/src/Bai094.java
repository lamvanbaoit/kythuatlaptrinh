public class Bai094 {
    // Viết chương trình in tất cả các số lẻ nhỏ hơn 100 trừ các số 5, 7, 93.
    public static void Bai094(){
        int i;
        for(i = 1; i < 100; i+=2)
        {
            if((i == 5) || (i == 7) || (i == 93))
                continue;
            System.out.print(i + "\t");
        }
    }

    public static void main(String[] argc){
        Bai094();
    }
}

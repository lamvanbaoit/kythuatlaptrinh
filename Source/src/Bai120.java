import static java.lang.Math.*;

public class Bai120 {
    // Liệt kê tất cả các số chính phương nhỏ hơn n.
    /*
        Số chính phương là số mà kết quả khai căn bậc 2 là 1 số nguyên
        sqrt(4) = 2.00000 => ép về nguyên = 2 => vì 2.000  == 2 (true) => là số chính phương
        sqrt(5) = 2.23234 => ép về nguyên = 2 => vì 2.4324 != 2 (false) => không là số chính phương
	*/
    public static boolean chinhphupng(int n){
        return sqrt(n) == (int) sqrt((float)n);
    }

    public static void lietke_chinhphuong(int n){
        for(int i = 2; i < n; i++)
        {
            if(chinhphupng(i) == true)
                System.out.print(" " + i);
        }
    }

    public static void main(String[] argc){
        int n = 101;
        lietke_chinhphuong(n);
    }
}

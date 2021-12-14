public class Bai029 {
    // Câu 29 Tìm ước số lẻ lớn nhất của số nguyên dương n. VD: n = 100 ước lẻ lớn nhất của 100 là 25.

    public static void Bai029(int n){
        int max = 1;
        for(int i = 1; i<=n; ++i){
            if(n%i==0){
                if(i%2!=0) {
                    if (i > max) {
                        max = i;
                    }
                }
            }
        }
        System.out.println("Uoc so le cua " + n + " lon nhat la " + max);
    }

    public static void main(String[] argc){
        int n = 100;
        Bai029(n);
    }
}


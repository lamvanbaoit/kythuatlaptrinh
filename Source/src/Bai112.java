public class Bai112 {
    // Viết chương trình in ra hình chữ nhật có kích thước m x n
    // a. Hình chữ nhật đặc
    // b. Hình chữ nhật rỗng

    // Ví dụ: m = 4, n = 5
    public  static void ChuNhatDac(int m, int n)
    {
        for (int i = 1; i <= m; ++i)
        {
            for (int j = 1; j <= n; ++j)
                System.out.print("* ");
            System.out.print("\n");
        }
    }
    // Ví dụ: m = 4, n = 5
    public static void ChuNhatRong(int m, int n)
    {
        for (int i = 1; i <= m; i++)
        {
            for (int j = 1; j <= n; j++)
                if (i == 1 || j == 1 || i == m || j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.print("\n");
        }
    }

    public static void main(String[] argc){
        ChuNhatDac(4,5);
        System.out.println();
        ChuNhatRong(4,5);
    }
}

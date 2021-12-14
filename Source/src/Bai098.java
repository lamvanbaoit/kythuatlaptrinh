public class Bai098 {
    // Giải hệ pt
    /*
        ax + by = c
        dx + ey = f
    */
    public static void Bai098(int a, int b, int c, int d, int e, int f, int x, int y){
        int D = a * e - d * b;
        int Dx = c * e - f * b;
        int Dy = a * f - d * c;
        int SoNghiem;
        if(D != 0)
        {
            x = Dx / D;
            y = Dy / D;
            System.out.println("He phuong trinh co 1 nghiem duy nhat: " + x + " va " + y);
            SoNghiem = 1;
        }
        else
        {
            if(Dx != 0 || Dy != 0)
            {
                System.out.println("He phuong trinh vo nghiem");
                SoNghiem = 0;
            }
            else if(Dx == 0 && Dy == 0)
            {
                System.out.println("He phuong trinh co vo so nghiem");
                SoNghiem = -1;
            }
        }
    }

    public static void main(String[] argc){
        Bai098(1,2,3,4,5,6,7,8);
    }
}

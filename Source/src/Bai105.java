public class Bai105 {
    // Viết chương trình nhập 1 số nguyên có 2 chữ số. Hãy in ra cách đọc của số nguyên này.
   public static void Bai105(int num){
       if (num < 10 || num > 99){
           System.out.println("Khong hop le !");
       }
       else
       {
           int donvi = num % 10;
           int chuc = num / 10;

           if (chuc == 2) {
               System.out.print("Hai");
           } else if (chuc == 3) {
               System.out.print("Ba");
           } else if (chuc == 4) {
               System.out.print("Bon");
           } else if (chuc == 5) {
               System.out.print("Nam");
           } else if (chuc == 6) {
               System.out.print("Sau");
           } else if (chuc == 7) {
               System.out.print("Bay");
           } else if (chuc == 8) {
               System.out.print("Tam");
           } else if (chuc == 9) {
               System.out.print("Chin");
           }
           System.out.print(" Muoi ");

           if (donvi == 1) {
               System.out.print("Mot");
           } else if (donvi == 2) {
               System.out.print("Hai");
           } else if (donvi == 3) {
               System.out.print("Ba");
           } else if (donvi == 4) {
               System.out.print("Bon");
           } else if (donvi == 5) {
               System.out.print("Nam");
           } else if (donvi == 6) {
               System.out.print("Sau");
           } else if (donvi == 7) {
               System.out.print("Bay");
           } else if (donvi == 8) {
               System.out.print("Tam");
           } else if (donvi == 9) {
               System.out.print("Chin");
           }
       }
   }

    public static void main(String[] argc){
        int num = 27;
        Bai105(num);
    }
}

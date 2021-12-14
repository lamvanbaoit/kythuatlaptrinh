public class Bai106 {
    // Viết chương trình nhập 1 số nguyên có 3 chữ số. Hãy in ra cách đọc của số nguyên này.
    public static void Bai106(int num) {
        if (num < 100 || num > 999) {
            System.out.println("Khong hop le !");
        } else {
            int donvi = num % 10;
            num /= 10;
            int chuc = num % 10;
            int tram = num / 10;

            if (tram == 1) {
                System.out.print("Mot");
            } else if (tram == 2) {
                System.out.print("Hai");
            } else if (tram == 3) {
                System.out.print("Ba");
            } else if (tram == 4) {
                System.out.print("Bon");
            } else if (tram == 5) {
                System.out.print("Nam");
            } else if (tram == 6) {
                System.out.print("Sau");
            } else if (tram == 7) {
                System.out.print("Bay");
            } else if (tram == 8) {
                System.out.print("Tam");
            } else if (tram == 9) {
                System.out.print("Chin");
            }
            System.out.print(" Tram ");

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
        int num = 124;
        Bai106(num);
    }
}



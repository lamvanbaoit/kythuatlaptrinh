import java.util.Scanner;

public class Bai101 {
    // Viết chương trình nhập tháng, năm. Hãy cho biết tháng đó có bao nhiêu ngày.

    public static void Bai101(int thang, int nam){
        switch (thang){
            case 1:
                System.out.println("Co 31 ngay");
                break;
            case 2:
                if((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0))
                    System.out.println("Nam nay la nam nhuan co 29 ngay");
                else
                    System.out.println("Thang nay co 28 ngay");
                break;
            case 3:
                System.out.println("Co 31 ngay");
                break;
            case 4:
                System.out.println("Co 30 ngay");
                break;
            case 5:
                System.out.println("Co 31 ngay");
                break;
            case 6:
                System.out.println("Co 30 ngay");
                break;
            case 7:
                System.out.println("Co 31 ngay");
                break;
            case 8:
                System.out.println("Co 31 ngay");
                break;
            case 9:
                System.out.println("Co 30 ngay");
                break;
            case 10:
                System.out.println("Co 31 ngay");
                break;
            case 11:
                System.out.println("Co 30 ngay");
                break;
            case 12:
                System.out.println("Co 31 ngay");
                break;
        }
    }

    public static void main(String[] argc){
        int thang, nam;
        do{
            System.out.println("Nhap thang: ");
            Scanner sc = new Scanner(System.in);
            thang = sc.nextInt();
            if (thang < 1 || thang > 12){
                System.out.println("Nhap thang sai nhap lai: ");
            }
        }while (thang < 1 || thang > 12);

        do{
            System.out.println("Nhap nam: ");
            Scanner sc = new Scanner(System.in);
            nam = sc.nextInt();
            if (nam < 1900 || nam > 2020){
                System.out.println("Nhap nam sai nhap lai: ");
            }
        }while (nam < 1900 || nam > 2020);
        Bai101(thang, nam);
    }
}

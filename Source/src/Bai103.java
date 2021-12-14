import java.util.Scanner;

public class Bai103 {
    // Viết chương trình nhập vào 1 ngày ( ngày, tháng, năm). Tìm ngày trước ngày vừa nhập (ngày, tháng, năm)
    public static int Bai103(int ngay, int thang, int nam) {
        int NgayTrongThang = 0;
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                NgayTrongThang = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                NgayTrongThang = 30;
                break;
            case 2:
                if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0))
                    NgayTrongThang = 29;
                else
                    NgayTrongThang = 28;
                break;
        }
        return NgayTrongThang;
    }

    public static void TimNgayTruocDo(int ngay, int thang, int nam)
    {
        int NgayTrongThang = Bai103(ngay,thang,nam);
        if (ngay == 1) { // Nếu ngày nhập vào là 1
            ngay = NgayTrongThang;        // ngày trước đó là số ngày trong tháng trước
            if (thang == 1)            // Nếu tháng là 1
            {
                thang = 12;
                nam--;
            } else                     // Tháng khác 1
                thang--;
        }else {                   // Ngày khác 1
            ngay --;
        }
        System.out.println("Ngay truoc do la: " + ngay + " " + thang + " " + nam);
    }


    public static void main(String[] argc){
        int ngay = 27 ,thang = 10 ,nam = 2019;
//        do{
//            System.out.println("Nhap ngay: ");
//            Scanner sc = new Scanner(System.in);
//            ngay = sc.nextInt();
//            if (ngay < 1 || ngay > 31){
//                System.out.println("Nhap nam sai nhap lai: ");
//            }
//        }while (ngay < 1 || ngay > 31);
//
//       do{
//            System.out.println("Nhap thang: ");
//           Scanner sc = new Scanner(System.in);
//           thang = sc.nextInt();
//            if (thang < 1 || thang > 12){
//               System.out.println("Nhap sai nhap lai: ");
//           }
//       }while (thang < 1 || thang > 12);
//
//        do{
//            System.out.println("Nhap nam: ");
//            Scanner sc = new Scanner(System.in);
//            nam = sc.nextInt();
//            if (nam < 1900 || nam > 2020){
//                System.out.println("Nhap sai nhap lai: ");
//            }
//        }while (nam < 1900 || nam > 2020);

        TimNgayTruocDo(ngay, thang, nam);
    }
}

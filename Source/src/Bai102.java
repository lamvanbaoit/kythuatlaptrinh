import java.util.Scanner;

public class Bai102 {
    // Viết chương trình nhập vào 1 ngày (ngày, tháng, năm). Tìm ngày kế ngày vừa nhập (ngày, tháng, năm).
    public static int Bai102(int ngay, int thang, int nam) {
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

    public static void TimNgayKeTiep(int ngay, int thang, int nam)
    {
        int NgayTrongThang = Bai102(ngay,thang,nam);
        if (ngay < NgayTrongThang)  // Tăng ngày lên
        {
            ngay++;
        }
        else if (thang < 12)     // Ngày kế tiếp là đầu tháng
        {
            ngay = 1;
            thang++;
        }
        else                      // Ngày kế là đầu năm mới tức là hiện tai đang là tháng 12
        {
            ngay = thang = 1;
            nam++;
        }
        System.out.println("Ngay ke tiep la: " + ngay + " " + thang + " " + nam);
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

        TimNgayKeTiep(ngay, thang, nam);
    }
}

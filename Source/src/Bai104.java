public class Bai104 {
    // Viết chương trình nhập ngày, tháng, năm. Tính xem ngày đó là ngày thứ bao nhiêu trong năm.
    public static void Bai104(int ngay, int thang, int nam) {
        int s = ngay;
        for(int i = 1; i < thang; i++)
        {
            switch (i)
            {
                case 4: case 6: case 9 : case 11:
                    s+= 30;
                    break;
                case 2:
                    s += (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0) ? 29 : 28;
                    break;
                default:
                    s += 31;
            }
        }
        System.out.println("Ngay thu " + s + " trong nam");
    }

    public static void main(String[] argc){
        int ngay = 2 ,thang = 4 ,nam = 2017;
        Bai104(ngay, thang, nam);
    }
}

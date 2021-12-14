import java.util.Scanner;

public class Cau20_32 {
    /*
        + 20 Liệt kê tất cả "ước số" của số nguyên dương n.
        + 21 Tính tổng tất cả "ước số" của số nguyên dương n.
        + 22 Tính tích tất cả "ước số" của số nguyên dương n.
        + 23 Đếm số lượng "ước số" của số nguyên dương n.
        + 24 Liệt kê tất cả "ước số lẻ" của số nguyên dương n.
        + 25 Tính tổng tất cả "ước số chẵn" của số nguyên dương n.
        + 26 Tính tích tất cả "ước số lẻ" của số nguyên dương n.
        + 27 Đếm số lượng "ước số chẵn" của số nguyên dương n.
        + 28 Cho số nguyên dương n. Tính tổng các ước số nhỏ hơn chính nó.
        + 29 Tìm ước số lẻ lớn nhất của số nguyên dương n. VD: n = 100 ước lẻ lớn nhất của 100 là 25.
    */
    // Câu 20 Liệt kê tất cả "ước số" của số nguyên dương n.
    public static void cau20(int n){
        for(int i = 1; i <= n; ++i){
            if(n%i == 0)
                System.out.println("Liet Ke: " + i);
        }
    }
    // Câu 21 Tính tổng tất cả "ước số" của số nguyên dương n.
    public static void cau21(int n){
        int S = 0;
        for(int i = 1; i <= n; ++i){
            if(n%i == 0)
                S += i;
        }
        System.out.println("Tong tat ca cac 'uoc so' la: " + S);
    }
    // Câu 22 Tính tích tất cả "ước số" của số nguyên dương n.
    public static void cau22(int n){
        int S = 1;
        for(int i = 1; i <= n; ++i){
            if(n%i == 0)
                S *= i;
        }
        System.out.println("Tich tat ca cac 'uoc so' la: " + S);
    }
    // Câu 23 Đếm số lượng "ước số" của số nguyên dương n.
    public static void cau23(int n){
        int count = 0;
        for(int i = 1; i <= n; ++i){
            if(n%i == 0)
                count++;
        }
        System.out.println("Dem so luong 'uoc so' la: " + count);
    }
    // Câu 24 Liệt kê tất cả "ước số lẻ" của số nguyên dương n.
    public static void cau24(int n){
        for(int i = 1; i <= n; ++i){
            if(n%i == 0) {
                if (i % 2 == 1)
                    System.out.println("Liet ke 'uoc so le' la: " + i);
            }
        }
    }
    // Câu 25 Tính tổng tất cả "ước số chẵn" của số nguyên dương n.
    public static void cau25(int n){
        int S = 0;
        for(int i = 1; i <= n; ++i){
            if(n%i==0) {
                if (i % 2 == 0)
                    S += i;
            }
        }
        System.out.println("Tong tat ca cac 'uoc so chan' la: " + S);
    }
    // Câu 26 Tính tích tất cả "ước số lẻ" của số nguyên dương n.
    public static void cau26(int n){
        int S = 1;
        for(int i = 1; i <= n; ++i){
            if(n%i==0) {
                if (i % 2 == 1)
                    S *= i;
            }
        }
        System.out.println("Tich tat ca cac 'uoc so le' la: " + S);
    }
    // Câu 27 Đếm số lượng "ước số chẵn" của số nguyên dương n.
    public static void cau27(int n){
        int S = 1, count=0;
        for(int i = 1; i <= n; ++i){
            if(n%i == 0)
                if (i%2==0)
                    count++;
        }
        System.out.println("Dem so luong 'uoc so chan' la: " + count);
    }
    // Câu 28 Cho số nguyên dương n. Tính tổng các ước số nhỏ hơn chính nó.
    public static void cau28(int n){
        int s = 0;
        for(int i = 1; i < n; ++i){
            if (n%i == 0){
                s += i;
            }
        }
        System.out.println("Tong cac 'uoc so' nho hon chinh no la: " + s);
    }
    // Câu 29 Tìm ước số lẻ lớn nhất của số nguyên dương n. VD: n = 100 ước lẻ lớn nhất của 100 là 25.
    public static void cau29(int n){
        int max = 1;
        for(int i = 1; i<=n; ++i){
            if (n%i == 0){
                if(i%2==1){
                    if(max < i){
                        max = i;
                    }
                }
            }
        }
        System.out.println("'Uoc so le' lon nhat " + max);
    }
    // Câu 30 Cho số nguyên dương n. Kiểm tra số nguyên dương n có phải là số hoàn thiện hay không?
    public static void cau30(int n){
        int s = 0;
        for(int i = 1; i <= n/2; ++i){
            if (n%i == 0){
                s += i;
            }
        }
        if(s==n)
            System.out.println("So hoan thien " + n);
        else
            System.out.println("Ko phai so hoan thien " + n);
    }
    // Câu 31 Cho số nguyên dương n. Kiểm tra số nguyên dương n có phải là số nguyên tố hay không?
    public static void cau31(int n){
        int count = 0;
        if (n<2)
            System.out.println("Ko phai so nguyen to " + n);
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 0){
            System.out.println("la so nguyen to " + n);
        }else{
            System.out.println("Ko phai so nguyen to " + n);
        }
    }
    // Câu 32 Cho số nguyên dương n. Kiểm tra số nguyên dương n có phải là số chính phương hay không?
    public static void cau32(int n){
        if (Math.sqrt((float)n) == (int)Math.sqrt((float)n))
            System.out.println("La so chinh phuong " + n);
        else
            System.out.println("Ko la so chinh phuong " + n);
    }

    public static void main(String[] argc){
        int n;
        do{
//            System.out.println("Enter :");
//            Scanner sc = new Scanner(System.in);
//            n = sc.nextInt();
            n = 97;
            if (n<0)
                System.out.println("Nhap sai nhap lai nhe!");
        }while (n<0);
//        cau20(n);
//        cau21(n);
//        cau22(n);
//        cau23(n);
//        cau24(n);
//        cau25(n);
//        cau26(n);
//        cau27(n);
//        cau28(n);
//        cau29(n);
//        cau30(n);
//        cau31(n);
//        cau32(n);
    }
}

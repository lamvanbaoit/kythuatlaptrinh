import java.util.Scanner;

public class Cau43_61 {
    // Câu 43 Hãy đếm số lượng chữ số của số nguyên dương
    public static void cau43(int n){
        int count = 0;
        while (n != 0){
            n /= 10;
            count++;
        }
        System.out.println("Dem so luong chu so cua so nguyen duong: " + count);
    }
    // Câu 44 Hãy tính tổng các chữ số của số nguyên nguyên dương n
    public static void cau44(int n){
        int s = 0;
        while (n != 0){
            int d = n % 10;
            s = s + d;
            n = n / 10;
        }
        System.out.println("Tinh tong cac chu so cua so nguyen duong: " + s);
    }
    // Câu 45 Hãy tính tích các chữ số của số nguyên nguyên dương n
    public static void cau45(int n){
        int s = 1;
        while (n != 0){
            int d = n % 10;
            s = s * d;
            n = n / 10;
        }
        System.out.println("Tinh tich cac chu so cua so nguyen duong: " + s);
    }
    // Câu 46 Hãy đếm số lượng chữ số lẻ của số nguyên dương n
    public static void cau46(int n){
        int count = 0;
        while (n != 0){
            if(n % 2 != 0)
                count++;
            n /= 10;
        }
        System.out.println("Dem so luong chu so le cua so nguyen duong: " + count);
    }
    // Câu 47 Hãy tính tổng các chữ số chẳn của số nguyên dương n
    public static void cau47(int n){
        int s = 0;
        while (n != 0){

            if(n % 2 == 0){
                int d = n % 10;
                s = s + d;
            }
            n = n / 10;
        }
        System.out.println("Tinh tong cac chu so chan cua so nguyen duong: " + s);
    }
    // Câu 48 Hãy tính tích các chữ số chẳn của số nguyên dương n
    public static void cau48(int n){
        int s = 1;
        while (n != 0){
            if(n % 2 != 0){
                int d = n % 10;
                s = s * d;
            }
            n = n / 10;
        }
        System.out.println("Tinh tich cac chu so le cua so nguyen duong: " + s);
    }
    // Câu 49 Cho số nguyên dương n. Hãy tìm chữ số đầu tiên của n
    public static void cau49(int n){
        int temp;
        do {
            temp = n % 10;
            n /= 10;
        } while (n > 0);
        System.out.println("Chu so dau tien: " + temp);
    }
    // Câu 50 Hãy tìm số đảo ngược của số nguyên dương n
    public static void cau50(int n){
        int s = 0;
        while (n > 0){
            int d = n % 10;
            s = s * 10 + d;
            n = n / 10;
        }
        System.out.println("Tim so dao nguoc: " + s);
    }
    // Câu 51 Tìm chữ số lớn nhất số nguyên dương n
    public static void cau51(int n) {
        int i, max = 0;
        if(n==0)
            max = 0;
        while (n!=0){
            i = n%10;
            if(i>max)
                max = i;
            n/=10;
        }
        System.out.println("Tim so lon nhat: " + max);
    }
    // Câu 52 Tìm chữ số nhỏ nhất số nguyên dương n
    public static void cau52(int n) {
        int i;
        int min = n%10;
        while (n!=0){
            i = n%10;
            if(i<min)
                min = i;
            n/=10;
        }
        System.out.println("Tim so nho nhat: " + min);
    }
    // Câu 53: Hãy đếm số lượng chữ số lớn nhất của số nguyên dương n
    public static void cau53(int n){
        int i;
        int max = 0;
        int count = 1;

        if(n==0)
            count = 1;
        do{
            i = n % 10;
            if(i == max)
                count++;
            if(i > max)
                max = i;
            n/=10;
        }while (n >=10);
        System.out.println("So lon nhat la " + max);
        System.out.println("So luong chu so lon nhat la " + count);
    }
    // Câu 54: Hãy đếm số lượng chữ số nhỏ nhất của số nguyên dương n
    public static void cau54(int n){
        int k;
        int min;
        int count = 0;
        min = n % 10;
        n /=10;
        while (n != 0){
            k = n % 10;
            if(k < min){
                min = k;
                count++;
            }
            n/=10;
        }
        System.out.println("So nho nhat la " + min);
        System.out.println("So luong chu so nho nhat la " + count);
    }
    // Câu 55 Hãy đếm số lượng chữ số đầu tiên của số nguyên dương n
    public static void cau55(int n){
        int count=0;
        while(n>=10){
            n /=10;
            count++;
        }
        int kq = count +1;
        System.out.println("Tổng số lượng của một chữ số " + kq);
    }
    // Câu 56: Hãy kiểm tra số nguyên dương n có toàn chữ số lẻ hay không
    public static void cau56(int n){
        int a, count=0, m=0;
        while (n!=0){
            a = n%10;
            if(n%2!=0)
                count++;
            n = n/10;
            m++;
        }
        if(m == count){
            System.out.println("Day so toan le");
        }else{
            System.out.println("Ko day so toan le");
        }
    }
    // Câu 57: Hãy kiểm tra số nguyên dương n có toàn chữ số chẵn hay không
    public static void cau57(int n){
        int a, count=0, m=0;
        while (n!=0){
            a = n%10;
            if(n%2==0)
                count++;
            n = n/10;
            m++;
        }
        if(m == count){
            System.out.println("Day so toan chan");
        }else{
            System.out.println("Ko day so toan chan");
        }
    }
    // Câu 59: Hãy kiểm tra số nguyên dương n có phải là số đối xứng hay không
    public static void cau59(int n){
        int reverse = 0, t;
        t = n;
        while (t != 0)
        {
            reverse = reverse * 10;
            reverse = reverse + t%10;
            t = t/10;
        }

        if (n == reverse)
            System.out.println("is a palindrome number." + n);
        else
            System.out.println("isn't a palindrome number." + n);
    }
    // Câu 60: Hãy kiểm tra các chữ số của số nguyên dương n có tăng dần từ trái sang phải hay không
    public static void cau60(int n){

    }
    // Câu 61: Hãy kiểm tra các chữ số của số nguyên dương n có giảm dần từ trái sang phải hay không
    public static void cau61(int n){

    }
    public static void main(String[] args){
        int n;
        do{
//            System.out.println("Enter n:");
//            Scanner sc = new Scanner(System.in);
//            n = sc.nextInt();
            n=1234;
            if (n<0)
                System.out.println("Nhap sai nhap lai: ");
        }while (n<0);

//        cau43(n);
//        cau44(n);
//        cau45(n);
//        cau46(n);
//        cau47(n);
//        cau48(n);
//        cau49(n);
//        cau50(n);
//        cau51(n);
//        cau52(n);
//        cau53(n);
//        cau54(n);
//        cau55(n);
//        cau56(n);
//        cau57(n);
//        cau59(n);
//        cau60(n);
//        cau61(n);
    }

}

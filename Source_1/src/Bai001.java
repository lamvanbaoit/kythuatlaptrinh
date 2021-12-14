import java.util.Scanner;
import java.lang.Math;

public class Bai001 {
    // S(n)=1+2+3+...+n
    public static void cau1(int n){
        int i, s = 0;
        for(i = 1; i<=n; ++i){
            s += i;
        }
        System.out.println("Kết quả câu 1: " + s);
    }
    // S(n)=1^2+2^2+3^2+...+n^2
    public static void cau2(int n){
        int i;
        float s = 0;
        for(i = 1; i<=n; ++i){
            s += (float)i*i; // s += Math.pow(i,2);
        }
        System.out.println("Kết quả câu 2: " + s);
    }
    // S(n)=1+1/2+1/3+...+1/n
    public static void cau3(int n){
        int i;
        float s = 0;
        for(i = 1; i<=n; ++i){
            s += 1.0 / i;
        }
        System.out.println("Kết quả câu 3: " + s);
    }
    // S(n)=1/2+1/4+...+1/2n
    public static void cau4(int n){
        int i;
        float s = 0;
        for(i = 1; i<=n; ++i){
            s += 1.0 / (2*i);
        }
        System.out.println("Kết quả câu 4: " + s);
    }
    // S(n)=1+1/3+1/5+...+1/(2n+1)
    public static void cau5(int n){
        int i;
        float s = 0;
        for(i = 1; i<=n; ++i){
            s += 1.0 / ((2 * i) + 1);
        }
        System.out.println("Kết quả câu 5: " + s);
    }
    // S(n)=1/(1*2)+1/(2*3)+...+1/(n*(n+1))
    public static void cau6(int n){
        int i;
        float s = 0;
        for(i = 1; i<=n; ++i){
            s += 1.0 / (i* (i + 1));
        }
        System.out.println("Kết quả câu 6: " + s);
    }
    // S(n)=1/2+2/3+3/4+...+n/(n+1)
    public static void cau7(int n){
        float i;
        float s = 0;
        for(i = 1; i<=n; ++i){
            s += i / (i + 1);
        }
        System.out.println("Kết quả câu 7: " + s);
    }
    // S(n)=1/2+3/4+5/6+...+(2n+1)/(2n+2)
    public static void cau8(int n){
        float i;
        float s = 0;
        for(i = 0; i<n; ++i){
            s += ((2*i) + 1) / ((2*i) + 2);
        }
        System.out.println("Kết quả câu 8: " + s);
    }
    // T(n)=1*2*3*...*n
    public static void cau9(int n){
        int i;
        int T = 1;
        for(i = 1; i<=n; ++i){
            T *= i;
        }
        System.out.println("Kết quả câu 9: " + T);
    }
    // T(x,n)=x^n
    public static void cau10(int n){
        System.out.println("Enter x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int T = 1;
        for (int i = 1; i <= n; i++)
        {
            T = T * x;
        }
        System.out.println("Kết quả câu 10: " + T);
    }
    // S(n)=1+1*2+1*2*3+...+1*2*3*...n
    public static void cau11(int n){
        int S = 0, P = 1;
        for(int i = 1; i <= n; ++i){
            P *= i;
            S += P;
        }
        System.out.println("Kết quả câu 11: " + S);
    }
    // S(n)=x+x^2+x^3+...+x^n
    public static void cau12(int n){
        System.out.println("Enter x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int P = 1, S = 0;
        for (int i = 1; i <= n; i++)
        {
            P = P * x; // P = Math.pow(x, i );
            S = S + P;
        }
        System.out.println("Kết quả câu 12: " + S);
    }
    // S(n)=x^2+x^4+...+x^2n
    public static void cau13(int n){
        System.out.println("Enter x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int P = 1, S = 0;
        for (int i = 1; i <= n; i++)
        {
            P = P * x * x; // P = Math.pow(x, (2 * i ));
            S = S + P;
        }
        System.out.println("Kết quả câu 13: " + S);
    }
    // S(n)=x+x^3+x^5+...+x^(2n+1)
    public static void cau14(int n){
        System.out.println("Enter x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int P = 1, S = x; // S = 0;
        for (int i = 0; i < n; i++)
        {
            P = P * x * x; // T = Math.pow(x, (2 * i + 1));
            S = S + P * x; // S = S + T;
        }
        System.out.println("Kết quả câu 14: " + S);
    }
    // S(n)=1+1/(1+2)+1/(1+2+3)+...+1/(1+2+3+...+n)
    public static void cau15(int n){
        float S = 0, P = 0;
        for(int i = 1; i <= n; ++i){
            P += (float)i;
            S += 1.0/P;
        }
        System.out.println("Kết quả câu 15: " + S);
    }
    // S(n)=x+x^2/(1+2)+x^3/(1+2+3)+...+x^n/(1+2+3+...+n)
    public static void cau16(int n){
        System.out.println("Enter x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        float S = 0, P = 0, T = 1;
        for(int i = 1; i <= n; ++i){
            T = T * x; // T = Math.pow(x,i);
            P += (float)i;
            S += T / P;
        }
        System.out.println("Kết quả câu 16: " + S);
    }
    // S(n)=x+x^2/2!+x^3/3!+...+x^n/n!
    public static void cau17(int n){
        System.out.println("Enter x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        float S = 0, P = 1, T = 1;
        for(int i = 1; i <= n; ++i){
            T = T * x; // T = Math.pow(x,i);
            P = P * i;
            S += T/P;
        }
        System.out.println("Kết quả câu 17: " + S);
    }
    // S(n)=1+x^2/2!+x^4/4!+...+(x^(2n))/(2n)!
    public static void cau18(int n){
        System.out.println("Enter x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        float S = 1, P = 1, T = 1;
        for(int i = 1; i <= n; ++i){
            T = T * x * x; // T = Math.pow(x, (2 * i ));
            float M = 2*i;
            P = P * M * (M - 1);
            S += T/P;
        }
        System.out.println("Kết quả câu 18: " + S);
    }
    // S(n)=x+x^3/3!+x^5/5!+...+x^(2n+1)/(2n+1)!
    public static void cau19(int n){
        System.out.println("Enter x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        float S = 1, P = 1, T;
        for(int i = 1; i <= n; ++i) {
            T = (float) Math.pow(x,(2*i + 1));
            float M = 2*i + 1;
            P = P * M * (M - 1);
            S = S + x + T / P;
        }
        System.out.println("Kết quả câu 19: " + S);
    }

    public static void cau19c2(int n){
        System.out.println("Enter x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        float S = 1, P = 1, T = 1;
        for(int i = 1; i <= n; ++i) {
            T = T * x * x;
            float M = 2*i + 1;
            P = P * M * (M - 1);
            S = S + x + T*x/P;
        }
        System.out.println("Kết quả câu 19 cách 2: " + S);    }

    public static void main(String[] argc){
        int n;
        do{
            System.out.print("Enter n: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            if (n<0)
                System.out.println("Nhập sai nhập lai ");
        }while (n<0);

        cau1(n);
        cau2(n);
        cau3(n);
        cau4(n);
        cau5(n);
        cau6(n);
        cau7(n);
        cau8(n);
        cau9(n);
        cau10(n);
        cau11(n);
        cau12(n);
        cau13(n);
        cau14(n);
        cau15(n);
        cau16(n);
        cau17(n);
        cau18(n);
        cau19(n);
        cau19c2(n);
    }
}
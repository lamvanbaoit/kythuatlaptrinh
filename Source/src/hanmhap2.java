import java.util.Scanner;

public class hanmhap2 {
    // Nhập và xuất mảng
    public static int[] InputArray() {
        int[] a = {9, 5, 8, 7, 3, 1, 2, 4, 6, 10};
        return a;
    }

    public static void PrintArray(int[] a) {
        System.out.print("Các phần tử của mảng A là: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\t ");
    }

    public static void main(String[] args) {
        int[] a = InputArray();
        PrintArray(a);
    }
}

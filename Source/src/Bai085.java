public class Bai085 {
    //
    public static void Bai085(int month){
        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("Qui 1");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Qui 2");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Qui 3");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Qui 4");
                break;
        }
    }

    public static void main(String[] argc){
        int month = 2;
        Bai085(month);
    }
}

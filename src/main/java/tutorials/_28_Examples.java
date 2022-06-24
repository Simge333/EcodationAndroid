package tutorials;

import java.util.Date;

public class _28_Examples {
    public static void main(String[] args) {
        //bugün günlerden ne??

       /* Date date =new Date();
        int gun=date.getDay();*/
        int gun=new Date().getDay();
        switch (gun){
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 0:
                System.out.println("pazar");
                break;
            default:
                System.out.println("yok öyle bir gün");
                break;
        }

    }
}

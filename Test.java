import java.io.Console;
import java.util.Scanner;





public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int toplam=0;
        while(true)
        {
            System.out.print("Sayı:");
            int sayi=input.nextInt();
            if(sayi%2==0)
                if(sayi%4==0)
                    toplam+=sayi;
                else
                    continue;
            else
                break;
        }
        System.out.println("Toplam:"+toplam);
    }
}

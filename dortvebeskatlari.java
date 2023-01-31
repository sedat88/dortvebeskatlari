import java.util.Scanner;
public class dortvebeskatlari {
    public static void main(String[] args) {
        int n4;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        n4 = inp.nextInt();

        //// 4 ün Kuvvetleri :

        for ( int i = 1; i <= n4 ; i *= 4) {
            System.out.println(" 4'ün kuvvetleri : " + i);
        }
        //// 5 in Kuvvetleri :
        System.out.println("--------------------------");

        int n5;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        n5 = input.nextInt();
        for (int j = 1; j <= n5; j *= 5){
            System.out.println("5' in Kuvvetleri : "+j);
        }
    }
}






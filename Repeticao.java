
import java.util.Scanner;

public class Repeticao {

    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);
        int num = 0;
        System.out.println("Valor da repetição: ");
        num = ler.nextInt();
        for(int i = 0 ; i <= num; i++){
            for (int j = 0 ; j <= i ; j++){
                System.out.print( i + " ");
        }System.out.println();}

    }
}

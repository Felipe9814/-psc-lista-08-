import java.util.Scanner;
public class RepeticaoDois {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        int nine ;
        System.out.printf("valor das linhas: ");
        nine = le.nextInt();
        for(int i = 0 ; i <= nine ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(j + " ");
            }System.out.println();
        } le.close();
    }
}
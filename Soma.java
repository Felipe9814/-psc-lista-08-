import java.util.Scanner;
public class Soma {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        int[] n = new int[3];
        int resultado = 0;
        for (int i = 0 ; i< 3; i++) {
            System.out.printf((i + 1) + "° de tres numeros: ");
            n[i] = le.nextInt();
            resultado = soma(n[0], n[1], n[2]);
        }
        System.out.println("A soma dos resultados: "+ resultado);

        le.close();
    }
        public static int soma(int um , int dois , int tres){
        return um+dois+tres;
        }
}
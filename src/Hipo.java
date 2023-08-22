// import java.util.*;
import java.util.Scanner;

class Hipo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int cateto1;
        int cateto2;
        double hipotenusa;
        System.out.println("Qual o valor do cateto 1: ");
        cateto1 = scanner.nextInt();
        System.out.println("Qual o valor do cateto 2: ");
        cateto2 = scanner.nextInt();
        hipotenusa = Math.sqrt(cateto1 * cateto1) + (cateto2 * cateto2);

        System.out.println("A Hipotenusa é " + hipotenusa);


    }
}
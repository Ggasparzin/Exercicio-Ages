
import java.util.Scanner;

public class adivinhacaoWhileDev{
    public static void main(String[] args) {
        /*Crie um programa que:
        1: Escolha um número aleatório de 1 - 100
        2: peça ao usuário para tentar adivinhar
        3: Se o palpite for menor, exiba "Tente um número maior"
        4: Se for maior, exiba "Tente um número menor"
        5: Continue até que o usuário acerte*/

        int rNumero;

        double num = Math.random() * 100;
        int numAleat = (int) num;
            System.out.println("Dev: " + numAleat);
        
        Scanner scan = new Scanner(System.in);
            System.out.print("Bem vindo(a)!, tente adivinhar o numero de 1 a 100: ");
    do{
        rNumero = scan.nextInt();

        if(rNumero > numAleat){
            System.out.println("Tente um numero menor!");
        }
        else if (rNumero < numAleat){
            System.out.println("Tente um numero maior!");
        }
    }
    while(rNumero != numAleat);
            
            System.out.println("Voce acertou o numero!");
    }
}   
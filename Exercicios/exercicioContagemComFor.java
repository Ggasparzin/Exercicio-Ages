public class exercicioContagemComFor{
    public static void main(String[] args){
        //Escreva um programa que exiba os numeros de 1 a 50, mas:
        //Substitua os multiplos de 3 por "Fizz"
        //Substitua os multiplos de 5 por "Buzz"
        //Substitua os multiplos de 3 e 5 por "FizzBuzz"

        int numero;

        for(int i = 1; i <= 50; i++){
            numero = i;

            if(numero % 3 == 0 && numero % 5 != 0){
                System.out.println("Fizz");
            }
            else if(numero % 5 == 0 && numero % 3 !=0){
                System.out.println("Buzz");
            }
            else if(numero % 5 == 0 && numero % 3 == 0){
                System.out.println("FizzBuzz");
            }
            else{
                System.out.println(numero);
            }
        }
    }
}
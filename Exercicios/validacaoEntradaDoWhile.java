import java.util.Scanner;
public class validacaoEntradaDoWhile{
    public static void main(String[] args){
        /*Crie um programa que: 
        Peca ao usuario para inserir uma senha
        Continue pedindo ate que a senha digitada seja "Java21"
        Exiba "acesso permitido" quando a senha estiver correta*/
        String senha;
        String senhaCorreta = "Java21";
        Scanner scan = new Scanner(System.in);
        System.out.print("Bem vindo(a): ");
        do{
            System.out.print("Digite uma senha: ");
                senha = scan.nextLine();

            if(!senha.equals(senhaCorreta)){
                System.out.println("Senha incorreta, tente novamente! ");        
            }
        }
        while(!senha.equals(senhaCorreta));

        System.out.println("Acesso permitido!");
    }
}
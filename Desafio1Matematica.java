/*
 * Desafio 1 - Matemática , 25/10/2019
 * Todos os direitos reservados para Bruno Gobo Soares - cel(44)9 9116-0073
 */
package desafio1matematica;

import java.util.Scanner;
/**
 * Código feito para Db1 Start
 * @version 1.0 
 * @author Bruno Gobo Soares 
 */
public class Desafio1Matematica {

    public static void main(String[] args) {
        String resp = " "; // valor em branco apenas para inicializar a variável
        int c1 = 0;
        
        System.out.println("------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("              DESAFIO DE MATEMÁTICA: Testador numérico");
        //Estrutura do-while para repetir o teste quantas vezes o usuário necessitar
        do{
            Scanner tc = new Scanner (System.in);

            //Contar quantas vezes o usuário fez o teste para tornar o uso mais agradável
            if(c1==0){
                System.out.println("           Tecle 'ENTER' para começar. Para sair tecle 'n'.");
                resp = tc.nextLine();
                c1++;
            }else if (c1>0){
                System.out.println("           Tecle 'ENTER' para reiniciar. Para sair tecle 'n'.");
                resp = tc.nextLine();
            }

            //Garantir que o usuário saia do programa mesmo que esteja com o caps lock ligado
            if("n".equals(resp)||"N".equals(resp)){
                break;
            }

            //Receber o número        
            System.out.print("Digite um número inteiro: ");
            int num = tc.nextInt();
            System.out.println(" ");

            //Identificar se o número é par ou ímpar e exibir
            if(num%2==0){
                System.out.print("      O número digitado é: par, não é ímpar; ");
            }else{
                System.out.print("      O número digitado é: ímpar, não é par; ");
            }


            //Identificar se é menor, maior ou igual a 10
            if(num <10){
                System.out.print("não é maior que 10; ");
            }else if(num==10){
                System.out.print("é igual a 10; ");
            }else{
                System.out.print("é maior que 10; ");
            }


            //Multiplicador
            System.out.print("o dobro de " + num + " é " + num*2 + "; " );

            //Verificar se é primo
            int quantdiv = 0;
            for (int c2 = 1; c2 <= num; c2++){
                if(num%c2 == 0){
                    quantdiv = quantdiv+1;
                }
            }
            if(quantdiv == 2){
                System.out.println("é primo;    ");
            }else{
                System.out.println("não é primo;    ");
            }

            //Finalizar a secção 
            System.out.println(" ");
            System.out.println("------------------------------------------------------------------");   
            System.out.println(" ");
        }while(!"n".equals(resp));
    }
}

/*
 * Desafio 2 - Português , 25/10/2019
 * Todos os direitos reservados para Bruno Gobo Soares - cel(44)9 9116-0073
 */
package desafio2portugues;

import java.util.Scanner;
/**
 * Código feito para Db1 Start
 * @version 1.0 
 * @author Bruno Gobo Soares 
 */
public class Desafio2Portugues {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String r = " "; // valor em branco apenas para inicializar a variável
        int c1 = 0;
        System.out.println("------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("                      DESAFIO DE PORTUGUÊS");
        //Repetir o teste quantas vezes o usuário precisar usando do-while
        do{
            int branco = 0;
            int vogal = 0;            
            //Contar quantas vezes o usuário fez o teste para melhorar o uso
            if(c1 == 0){
                System.out.println("        Tecle 'ENTER' para começar. Para sair tecle 'n' .");
                r = tc.nextLine();
                c1++;
            }else if (c1>0){
                System.out.println("        Tecle 'ENTER' para reiniciar. Para sair tecle 'n' .");
                r = tc.nextLine();
            }

            //Garantir que o usuário saia do programa mesmo que esteja com o caps lock ligado
            if("N".equals(r)||"n".equals(r)){
                break;
            }

            //Receber o texto 
            System.out.print("Digite algum texto: ");
            String txt = tc.nextLine();
            System.out.println(" ");

            //Iniciar a solução
            System.out.print("      O texto digitado tem:");

            //Identificar quantos caracteres
            System.out.print(txt.length() + " caracteres ");

            //Identificar espaços em branco e vogais digitadas
            for(int c2 = 0; c2 < txt.length() ; c2++){
                if (txt.charAt(c2) == ' '){
                    branco++;
                }
                if (txt.charAt(c2) == 'a'|txt.charAt(c2) == 'A' |
                    txt.charAt(c2) == 'e'|txt.charAt(c2) == 'E' |
                    txt.charAt(c2) == 'i'|txt.charAt(c2) == 'I' |
                    txt.charAt(c2) == 'o'|txt.charAt(c2) == 'O' |
                    txt.charAt(c2) == 'u'|txt.charAt(c2) == 'U' ){
                    
                    vogal++;
                }
            }
            System.out.println(branco + " espaços em branco " + " e " + vogal + " vogais. ");

            //Finalizar a secção
            System.out.println(" ");
            System.out.println("------------------------------------------------------------------");
            System.out.println(" ");
        }while(!"n".equals(r));
        
    }
}
/*
 * Desafio 3 - Geografia , 25/10/2019
 * Todos os direitos reservados para Bruno Gobo Soares - cel(44)9 9116-0073
 */
package desafio3geografia;

import java.util.Scanner;
/**
 * Código feito para Db1 Start
 * @version 1.0 
 * @author Bruno Gobo Soares 
 */
public class Desafio3Geografia {

    public static void main(String[] args) {
        
        //      FOI ENCONTRADO UM ERRO EM DETERMINADAS VERSÕES DE IDE'S COM A ENCODIFICAÇÃO
        //      A ENCODIFICAÇÃO DA IDE DEVE SER FORÇADA PARA 'ISO-8859-1' PARA FUNCIONAR CORRETAMENTE                          

        String reset = " ";  // valor em branco apenas para inicializar a variável
        int cg = 0;
        Scanner tc = new Scanner(System.in);
        
        
        System.out.println("------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("                      DESAFIO DE GEOGRAFIA");

        //Cadastrando as cidades
        Cidade c0 = new Cidade("Curitiba","Pr", "é capital" );
        Cidade c1 = new Cidade("Maringá","Pr", "não é capital" );
        Cidade c2 = new Cidade("Londrina","Pr", "não é capital" );
        Cidade c3 = new Cidade("Pinhais","Pr", "não é capital" );        
        Cidade c4 = new Cidade("Chapecó","Sc", "não é capital" );        
        Cidade c5 = new Cidade("Joinville","Sc", "não é capital" );        
        Cidade c6 = new Cidade("Blumenau","Sc", "não é capital" );        
        Cidade c7 = new Cidade("Florianópolis","Sc", "é capital" );        
        Cidade c8 = new Cidade("Porto Alegre","Rs", "é capital" );        
        Cidade c9 = new Cidade("Gramado","Rs", "não é capital" );        

        //Estrutura "até que" para repetir o teste quantas vezes o usuário quiser
        do{
            //Contar quantas rodadas passaram para tornar o uso mais agradável
            if(cg == 0){
                System.out.println("        Tecle 'ENTER' para começar. Para sair tecle 'n' .");
                reset = tc.nextLine();
                cg++;
            }else if (cg > 0){
                System.out.println("        Tecle 'ENTER' para reiniciar. Para sair tecle 'n' .");
                reset = tc.nextLine();
            }
            
            //Garantir que o usuário saia do looping ao digitar 'n' com, ou não, a tecla caps lock ligado
            if("N".equals(reset)||"n".equals(reset)){
                break;
            }
            
            System.out.println("Tenho informações das cidades: Curitiba, Maringá, Londrina, Pinhais, Chapecó, Joinville, Blumenau, Florianópolis, Porto Alegre, Gramado. ");

            //Requisitar a cidade e garantir que erros de digitação ou encodificação não atrapalhem tanto e
            //Identificar qual cidade o usuário digitou e exibir
            System.out.print("Digite a cidade que deseja obter informações, ou tecle 'n' para voltar: ");
            String cidade = tc.nextLine().toUpperCase();
            
            if("N".equals(cidade)||"n".equals(cidade)){       //SAIDA DO LOOPING
                break;
            }
            
            if(null == cidade){             //PEQUENO METODO PARA TESTAR SE FOI DIGITADO CORRETAMENTE
                System.out.println("Cidade " + cidade + " inválida, por favor comece novamente: ");
                
            }else switch (cidade) {         //TODAS ESTÃO EM MAIÚSCULA, PARA GARANTIR O FUNCIONAMENTO INTUITIVO
                case "CURITIBA":
                    c0.status();
                    break;
                case "MARINGÁ":
                case "MARINGA":
                    c1.status();
                    break;
                case "LONDRINA":
                    c2.status();
                    break;
                case "PINHAIS":
                    c3.status();
                    break;
                case "CHAPECÓ":
                case "CHAPECO":
                    c4.status();
                    break;
                case "JOINVILLE":
                    c5.status();
                    break;
                case "BLUMENAU":
                    c6.status();
                    break;
                case "FLORIANÓPOLIS":
                case "FLORIANOPOLIS":
                    c7.status();
                    break;
                case "PORTO ALEGRE":
                    c8.status();
                    break;
                case "GRAMADO":
                    c9.status();
                    break;
                default:
                    System.out.println("Cidade " + cidade + " inválida, por favor comece novamente: ");
                    break;
            }

            //Encerrar a rodada
            System.out.println(" ");
            System.out.println("------------------------------------------------------------------");
            System.out.println(" ");
        }while(!"n".equals(reset));        
    }
}
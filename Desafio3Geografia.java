/*
 * Desafio 3 - Geografia , 25/10/2019
 * Todos os direitos reservados para Bruno Gobo Soares - cel(44)9 9116-0073
 */
package desafio3geografia;

import java.util.Scanner;
/**
 * C�digo feito para Db1 Start
 * @version 1.0 
 * @author Bruno Gobo Soares 
 */
public class Desafio3Geografia {

    public static void main(String[] args) {
        
        //      FOI ENCONTRADO UM ERRO EM DETERMINADAS VERS�ES DE IDE'S COM A ENCODIFICA��O
        //      A ENCODIFICA��O DA IDE DEVE SER FOR�ADA PARA 'ISO-8859-1' PARA FUNCIONAR CORRETAMENTE                          

        String reset = " ";  // valor em branco apenas para inicializar a vari�vel
        int cg = 0;
        Scanner tc = new Scanner(System.in);
        
        
        System.out.println("------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("                      DESAFIO DE GEOGRAFIA");

        //Cadastrando as cidades
        Cidade c0 = new Cidade("Curitiba","Pr", "� capital" );
        Cidade c1 = new Cidade("Maring�","Pr", "n�o � capital" );
        Cidade c2 = new Cidade("Londrina","Pr", "n�o � capital" );
        Cidade c3 = new Cidade("Pinhais","Pr", "n�o � capital" );        
        Cidade c4 = new Cidade("Chapec�","Sc", "n�o � capital" );        
        Cidade c5 = new Cidade("Joinville","Sc", "n�o � capital" );        
        Cidade c6 = new Cidade("Blumenau","Sc", "n�o � capital" );        
        Cidade c7 = new Cidade("Florian�polis","Sc", "� capital" );        
        Cidade c8 = new Cidade("Porto Alegre","Rs", "� capital" );        
        Cidade c9 = new Cidade("Gramado","Rs", "n�o � capital" );        

        //Estrutura "at� que" para repetir o teste quantas vezes o usu�rio quiser
        do{
            //Contar quantas rodadas passaram para tornar o uso mais agrad�vel
            if(cg == 0){
                System.out.println("        Tecle 'ENTER' para come�ar. Para sair tecle 'n' .");
                reset = tc.nextLine();
                cg++;
            }else if (cg > 0){
                System.out.println("        Tecle 'ENTER' para reiniciar. Para sair tecle 'n' .");
                reset = tc.nextLine();
            }
            
            //Garantir que o usu�rio saia do looping ao digitar 'n' com, ou n�o, a tecla caps lock ligado
            if("N".equals(reset)||"n".equals(reset)){
                break;
            }
            
            System.out.println("Tenho informa��es das cidades: Curitiba, Maring�, Londrina, Pinhais, Chapec�, Joinville, Blumenau, Florian�polis, Porto Alegre, Gramado. ");

            //Requisitar a cidade e garantir que erros de digita��o ou encodifica��o n�o atrapalhem tanto e
            //Identificar qual cidade o usu�rio digitou e exibir
            System.out.print("Digite a cidade que deseja obter informa��es, ou tecle 'n' para voltar: ");
            String cidade = tc.nextLine().toUpperCase();
            
            if("N".equals(cidade)||"n".equals(cidade)){       //SAIDA DO LOOPING
                break;
            }
            
            if(null == cidade){             //PEQUENO METODO PARA TESTAR SE FOI DIGITADO CORRETAMENTE
                System.out.println("Cidade " + cidade + " inv�lida, por favor comece novamente: ");
                
            }else switch (cidade) {         //TODAS EST�O EM MAI�SCULA, PARA GARANTIR O FUNCIONAMENTO INTUITIVO
                case "CURITIBA":
                    c0.status();
                    break;
                case "MARING�":
                case "MARINGA":
                    c1.status();
                    break;
                case "LONDRINA":
                    c2.status();
                    break;
                case "PINHAIS":
                    c3.status();
                    break;
                case "CHAPEC�":
                case "CHAPECO":
                    c4.status();
                    break;
                case "JOINVILLE":
                    c5.status();
                    break;
                case "BLUMENAU":
                    c6.status();
                    break;
                case "FLORIAN�POLIS":
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
                    System.out.println("Cidade " + cidade + " inv�lida, por favor comece novamente: ");
                    break;
            }

            //Encerrar a rodada
            System.out.println(" ");
            System.out.println("------------------------------------------------------------------");
            System.out.println(" ");
        }while(!"n".equals(reset));        
    }
}
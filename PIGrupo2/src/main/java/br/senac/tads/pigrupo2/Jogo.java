/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pigrupo2;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author Raí
 */
public class Jogo {

    /**
     * @param args the command line arguments
     */
     public static void menu (){ 
        int escolha;
        int menu=0;
        Scanner input = new Scanner(System.in);
            while(menu <= 1){
            System.out.println("1.Instruções\n2.Jogar\n3.Créditos\n4.Sair");

            escolha = input.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("A opção escolhida foi Instruções.");
                System.out.println("A opção (2)Jogar iniciara o jogo, todos os comandos deverão ser introduzidos por texto quando solicitados.\n"
                        + "A escolha (3)Creditos ira mostrar o nome dos criadores do projeto. \n"
                        + "E a escolha (4)Sair for selecionada o programa vai se encerrar.\n");
                break;
            case 2:
                System.out.println("A opção escolhida foi jogar");
                System.out.println("Iniciando jogo...");
                menu=menu+2;
                break;
            case 3:
                System.out.println("Criado por: Raí Fernando Santos Viana; \n José Natan Claudino Dantas; \n Bruno Viana Rufino; \n Gian Felipe Pechuti.\n Senac 2021, Projeto Integrador, Grupo 2. ");
                break;
            case 4:
                System.out.println("Saindo...");
                System.exit(0);
            default:
                System.out.println("Escolha invalida");
        }
      }
    }        
    
       //*****************************************************************************************************************************************
    //*****************************************************************************************************************************************
    //Metodos do combate
    static ArrayList<String> itens = new ArrayList<String>();//Aqui é onde vão ser armazenado todos os itens
    static int dmInimigo;//o dano do inimigo deve ser global por conta dos itens de efeito

    //caracteristicas do jogador
    static int vdjogador;
    static int dmjogador;

    //vitoria 
    static boolean vitoria = false;

    static void batalha(int vdinimigo,String caracInimigo){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int escolha,danoroundjg = 0, danoroundim = 0;
        boolean lutafim = false;
        do{                                         //do while, serve pra manter o loop da batalha se repetindo
            if(vdinimigo <= 0 && vdjogador > 0){//caso inimigo tenha zerado seus pontos de vida e jogador não encerra a batalha e garante a vitoria
                lutafim = true;
                vitoria = true;
            }else if(vdinimigo >= 0 && vdjogador <=0){//caso aja empate ou o jogador tenha menos vida que o inimigo
                lutafim = true;
                vitoria = false;
            }else{
                System.out.println("o que você vai faze: \n" +
                                "1.Atacar 2.Tentar Fugir 3.Itens"); //seleciona uma ação atraves dos numeros
                escolha = input.nextInt();
                switch (escolha) {
                    case 1:                     // caso atacar
                        vdinimigo -= dmjogador; //causa dano ao inimigo
                        danoroundjg = dmjogador;//guarda dano causado para informar jogador
                        break;
                    case 2:                     //caso tentar fujir
                        int sorte = rand.nextInt(10);   //gera o numero da sorte do jogador até 10
                        int chances = rand.nextInt(10); //gera um numero
                        if(sorte > chances){            //se numero da sorte for maior que o outro numero aleatorio encerra a luta e o jogador foje
                            lutafim = true;
                        }else{
                            vdjogador -= dmInimigo - 5; //caso falhe jogador toma um dano adicional
                        }
                        break;
                    case 3:                     //caso use item
                        System.out.println("Escolha seu item:");
                        for(int i=0; i<itens.size();i++){               //lista todos os itens no inventario do jogador
                            System.out.println(i+". " + itens.get(i));
                        }
                        int resposta = input.nextInt();                 //recebe o item escolhido
                        int dano = danoItem(itens.get(resposta), caracInimigo); //procura o item no metodo dos itens caso seja um item de efeito e retorna 0 de dano
                        vdinimigo -= dano;
                        danoroundjg = dano;
                    default:
                        System.out.println("Selecione uma opção valida");
                        break;
                }
                danoroundim = dmInimigo;      
                vdjogador -= dmInimigo;     //causa dano do inimigo para o jogador
                System.out.println("\n Seu dano: "+danoroundjg);     //informa dano
                System.out.println("\n Dano inimigo: "+danoroundim);

                System.out.println("\n Sua Vida: "+vdjogador);       //informa vida
                System.out.println("\n Vida inimigo: "+vdinimigo);

            }
        }while(!lutafim);
        if(lutafim && vdjogador > 0 && vitoria == false){
            System.out.println("Fugiu com Sucesso");
        }else if(vitoria){
            System.out.println("Inimigos Derrotados");
        }else{
            System.out.println("Derrota");
        }
    }

   

    static int danoItem(String item,String caracInimigo){ //verifica todos os itens e seus efeitos, alguns itens tem efeito diferente dependendo das caracteristicas do inimigo
        if("Tocha".equals(item)){             //itens de dano
            if("Grama".equals(caracInimigo)){
                return 10;
            }else{
                return 0;
            }
        }else if("Bomba d'gua".equals(item)){
            if("Fogo".equals(caracInimigo)){
                return 10;
            }else if("Grama".equals(caracInimigo)){
                return 0;
            }else{
                return 5;
            }
        }else if("Bomba".equals(item)){
            if("Grama".equals(caracInimigo)){
                return 15;
            }else{
                return 10;
            }
        }else if("Bomba Magica".equals(item)){  //itens de efeito
            System.out.println(dmInimigo);
            dmInimigo = dmInimigo - 5;
            return 0;
        }else if("Poção".equals(item)){
            vdjogador += 10;
            return 0;
        }else{
            System.out.println("ERRO");
            return 0;
        }
    }
            
    public static void main(String[] args) {
        menu();
        System.out.println("Teste ok");
        
        vdjogador = 20;
        dmjogador = 5;
        itens.add("Tocha"); //assim é como os itens são adicionados ao jogador
        itens.add("Bomba Magica");
        itens.add("Poção");

        dmInimigo = 10;//aqui onde será definido o dano do inimigo isso deve ser feito sempre antes de uma batalha
        batalha(20,"Grama");//esse metodo é o que começa uma luta, basta passar como parametro a vida do inimigo e sua caracteristica, Fogo Água etc...
        if(vitoria){
            //caso ele tenha ganho a batalha dar recompensas do jogador segundo fluxograma,  e colocar vitoria como falso
            vitoria = false;
        }
    }
}

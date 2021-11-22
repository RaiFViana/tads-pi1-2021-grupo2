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
    public static void menu() {
        int escolha;
        int menu = 0;
        Scanner input = new Scanner(System.in);
        while (menu <= 1) {
            System.out.println("1.Instruções\n2.Jogar\n3.Créditos\n4.Sair\n5.Enredo");

            escolha = input.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("A opção escolhida foi Instruções.");
                    System.out.println("A opção (2)Jogar iniciara o jogo, todos os comandos deverão ser introduzidos por texto quando solicitados.\n"
                            + "A escolha (3)Creditos ira mostrar o nome dos criadores do projeto. \n"
                            + "E a escolha (4)Sair for selecionada o programa vai se encerrar.\n"
                            + " A escolha (5)Enredo é uma introdução sobre o enredo do jogo.\n");
                    break;
                case 2:
                    System.out.println("A opção escolhida foi jogar");
                    System.out.println("Iniciando jogo...");
                    menu = menu + 2;
                    break;
                case 3:
                    System.out.println("Criado por: Raí Fernando Santos Viana; \n José Natan Claudino Dantas; \n Bruno Viana Rufino; \n Gian Felipe Pechuti; \n Gustavo Falcione Cagnato.\n Senac 2021, Projeto Integrador, Grupo 2. ");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                case 5:
                    System.out.println("O “herói” (jogador) é um explorador, um rapaz bem-informado, e descobre da lenda da \n"
                            + "Ehrgeiz Dungeon, um lugar onde qualquer ambição daquele que entrar na dungeon e sair vivo \n"
                            + "será realizada, nosso “herói” ao encontrar esse lugar não perde a oportunidade e adentra a \n"
                            + "dungeon, no mesmo instante, ele perde sua consciência e acorda com somente uma tocha e \n"
                            + "uma mochila velha ao seu lado, tudo que lhe resta é seguir em frente.\n"
                            + "O que é Ehrgeiz Dungeon? é um local onde são reunidas pessoas de todas as dimensões, \n"
                            + "linhas-temporais, para um único propósito, lutar, para o prazer de quem isso nunca \n"
                            + "saberemos, talvez Deus?\n"
                            + "Salas em que o “herói” entra: todas elas representam um elemento, que correspondem, a \n"
                            + "terra natal do inimigo correspondente, na primeira sala é possível encontrar os homens peixe,\n"
                            + "você é o desafio para eles da mesma maneira que eles para você, é a forma como a dungeon \n"
                            + "funciona, colocando o jogador sempre no último destino de outros que buscam sua ambição\n");
                    break;
                default:
                    System.out.println("Escolha invalida");
            }
        }
    }

    public static void salaAgua() {

        dmInimigo = 5;
        batalha(20, "Agua");
        if (vitoria) {

            itens.add("Bomba d'gua");
            itens.add("Poção");
            vdjogador = 25;

            vitoria = false;

            System.out.println("Você vence a batalha e recolhe os itens dos homens peixes,"
                    +"\n Ítens Adquiridos"
                    + "\n+1 bomba d'água"
                    + "\n+1 poção de cura de 10 pontos"
                    + "\nSua vida total agora é de 25 pontos!");
        }

    }
    

    public static void salaFogo(){
        System.out.println("Como da ultima vez você entra em uma nova sala totalmente diferente \n"
                + "desta vez você parece estar em um vulkão a lava nas paredes e a temperatura está nas alturas \n"
                + "você se depara com quatro inimigos que parecem ser demonios");
        dmInimigo = 7;
        batalha(20, "Fogo");
        if (vitoria) {
            System.out.println("Recolhe os itens das criaturas\n" +
                                "\n+1 bomba de fogo \n +1 poção de cura de 10 pontos\n" +
                                "Vida total agora é 25, você também encontra uma espada um pouco melhor que a sua atual");
            itens.add("Bomba");
            itens.add("Poção");
            vdjogador = 25;
            dmjogador += 3;
          
            vitoria = false;
        }     
    }
    
    public static void salaGrama(){
        System.out.println("Como da ultima vez você entra em uma nova sala totalmente diferente, "
                + "desta vez você parece estar em uma floresta as paredes são envoltas de arvores, "
                + "e ao longe você ve o sol iluminando o local, você se depara com três inimigos com forma humanoide totalmente feitos de grama ");
        dmInimigo = 9;
        batalha(25, "Grama");
        if (vitoria) {
            System.out.println("Recolhe os itens das criaturas\n" +
                                "uma Bomba Magica e uma poção de cura de 10 pontos\n" +
                                "você também encontra uma bota de aventureiro, vida total agora é 30");
            itens.add("Bomba");
            itens.add("Poção");
            vdjogador = 30;
          
            vitoria = false;
        } 
    }
    
    public static void salaTerra() {
    
        System.out.println("Você entrou na Sala da Terra, nela você enfrentará um "
            + "Golém de Pedra"); 
                    dmInimigo = 12;
                    batalha(20, "Terra"); 
                    
                    if (vitoria) {

                        itens.add("Bomba");
                        itens.add("Poção");
                        vdjogador = 35;
                        vitoria = false; 
                        
                        System.out.println("Você vence a batalha do Golem "
                        + "e recolhe os itens:");
                        System.out.println(" → Uma bomba");
                        System.out.println(" → Uma poção de cura");
                        System.out.println(" → Sua vida agora é 25");
                        
                    } 
    }
    
    public static void salaAr() {


        dmInimigo = 16;
        batalha(20, "Ar");

        if (vitoria) {

            itens.add("Bomba");
            itens.add("Poção");

            vdjogador = 35;

            vitoria = false;

            System.out.println("Você ganhou a batalha e recolheu os itens"
                    + "Uma Bomba"
                    + "Uma poção de cura"
                    + "Sua vida total agora é de 35");
        }

    }
    
     public static void salaFinal() {


        dmInimigo = 18;
        batalha(20, "Ar");

        if (vitoria) {

            itens.add("Bomba");
            itens.add("Poção");

            vdjogador = 40;

            vitoria = false;

            System.out.println("Você ganhou a batalha e recolheu os itens"
                    +" ecebe a recompensa que você desejava\n" +
"dinheiro suficiente para viver uma vida tranquila"
                    + "Uma poção de cura"
                    + "Sua vida total agora é de 45"
            +"você sai da caverna e enquanto você observava a vista em um flash de alguns segundos você não enxerga mais aquela vista mas sim as paredes daquela caverna,\n e rapidamente volta a enxerga aquela vista");
        }

    }
     
    static ArrayList<String> itens = new ArrayList<String>();//Aqui é onde vão ser armazenado todos os itens
    static int dmInimigo;//o dano do inimigo deve ser global por conta dos itens de efeito

    //caracteristicas do jogador
    static int vdjogador = 20;
    static int dmjogador;

    //vitoria 
    static boolean vitoria = false;

    static void batalha(int vdinimigo, String caracInimigo) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int escolha, danoroundjg = 0, danoroundim = 0;
        boolean lutafim = false;
        do {                                         //do while, serve pra manter o loop da batalha se repetindo
            if (vdinimigo <= 0 && vdjogador > 0) {//caso inimigo tenha zerado seus pontos de vida o jogador não encerra a batalha e garante a vitoria
                lutafim = true;
                vitoria = true;
            } else if (vdinimigo >= 0 && vdjogador <= 0) {//caso haja empate ou o jogador tenha menos vida que o inimigo
                lutafim = true;
                vitoria = false;
            } else {
                System.out.println("O que deseja fazer? \n"
                        + "1.Atacar 2.Tentar Fugir 3.Usar Itens \n"); //seleciona uma ação atraves dos numeros
                escolha = input.nextInt();
                switch (escolha) {
                    case 1:                     // caso atacar
                        vdinimigo -= dmjogador; //causa dano ao inimigo
                        danoroundjg = dmjogador;//guarda dano causado para informar jogador
                        break;
                    case 2:                     //caso tentar fugir
                        int sorte = rand.nextInt(10);   //gera o numero da sorte do jogador até 10
                        int chances = rand.nextInt(10); //gera um numero
                        if (sorte > chances) {            //se número da sorte for maior que o outro numero aleatorio encerra a luta e o jogador foje
                            lutafim = true;
                        } else {
                            vdjogador -= dmInimigo - 5; //caso falhe jogador toma um dano adicional
                        }
                        break;
                    case 3:                     //caso use item
                        System.out.println("Escolha seu item:");
                        for (int i = 0; i < itens.size(); i++) {               //lista todos os itens no inventario do jogador
                            System.out.println(i + ". " + itens.get(i));
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
                System.out.println("\n Seu dano: " + danoroundjg);     //informa dano
                System.out.println("\n Dano inimigo: " + danoroundim);

                System.out.println("\n Sua Vida: " + vdjogador);       //informa vida
                System.out.println("\n Vida inimigo: " + vdinimigo);

            }
        } while (!lutafim);
        if (lutafim && vdjogador > 0 && vitoria == false) {
            System.out.println("Fugiu com Sucesso");
        } else if (vitoria) {
            System.out.println("Inimigos Derrotados");
        } else {
            System.out.println("Derrota");
        }
    }

    static int danoItem(String item, String caracInimigo) { //verifica todos os itens e seus efeitos, alguns itens tem efeito diferente dependendo das caracteristicas do inimigo
        if ("Tocha".equals(item)) {             //itens de dano
            if ("Grama".equals(caracInimigo)) {
                return 10;
            } else {
                return 0;
            }
        } else if ("Bomba d'gua".equals(item)) {
            if ("Fogo".equals(caracInimigo)) {
                return 10;
            } else if ("Grama".equals(caracInimigo)) {
                return 0;
            } else {
                return 5;
            }
        } else if ("Bomba".equals(item)) {
            if ("Grama".equals(caracInimigo)) {
                return 15;
            } else {
                return 10;
            }
        } else if ("Bomba Magica".equals(item)) {  //itens de efeito
            System.out.println(dmInimigo);
            dmInimigo = dmInimigo - 5;
            return 0;
        } else if ("Poção".equals(item)) {
            vdjogador += 10;
            return 0;
        } else {
            System.out.println("ERRO");
            return 0;
        }
    }

    public static void main(String[] args) {
        menu();
        Scanner input = new Scanner(System.in);
        System.out.println("Você acorda em frente a duas portas, com uma tocha apagada em sua mão esquerda e uma mochila vazia nos pés."
                + "Qual porta você deseja entrar?"
                + "\n Porta da esquerda = 1 | Porta da direita = 2");

        int escolhaEspada = input.nextInt();
        switch (escolhaEspada) {
            case 1:
                System.out.println("Você entrou na porta da esquerda e encontrou uma espada de aço, afiada e com a empunhadura em couro perfeita para combate. \n+10 Dano de Ataque");
                dmjogador = 10;
                break;
            case 2:
                System.out.println("Você entrou na porta da direita e encontrou uma espada de madeira \n +5 Dano de Ataque");
                dmjogador = 5;
                break;
            default:
                System.out.println("Escolha Invalida");
        }
        System.out.println("Recolhedo a espada que encontrou, em sua frente é possivel ver uma porta entreaberta...\nAproximando-se da porta você sente uma forte brisa. "
                + "Abrindo a porta e passando por ela, Você entra em uma praia. \n");
        // Sala agua  salas() -> Fogo -> Grama -> Terra -> Ar;
        salaAgua();
        System.out.println("Finalizando o combate, O céu começa a escurecer formando um redemoinho de nuvens, O mar começa a ficar vermelho e a ilha começa a expelir lava."
                + "\nVocê procura uma saida ao redor e encontra um portal, Passando por ele você se encontra em um lugar totalmente distorcido, Seria esse o inferno? ");
        System.out.println("Bem vindo a Sala de Fogo: ");
        //sala fogo()
        salaFogo();
        System.out.println("Finalizando a batalha, saindo virotioso, É possivel ver a abertura de um novo portal em sua frente, Passando por ele voce fica dormente..."
                + "\nÉ possivel ouvir o barulho de passaros e folhas, Após levantar você percebe que esta em uma floresta\n");
        //>Grama
        salaGrama();
        System.out.println("Apos derrotar os inimigos, Olhando ao seus arredores é possivel perceber que o terreno começou a mudar, As arvores começaram a virar pedra, "
                + "\nA vegetação começa a secar e todo o cénario muda em um piscar de olhos.\n");
        // sala Terra
        salaTerra();

        System.out.println("Derrotando todos os inimigos você é sugado por um tornado, Acordando em cima das nuvens.\n");
        //Sala Ar
        salaAr();
        System.out.println("Você pisca os olhos, Como da última vez, Você entra em uma nova sala mas dessa vez é diferente, Está sala é idêntica a primeira que você surgiu,\nCom um cavaleiro maior que você e muito intimidador.\n");
        //sala 
        salaFinal();
    }
}

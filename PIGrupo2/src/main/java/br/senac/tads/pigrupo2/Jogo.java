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

        dmInimigo = 10;
        batalha(20, "Agua");
        if (vitoria) {

            itens.add("Bomba d'gua");
            itens.add("Poção");
            vdjogador = 25;

            vitoria = false;

            System.out.println("Você vence a batalha e recolhe os itens dos homens peixes,"
                    + " uma bomba d'água"
                    + "e uma poção de cura de 10 pontos"
                    + "Sua vida total agora é de 25 pontos!");
        }

    }
    

    public static void SalaFogo(){
        System.out.println("Como da ultima vez você entra em uma nova sala totalmente diferente \n"
                + "desta vez você parece estar em um vulkão a lava nas paredes e a temperatura está nas alturas \n"
                + "você se depara com quatro inimigos que parecem ser demonios");
        dmInimigo = 7;
        batalha(20, "Fogo");
        if (vitoria) {
            System.out.println("Recolhe os itens das criaturas\n" +
                                "uma bomba de fogo e uma poção de cura de 10 pontos\n" +
                                "vida total agora é 25, você também encontra uma espada um pouco melhor que a sua atual");
            itens.add("Bomba");
            itens.add("Poção");
            vdjogador = 25;
            dmjogador += 3;
          
            vitoria = false;
        }     
    }
    
    public static void SalaGrama(){
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
    
    public static void SalaTerra() {
        System.out.println("*-- Sala da Terra, deseja prosseguir?" 
                    + " Sim = 1 | Não = 2"); 
    
        System.out.println("Você entrou na Sala da Terra, nela você enfrentará um "
            + "Golém de Pedra"); 
      
           
                    vdjogador = 25;
                    dmInimigo = 12;
                    batalha(20, "Terra"); 
                    
                    if (vitoria) {

                        itens.add("Bomba");
                        itens.add("Poção");
                        vdjogador = 20 + 5;
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


    //*****************************************************************************************************************************************
    //*****************************************************************************************************************************************
    //Salas
    /* public static void salas() {
        boolean salas = false;
        Scanner input = new Scanner(System.in);
        int escolha = 0;
        String caracInimigo = "null";

        do {

            
            System.out.println("*-- Sala Da Praia, deseja prosseguir?" // <-- Alterar para o texto do "diálogo" --
                    + "Sim = 1 | Não = 2 --*");

            switch (escolha) {
                case 1:
                    dmjogador = 10;
                    dmInimigo = 10;
                    batalha(20, "Grama");
                    if (vitoria) {

                        itens.add("Bomba d'gua");
                        itens.add("Poção");
                        vdjogador = 25;

                        vitoria = false;
                    } else {

                        vdjogador = 15;
                        batalha(10, "Grama");

                    }

                    break;
                case 2:
                    System.out.println("Você escolheu sair");
                    break;

            }

            System.out.println("*-- Sala do vulcão, deseja prosseguir?" // <-- Alterar para o texto do "diálogo" --
                    + "Sim = 1 | Não = 2");
            switch (escolha) {

                case 1:

                    vdjogador = 25;
                    dmjogador = 10;
                    dmInimigo = 12;
                    batalha(20, "Fogo");
                    if (vitoria) {

                        itens.add("Bomba ");
                        itens.add("Poção");
                        vdjogador = 30 + 5;

                        vitoria = false;
                    } else {

                        vdjogador = 15;
                        batalha(10, "Fogo");

                    }
                    break;

                case 2:
                    System.out.println("Você escolheu sair");
                    break;
            }

            System.out.println("Sala Da Floresta, deseja prosseguir?" // <-- Alterar para o texto do "diálogo" --
                    + "Sim = 1 | Não = 2");

            switch (escolha) {
                case 1:

                    vdjogador = 35;
                    dmjogador = 10;
                    dmInimigo = 7;
                    batalha(80, "Grama");
                    if (vitoria) {

                        itens.add("Bomba Magica");
                        itens.add("Poção");
                        vdjogador = vdjogador - dmInimigo + 30;

                        vitoria = false;
                    } else {

                        vdjogador = 15;
                        batalha(10, "Grama");

                    }
                    break;
                case 2:
                    System.out.println("Você escolheu sair");
                    break;
            }

            System.out.println("Sala do Cavaleiro, Sala Final, deseja prosseguir?" // <-- Alterar para o texto do "diálogo" --
                    + "Sim = 1 | Não = 2");
            switch (escolha) {
                case 1:

                    vdjogador = 35;
                    dmjogador = 10;
                    dmInimigo = 12;
                    batalha(35, "Grama");
                    if (vitoria) {

                        vdjogador = 35;

                        vitoria = false;
                    } else {

                        vdjogador = 25;
                        batalha(10, "Grama");

                    }
                    break;
                case 2:
                    System.out.println("Você escolheu sair");
                    break;
            }
        } while (!salas);

    }
     */
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

    static void batalha(int vdinimigo, String caracInimigo) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int escolha, danoroundjg = 0, danoroundim = 0;
        boolean lutafim = false;
        do {                                         //do while, serve pra manter o loop da batalha se repetindo
            if (vdinimigo <= 0 && vdjogador > 0) {//caso inimigo tenha zerado seus pontos de vida e jogador não encerra a batalha e garante a vitoria
                lutafim = true;
                vitoria = true;
            } else if (vdinimigo >= 0 && vdjogador <= 0) {//caso haja empate ou o jogador tenha menos vida que o inimigo
                lutafim = true;
                vitoria = false;
            } else {
                System.out.println("o que você vai faze: \n"
                        + "1.Atacar 2.Tentar Fugir 3.Itens"); //seleciona uma ação atraves dos numeros
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
                System.out.println("Você entrou na porta da esquerda e encontrou uma espada de aço, afiada e com a empunhadura em couro perfeita para combate.");
                dmjogador = 10;
                break;
            case 2:
                System.out.println("Você entrou na porta da direita e encontrou uma espada de madeira");
                dmjogador = 5;
                break;
        }
        System.out.println("Ao se levantar e recolher os poucos itens que encontrou,\nOlhando entre a brecha da porta você sente uma forte brisa. "
                + "Abrindo a porta e passando por ela, Você entra em uma praia.");
        // Sala agua  salas() -> Fogo -> Grama -> Terra -> Ar;
        System.out.println("Ao finalizar o combate, o céu começa a escurecer formando um redemoinho de nuvens, a mar começa a ficar vermelho e a ilha começa a expulgar lava."
                + "\n Você vira ao redor e encontra um portal, ao passar por ele você se encontra em um lugar totalmente distorcido, Seria esse o inferno? ");
        System.out.println("Bem vindo a Sala de Fogo: ");
        //sala fogo()
        System.out.println("Finalizandoa  batalha, saindo virotioso é possivel ver a abertura de um novo portal em sua frente, passando por ele voce fica dormente..."
                + "\n É possivel ouvir o barulho de passaros e e folhas, apos levantar você percebe que esta em uma floresta");
        //>Grama
        System.out.println("Apos derrotar os inimigos, olhando ao seus arredores é possivel perceber que o terreno começou a mudar as arvores começaram a virar pedra "
                + "\n e a vegetação começa a secar, todo o cénario muda em um piscar de olhos ");
        // sala Terra

        System.out.println("Derrotando todos os inimigos você é sugado por um tornado, Acordando em cima das nuvens.");
        //Sala Ar

        //sala 
    }
}

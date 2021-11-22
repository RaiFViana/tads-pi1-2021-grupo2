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
            System.out.println("1.Instruções\n2.Jogar\n3.Créditos\n4.Enredo\n5.Sair");

            escolha = input.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("A opção escolhida foi Instruções.");
                    System.out.println("A opção (2)Jogar iniciara o jogo, todos os comandos deverão ser introduzidos por texto quando solicitados.\n"
                            + "A escolha (3)Creditos ira mostrar o nome dos criadores do projeto. \n"
                            + "A escolha (4)Enredo é uma introdução sobre o enredo do jogo.\n"
                            + "E a escolha (5)Sair for selecionada o programa vai se encerrar.\n"
                            + "Itens: \n"
                            + "Tocha: Só é eficaz com seres de grama \n"
                            + "Bomba d'gua: Eficaz com todos os inimigos menos com os seres de grama \n"
                            + "Bomba: Eficaz com todos os inimigos \n"
                            + "Bomba Magica: não causa dano porem diminui o dano dos inimigos em 5 pontos \n");
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
                case 5:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Escolha invalida");
            }
        }
    }

    public static void salaAgua() {
        System.out.println("Você entra em uma sala completamente diferente da anterior dessa vez você está em uma sala com um visual de praia\n"
                + " a sala está iluminada por um sol nos ceus, você visualiza uma porta no fundo da sala e três seres homem peixes\n"
                + " dois estão mito feridos, Você sente uma aura furiosa vindo desses seres então...\n");
        dmInimigo = 4;
        batalha(15, "Agua");
        if (vitoria) {

            itens.add("Bomba d'gua");
            itens.add("Poção");
            vdjogador = 25;

            vitoria = false;

            System.out.println("Você vence a batalha e recolhe os itens dos homens peixes,"
                    +"\n Ítens Adquiridos"
                    + "\n +1 bomba d'água"
                    + "\n +1 poção de cura de 10 pontos"
                    + "\n Sua vida total agora é de 25 pontos! "
                    + "\n");
        }

    }
    

    public static void salaFogo(){
        System.out.println("Finalizando o combate, Você entra em uma nova sala totalmente diferente \n"
                + "desta vez você parece estar em um vulcão, Com lava nas paredes e a temperatura está nas alturas \n"
                + "você se depara com quatro inimigos que parecem ser demonios");
        dmInimigo = 8;
        batalha(20, "Fogo");
        if (vitoria) {
            itens.add("Bomba");
            itens.add("Poção");
            vdjogador = 25;
            dmjogador += 4;
            System.out.println("Recolhe os itens das criaturas\n" +
                                "\n+1 bomba de fogo \n +1 poção de cura de 10 pontos\n" +
                                "você também encontra uma espada um pouco melhor que a sua atual, Dano atual = "+ dmjogador + "\n");
            vitoria = false;
        }     
    }
    
    public static void salaGrama(){
        System.out.println("Finalizando a batalha, saindo virotioso, É possivel ver a abertura de um novo portal em sua frente, Passando por ele voce fica dormente..."
                + "\n É possivel ouvir o barulho de passaros e folhas, Após levantar você percebe que esta em uma floresta, As paredes são arvores\n"
                + "e ao longe ]e possivel ver o sol iluminando o local, você se depara com três inimigos com forma humanoide totalmente feitos de grama ");
        dmInimigo = 12;
        batalha(25, "Grama");
        if (vitoria) {
            System.out.println("Recolhe os itens das criaturas\n" +
                                "uma Bomba Magica e uma poção de cura de 10 pontos\n" +
                                "você também encontra uma bota de aventureiro, vida total agora é 30 \n");
            itens.add("Bomba Magica");
            itens.add("Poção");
            vdjogador = 30;
          
            vitoria = false;
        } 
    }
    
    public static void salaTerra() {
    
        System.out.println("Ao entrar na sala você sente o ar rarefeito, é como se estivesse no topo de uma montanha, na sua frente a um"
            + " Golém de Pedra"); 
                    dmInimigo = 15;
                    batalha(25, "Terra"); 
                    
                    if (vitoria) {

                        itens.add("Bomba");
                        itens.add("Poção");
                        vdjogador = 35;
                        vitoria = false; 
                        
                        System.out.println("Você vence a batalha do Golem "
                        + "e recolhe os itens: ");
                        System.out.println(" → Uma bomba");
                        System.out.println(" → Uma poção de cura");
                        System.out.println(" → Sua vida agora é 35");
                        
                    } 
    }
    
    public static void salaAr() {

        System.out.println("O vento forte bate no seu rosto, A sua frente um criatura que se parece com um pássaro,"
                 + " Muito grande e com um corpo que parece ser feito por tornados \n");
        dmInimigo = 16;
        batalha(30, "Ar");

        if (vitoria) {

            itens.add("Bomba");
            itens.add("Bomba Magica");
            itens.add("Poção");

            vdjogador = 40;

            vitoria = false;

            System.out.println("Você ganhou a batalha e recolheu os itens \n"
                    + "Uma Bomba \n"
                    + "Uma poção de cura \n"
                    + "Sua vida total agora é de 40 \n");
        }

    }
    
     public static void salaFinal() {

         System.out.println("você sente que essa é a sua ultima batalha\n" +
                            "e que para alcançar seu objetivo \n" +
                            "tem que derotar esse inimigo");
        dmInimigo = 18;
        batalha(40, "Humano");

        if (vitoria) {

            itens.add("Bomba");
            itens.add("Poção");

            vdjogador = 45;

            vitoria = false;

            System.out.println("Você ganhou a batalha e recolheu os itens"
                    +" Recebe a recompensa que você desejava\n" +
                    " Dinheiro suficiente para viver uma vida tranquila\n"
                    + "Uma poção de cura\n"
                    + "Sua vida total agora é de 45\n"
            +"Saindo da caverna e enquanto você observa a vista, Em um flash de alguns segundos você não enxerga os inimigos que derrotou na caverna,\n E rapidamente volta a enxerga a vista normalmente.");
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
                System.out.println("\nO que deseja fazer? \n"
                        + "1.Atacar 2.Tentar Fugir 3.Usar Itens \n"); //seleciona uma ação atraves dos numeros
                escolha = input.nextInt();
                switch (escolha) {
                    case 1:                     // caso atacar
                        vdinimigo -= dmjogador; //causa dano ao inimigo
                        danoroundjg = dmjogador;//guarda dano causado para informar jogador
                        
                        if(vdinimigo <= 0){
                            danoroundim = 0;
                        }else{
                            danoroundim = dmInimigo;
                            vdjogador -= dmInimigo;                             //causa dano do inimigo para o jogador
                        }
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
                        System.out.println("99. Voltar");
                        for (int i = 0; i < itens.size(); i++) {               //lista todos os itens no inventario do jogador
                            System.out.println(i + ". " + itens.get(i));
                        }                       
                        int resposta = input.nextInt();                 //recebe o item escolhido
                        if(resposta == 99){
                            danoroundjg = 0;
                            danoroundim = 0;
                        }else{
                            int dano = danoItem(itens.get(resposta), caracInimigo);  //procura o item no metodo dos itens caso seja um item de efeito e retorna 0 de dano
                            vdinimigo -= dano;
                            danoroundjg = dano;

                            if(vdinimigo <= 0){
                                danoroundim = 0;
                            }else{
                                danoroundim = dmInimigo;
                                vdjogador -= dmInimigo;                             //causa dano do inimigo para o jogador
                            }
                        }
                    default:
                        System.out.println("Selecione uma opção valida");
                        break;
                }
                
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
            System.exit(0);
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
            for(int i = 0; i < itens.size(); i++){
                if(itens.get(i).equals("Bomba d'gua")){
                    itens.remove(i);
                    break;
                }
            }
            if ("Fogo".equals(caracInimigo)) {
                return 15;
            } else if ("Grama".equals(caracInimigo)) {
                return 0;
            } else {
                return 10;
            }
        } else if ("Bomba".equals(item)) {
            for(int i = 0; i < itens.size(); i++){
                if(itens.get(i).equals("Bomba")){
                    itens.remove(i);
                    break;
                }
            }
            if ("Grama".equals(caracInimigo)) {
                return 17;
            } else {
                return 15;
            }
        } else if ("Bomba Magica".equals(item)) {  //itens de efeito
            for(int i = 0; i < itens.size(); i++){
                if(itens.get(i).equals("Bomba Magica")){
                    itens.remove(i);
                    break;
                }
            }
            dmInimigo = dmInimigo - 5;
            return 0;
        } else if ("Poção".equals(item)) {
            for(int i = 0; i < itens.size(); i++){
                if(itens.get(i).equals("Poção")){
                    itens.remove(i);
                    break;
                }
            }
            vdjogador += 10;
            return 0;
        } else {
            System.out.println("ERRO");
            return 0;
        }
    }

    public static void main(String[] args) {
        boolean escolhaValida = true;
        menu();
        Scanner input = new Scanner(System.in);
        while(escolhaValida == true){
            System.out.println("Você acorda em frente a duas portas, com uma tocha apagada em sua mão esquerda e uma mochila vazia nos pés."
                    + "Qual porta você deseja entrar?"
                    + "\n Porta da esquerda = 1 | Porta da direita = 2");

            int escolhaEspada = input.nextInt();
        
            switch (escolhaEspada) {
                case 1:
                    System.out.println("Você entrou na porta da esquerda e encontrou uma espada de aço, afiada e com a empunhadura em couro perfeita para combate. \n+8 Dano de Ataque \n");
                    dmjogador = 8;
                    itens.add("Tocha");
                    escolhaValida = false;
                    break;
                case 2:
                    System.out.println("Você entrou na porta da direita e encontrou uma espada de madeira \n +5 Dano de Ataque \n");
                    dmjogador = 5;
                    itens.add("Tocha");
                    escolhaValida = false;
                    break;
                default:
                    System.out.println("Escolha Invalida");
            }
        }
        System.out.println("Recolhedo a espada que encontrou, em sua frente é possivel ver uma porta entreaberta...\nAproximando-se da porta você sente uma forte brisa. "
                + "Abrindo a porta e passando por ela... \n");
        // Sala agua  salas() -> Fogo -> Grama -> Terra -> Ar;
        salaAgua();
        //sala fogo()
        salaFogo();
        //>Grama
        salaGrama();
        System.out.println("Apos derrotar os inimigos, Olhando ao seus arredores é possivel perceber que o terreno começou a mudar, As arvores começaram a virar pedra, "
                + "\nA vegetação começa a secar e todo o cénario muda em um piscar de olhos.");
        // sala Terra
        salaTerra();

        System.out.println("Derrotando todos os inimigos você é sugado por um tornado, Acordando em cima das nuvens.\n");
        //Sala Ar
        salaAr();
        System.out.println("Você pisca os olhos, Como da última vez, Você entra em uma nova sala mas dessa vez é diferente, Está sala é idêntica a primeira que você surgiu,\nCom um cavaleiro maior que você e muito intimidador.\n");
        //sala 
        salaFinal();
        
        System.out.println("Obrigado por jogar nosso Jogo");
    }
}

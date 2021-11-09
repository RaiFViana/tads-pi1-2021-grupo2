/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pigrupo2;

import java.util.Scanner;

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
            
    public static void main(String[] args) {
        menu();
        System.out.println("Teste ok");
    }
}

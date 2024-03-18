/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex06;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Desenvolva um programa que exibe um cardápio de uma 
        lanchonete com pelo menos 5 opções de lanche. O usuário 
        deve escolher uma opção digitando o número correspondente. 
        O programa então mostra o preço do item selecionado.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha uma opção:");
        System.out.println("1. Hambúrguer - R$10,00");
        System.out.println("2. Cheeseburger - R$12,00");
        System.out.println("3. Batata frita - R$5,00");
        System.out.println("4. Refrigerante - R$4,00");
        System.out.println("5. Milkshake - R$6,00");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu Hambúrguer. Valor a pagar: R$10,00");
                break;
            case 2:
                System.out.println("Você escolheu Cheeseburger. Valor a pagar: R$12,00");
                break;
            case 3:
                System.out.println("Você escolheu Batata frita. Valor a pagar: R$5,00");
                break;
            case 4:
                System.out.println("Você escolheu Refrigerante. Valor a pagar: R$4,00");
                break;
            case 5:
                System.out.println("Você escolheu Milkshake. Valor a pagar: R$6,00");
                break;
            default:
                System.out.println("Opção inválida.");
        }

    }

}

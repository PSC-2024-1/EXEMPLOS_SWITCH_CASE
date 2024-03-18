/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex02;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crie um programa que lê um número inteiro (de 1 a 7) 
        e mostra o dia da semana correspondente, onde 1 é Domingo,
        2 é Segunda-feira, e assim por diante. Se o número estiver
        fora do intervalo, exiba uma mensagem de erro.*/
         Scanner input = new Scanner(System.in);
        System.out.println("Informe um número de 1 a 7:");
        int dia = input.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido. Por favor, informe um número de 1 a 7.");
        }
    }
    
}

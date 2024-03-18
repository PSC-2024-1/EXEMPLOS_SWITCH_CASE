/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex04;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva um programa que pede ao usuário para inserir um
        mês (como um número de 1 a 12). O programa deve imprimir 
        a estação do ano correspondente ao mês no hemisfério sul 
        (por exemplo, Dezembro até Fevereiro = Verão).*/
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o número do mês (1 a 12):");
        int mes = input.nextInt();

        switch (mes) {
            case 12:
            case 1:
            case 2:
                System.out.println("Verão");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Outono");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Inverno");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Primavera");
                break;
            default:
                System.out.println("Número inválido.");
        }
    }

}

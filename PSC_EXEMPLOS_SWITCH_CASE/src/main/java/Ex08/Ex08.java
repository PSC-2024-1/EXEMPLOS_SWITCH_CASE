/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex08;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva um algoritmo que leia dois valores: o primeiro 
        servindo de indicador de operação e o segundo correspondendo 
        ao raio de um círculo ou esfera. Caso o primeiro valor lido 
        seja:
        1: calcular e imprimir o perímetro do círculo.
        2: calcular e imprimir a área do círculo.
        3: calcular e imprimir o volume da esfera.
        Se o primeiro valor lido for diferente desses três valores
        possíveis, imprimir uma mensagem de erro, informando que o
        código da operação é inválido.*/
        Scanner input = new Scanner(System.in);

        System.out.println("::::::::::::::::::::::::::::::::::::::");
        System.out.println("::::::::::::::OPERAÇÕES:::::::::::::::");
        System.out.println("::::::::::::::::::::::::::::::::::::::");
        System.out.println("""
                           [1] Calcular perímetro
                           [2] Calcular área do círculo
                           [3] Calcular volume da esfera
                """);
        System.out.println("Digite o código da operação (1, 2 ou 3):");
        int operacao = input.nextInt();

        System.out.println("Digite o raio:");
        double raio = input.nextDouble();

        switch (operacao) {
            case 1: // Perímetro do círculo
                System.out.println("Perímetro do círculo: " + (2 * Math.PI * raio));
                break;
            case 2: // Área do círculo
                System.out.println("Área do círculo: " + (Math.PI * Math.pow(raio,2)));
                break;
            case 3: // Volume da esfera
                System.out.println("Volume da esfera: " + ((4 / 3) * Math.PI * Math.pow(raio, 3)));
                break;
            default:
                System.out.println("Código da operação é inválido.");
        }
    }

}

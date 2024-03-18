/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex05;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crie um programa que lê três valores inteiros 
    representando os lados de um triângulo e usa um switch-case
    para classificar o triângulo como Equilátero, Isósceles ou 
    Escaleno.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Informe os três lados do triângulo:");
        int lado1 = input.nextInt();
        int lado2 = input.nextInt();
        int lado3 = input.nextInt();

        // Contando os lados iguais
        int ladosIguais = 0;

        if (lado1 == lado2) {
            ladosIguais++;
        }
        if (lado1 == lado3) {
            ladosIguais++;
        }
        if (lado2 == lado3) {
            ladosIguais++;
        }

        // triângulo equilátero: 2 lados iguais
        if (ladosIguais == 1) {
            ladosIguais++;
        }

        switch (ladosIguais) {
            case 3: 
                System.out.println("Equilátero");
                break;
            case 1: 
                System.out.println("Isósceles");
                break;
            case 0: 
                System.out.println("Escaleno");
                break;
            default:
                System.out.println("Não é um triângulo válido.");
        }
    }

}

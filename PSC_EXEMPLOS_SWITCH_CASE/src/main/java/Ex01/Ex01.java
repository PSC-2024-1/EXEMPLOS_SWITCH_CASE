/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ex01;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex01 {

    public static void main(String[] args) {
        /*Escreva um programa que simula uma calculadora simples
        capaz de realizar operações básicas: soma, subtração, 
        multiplicação e divisão. O usuário deve escolher a 
        operação desejada digitando o operador correspondente 
        (+, -, *, /) e, em seguida, inserir dois números.*/
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha a operação (+, -, *, /):");
        char operacao = input.next().charAt(0);

        System.out.println("Digite o primeiro número:");
        double num1 = input.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = input.nextDouble();

        switch (operacao) {
            case '+':
                System.out.printf("Resultado: %.2f\n", num1 + num2);
                break;
            case '-':
                System.out.printf("Resultado: %.2f\n", num1 - num2);
                break;
            case '*':
                System.out.printf("Resultado: %.2f\n", num1 * num2);
                break;
            case '/':
                if (num2 != 0) {
                    System.out.printf("Resultado: %.2f\n", num1 / num2);
                } else {
                    System.out.println("Divisão por zero não permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }
    }
}

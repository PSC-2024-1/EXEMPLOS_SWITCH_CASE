/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex07;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva um programa que simula o cálculo da conta de telefone
        baseado no plano de minutos do usuário. O usuário deve digitar o 
        código do plano (1, 2, 3, 4) e a quantidade de minutos usados 
        no mês. Cada plano tem uma tarifa diferente por minuto excedente.*/
        Scanner input = new Scanner(System.in);
        double valorConta;

        System.out.println("::::::::::::::::::::::::::::::::::");
        System.out.println("Plano de Telefonia");
        System.out.println("::::::::::::::::::::::::::::::::::");
        System.out.println("""
                           [1] R$ 39.90 - 100 minutos inclusos.
                           [2] R$ 49.90 - 200 minutos inclusos.
                           [3] R$ 59.90 - 300 minutos inclusos.
                           [4] R$ 69.90 - ilimitado.""");
        System.out.println("Informe o código do plano (1, 2, 3 ou 4):");
        int plano = input.nextInt();
        System.out.println("Informe o total de minutos usados no mês:");
        int minutos = input.nextInt();

        switch (plano) {
            case 1:
                valorConta = (minutos > 100) ? ((minutos - 100) * 0.50) + 39.90 : 39.90;
                break;
            case 2:
                valorConta = (minutos > 200) ? ((minutos - 200) * 0.45) + 49.90 : 49.90;
                break;
            case 3:
                valorConta = (minutos > 300) ? ((minutos - 300) * 0.40) + 59.90 : 59.90;
                break;
            case 4:
                valorConta = 69.9; 
                break;
            default:
                System.out.println("Código de plano inválido.");
                return;
        }

        System.out.printf("Valor a ser pago: R$ %.2f\n", valorConta);
    }

}

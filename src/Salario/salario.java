/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salario;

import java.util.Scanner;

/**
 *
 * @author Ana
 */
public class salario {
    /**Escreva um programa que leia o número de um funcionário, seu número 
     * de horas trabalhadas, o valor que recebe por hora e calcula o salário
     * desse funcionário. A seguir, mostre o número e o salário do funcionário,
     * com duas casas decimais.*/
   
    
 Scanner entrada = new Scanner(System.in);
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        double C = entrada.nextDouble();
        double salario = (B*C);
        System.out.printf("NUMBER = %d\n",A);
        System.out.printf("SALARY = U$ %.2f\n",salario);
    
}

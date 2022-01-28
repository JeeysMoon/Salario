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
public class Com_bonus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        double salario = entrada.nextDouble();
        double bonus = entrada.nextDouble();
        double salariobonus = (salario+(bonus*0.15));
        System.out.printf("TOTAL = R$ %.2f\n",salariobonus);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafiogupy;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class DesafioGupy {

    public static void main(String[] args) {
        int valor;
        Scanner ler = new Scanner(System.in);
        
        Fibonacci fibo = new Fibonacci();
        
        System.out.println("Informe um número inteiro");
        valor = ler.nextInt();
       
        System.out.println("--------------------------");
        fibo.calcular();
        System.out.println("--------------------------");
        fibo.verificar(valor);
        
        
        String palavra;
        System.out.println("Informe a palavra que deseja inverter");
        palavra = ler.next();
        
        StringReversa stg = new StringReversa();
        
        stg.inverter(palavra);
        
    }
    
    
}

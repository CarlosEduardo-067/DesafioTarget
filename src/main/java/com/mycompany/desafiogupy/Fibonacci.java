/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiogupy;


/**
 *
 * @author carlo
 */
public class Fibonacci {
    int ant = 0, prox = 1;
    int aux;
    int flag;
    
    public void calcular(){
        for (int i = 0; i < 30; i++) {
            if(flag == 0){
                System.out.println(ant);
                System.out.println(prox);
                flag = 1;
            }else{
                aux = ant + prox;
                ant = prox;
                prox = aux;
                System.out.println(aux);
                flag = 1;
            }
        }
    }
    
    public void verificar(int valor){
        int a = 0;
        int b = 1;
        while (a <= valor) {
            if (a == valor) {
                System.out.println("O número " + valor + " pertence à sequência de Fibonacci.");
                return;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }
        System.out.println("O número " + valor + " não pertence à sequência de Fibonacci.");
    }
}

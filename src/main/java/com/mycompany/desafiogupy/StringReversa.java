/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiogupy;

/**
 *
 * @author carlo
 */
public class StringReversa {
            
    public void inverter(String palavra){
        StringBuilder inversa = new StringBuilder();
        for (int i = palavra.length() - 1; i >= 0; i--) {
            inversa.append(palavra.toCharArray()[i]);
        }
        System.out.printf("Palavra invertida: %s\n", inversa);
    }

}

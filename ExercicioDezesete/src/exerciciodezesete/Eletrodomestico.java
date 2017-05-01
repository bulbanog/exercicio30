/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciodezesete;

/**
 *
 * @author Rayssa&Thiago
 */
public class Eletrodomestico {
    boolean ligado;

    public Eletrodomestico( boolean ligado) {
        this.ligado = ligado;
        
    }

    void ligar() {
        if (ligado == false) {
            ligado = true;
        }
        
    }

    void desligar() {
        if (ligado == true) {
            ligado = false;
        }
        
    }

    void imprimir() {
        System.out.println("Atributos do Eletrodomestico:\n Ele está:"+this.ligado);
        
        
    }

}
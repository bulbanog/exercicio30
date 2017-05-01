/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioquintoseis;

/**
 *
 * @author Rayssa&Thiago
 */
public class ClasseRetangulo {
    float comprimento;
    float largura;
    float area;
    float perimetro;
    
    public ClasseRetangulo(float largura, float comprimento){
        this.comprimento=comprimento;
        this.largura=largura;
    }
    
    void calcularArea(){
        this.area=this.comprimento*this.largura;    
    }
    void calcularPerimetro(){
        this.perimetro=2*this.comprimento;
    }
    void imprimir(){
        System.out.println("Atributos do retângulo: \n A área mede: "+this.area+"O perímetro mede:" +this.perimetro);
    }
        
    }
       
    


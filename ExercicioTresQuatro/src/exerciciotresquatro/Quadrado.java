/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciotresquatro;

/**
 *
 * @author Rayssa&Thiago
 */
public class Quadrado {
    double lado;
    double area;
    double perimetro; 
    
    public Quadrado(double lado){
    this.lado= lado;
    
    
    }

    void calcularArea (){
        this.area=this.lado*this.lado; 
                
        
    }void calcularPerimetro(){
        this.perimetro=4*this.lado;
        
    }void imprimir(){
        System.out.println("Atributos do Quadrado: Area:" +area+  "Perímetro: "+perimetro); 
        
    }
         

    
   
            
   

}
    



package exercicioseteoito;


public class Circulo {
    double raio;
    double area;
    double perimetro; 
    
    public Circulo(double raio){
        this.raio=raio;
        
    }
    void CalcularArea(){
        this.area= 3.14*raio*raio;
    }
    void CalcularPerimetro(){
        this.perimetro=2*3.14*this.raio;
    }    
    void imprimir(){    
        System.out.println("Atributos do círculo \n A área mede:" +this.area+ "O perímetro mede:"+this.perimetro );
    }
        
                 
            
    
}

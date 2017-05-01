
package exercicionoveadezenove;


public class Moto {
    String marca;
    String modelo;
    String cor; 
    int marcha;
    int menormarcha=0;
    int maiormarcha=5;
    boolean ligada;
    
    public Moto(String marca, String modelo, String cor, int marcha,boolean ligada){
        this.marca=marca;
        this.modelo= modelo;
        this.cor=cor;
        this.marcha=marcha;
        this.ligada=ligada;
       
    }
    void marchaAbaixo(){
        if(this.marcha<=maiormarcha){
            this.marcha--;
        }   
    }
    void marchaAcima(){
        if(this.marcha>menormarcha){
            this.marcha++;
        }
    }
    void menorMarcha() {
        if (marcha <= 0) {
            System.out.println("Atenção, marcha mínima!");
        }

    }
    void maiorMarcha() {
        if (marcha >= 4) {
            System.out.println("Atenção, marcha máxima!");
        }

    }
    void ligar() {
        if (this.ligada == false) {
            this.ligada = true;
        }
        
    }

    void desligar() {
        if (this.ligada == true) {
            this.ligada = false;
        }
        
    }
            
    
       
    void imprimir(){
        System.out.println("Atributos da moto\n  Marca: "+this.marca+ "Modelo: " +this.modelo+ "Cor: "+cor+" Menor marcha:"+this.menormarcha+" Maior marcha:"+this.maiormarcha+" Marcha: "+this.marcha+" Moto ligada: "+this.ligada);
    }  
            
    
    
  }

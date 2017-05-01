
package exerciciofinal;


public class Microondas {
    boolean ligado;
    boolean portaFechada;
    
    
    public Microondas(boolean ligado, boolean portaFechada){
        this.ligado=ligado;
        this.portaFechada=portaFechada;
    }
    void ligar(){
        if (this.ligado == true) {
            this.ligado = false;
        }    
    }
    void desligar(){
        if (this.ligado == false) {
            this.ligado = true;
        }   
    }
    void fecharPorta(){
        if (this.portaFechada == true) {
            this.portaFechada = false;
        }    
        
    }
    void abrirPorta(){
        if (this.portaFechada == false) {
            this.portaFechada = true;
        }    
    }
        
        
     
        
    
    void imprimir(){
        System.out.println("O microondas está: " +this.ligado+" Aporta está: "+this.portaFechada );
    }
    
    
    
    
    
}

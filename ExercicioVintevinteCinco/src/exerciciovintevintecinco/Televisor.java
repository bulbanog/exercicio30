
package exerciciovintevintecinco;

public class Televisor {
    boolean ligado;
    int canal;
    int volume;
    int volumeMaximo;
    int numeroCanais;
    
    
    public Televisor(boolean ligado, int canal, int volume,int volumeMaximo,int numeroCanais){
        this.ligado=ligado;
        this.canal=canal;
        this.volume=volume;
        this.volumeMaximo=volumeMaximo;
        this.numeroCanais=numeroCanais;
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
   void canalAcima(){
        if (this.ligado == true){
            this.canal ++;
            if(this.canal==this.numeroCanais+1){
                this.canal = 1;
            }
        }
    }
    void canalAbaixo(){
        if(this.ligado == true){
            this.canal --;
            if(this.canal==0){
                this.canal=this.numeroCanais;
            }
        }
    }
    void volumeAcima(){
        if(this.ligado == true && this.volume<this.volumeMaximo && this.volume>0){
            this.volume ++;
        }
    }
    void volumeAbaixo(){
        if(this.ligado==true && this.volume>=0 && this.volume<=this.volumeMaximo){
            this.volume --;
        }
    }
    void imprimir(){
        System.out.println("Atributos televisor:\n A Tv está:" +this.ligado+" Canal:"+this.canal+" Numeros de canais: "+numeroCanais+" Volume Máximo: "+volumeMaximo+" Volume: "+volume);
    }   
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

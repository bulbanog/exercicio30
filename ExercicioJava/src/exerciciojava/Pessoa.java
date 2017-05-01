
package exerciciojava;


public class Pessoa {
    String nome;
    String endereco;
    String telefone; 
    
    Pessoa(String nome,String endereco,String telefone) {
        this.nome=nome;
        this.endereco=endereco;
        this.telefone=telefone; 
       }
    void imprimir(){
        System.out.println("Nome: "+this.nome+ "Endereço: "+ this.endereco+ "Telefone: "+this.telefone);
    }
      

    
           
   }

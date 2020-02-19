/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lab
 */
public class Carro {
    String placa;
    double progresso;
    String modelo;
    
    
    Carro () {
        placa = null;
        progresso = 0;
        modelo = null;
        
        
    }
    Carro (String aPlaca,double aProgresso, String aModelo) {
        this.placa = aPlaca;
        this.progresso = aProgresso;
        this.modelo = aModelo;
        }
      void display(){
          System.out.println("Carro: ");
          System.out.println("Placa: "+this.placa);
          System.out.println("Progresso: "+this.progresso);
          System.out.println("Modelo: "+this.modelo);
    }
    
}


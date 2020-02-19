/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lab
 */
public class FichaOficina {
    Cliente cliente;
    int identificador;
    String problema;

FichaOficina() {
    cliente = null;
    identificador = 0;
    problema = null;
}
    
FichaOficina (Cliente aCliente, int aIdentificador) {
   this.cliente = aCliente;
   this.identificador = aIdentificador;
}
   void display (){
       System.out.println("Ficha da Oficina: ");
       System.out.println("Cliente: "+this.cliente);
       System.out.println("Identificador: "+this.identificador);
    
}
}


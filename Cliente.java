/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lab
 */
public class Cliente {
  String nome;
  String CPF;
  String telefone;
  Carro carro;  

Cliente(){
    nome = null;
    CPF = null;
    telefone = null;
    carro = null;
}
    Cliente(String aNome, String aCPF, String aTelefone, Carro aCarro){
        this.nome = aNome;
        this.CPF = aCPF;
        this.telefone = aTelefone;
        this.carro = aCarro;
    
}
    void display(){
        System.out.println("Cliente: ");
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.CPF);
        System.out.println("Telefone: "+this.telefone);
        System.out.println("Carro: "+this.carro);
}
}

 



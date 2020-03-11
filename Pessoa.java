/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lab
 */
public class Pessoa {
    int id;
    String nome;
    String telefone;
    String endereco;
    
    Pessoa (int aId, String aNome, String aTelefone, String aEndereco){
    this.id = aId;
    this.nome = aNome;
    this.telefone = aTelefone;
    this.endereco =  aEndereco;
    
    }
    public void display(){
        System.out.println("ID: "+this.id);
        System.out.println("Nome: "+this.nome);
        System.out.println("Telefone: "+this.telefone);
        System.out.println("Endereco: "+this.endereco);
    }
            
    
    
}

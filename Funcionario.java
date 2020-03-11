/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lab
 */
public class Funcionario extends Pessoa {
    double salario;
    
    public Funcionario(int aId, String aNome, String aTelefone, String aEndereco, double aSalario) {
        super(aId, aNome, aTelefone, aEndereco);
        this.salario = aSalario; 
        
        
    }
    @Override
    public void display () {
        System.out.println("Salario: "+this.salario);
    }
   
}

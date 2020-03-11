/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lab
 */
public class Professor extends Funcionario {
    int horaAula;
    
    public Professor(int aId, String aNome, String aTelefone, String aEndereco, double aSalario, int aHoraAula ) {
        super(aId, aNome, aTelefone, aEndereco, aSalario);
        this.horaAula = aHoraAula;
    }
    @Override
    public void display (){
        System.out.println("A hora aula: "+this.horaAula);
    }
    
}

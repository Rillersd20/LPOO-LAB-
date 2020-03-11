/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lab
 */
public class Coordenador extends Funcionario {
    double bonus;

    public Coordenador(int aId, String aNome, String aTelefone, String aEndereco, double aSalario, double aBonus) {
        super(aId, aNome, aTelefone, aEndereco, aSalario);
        this.bonus = aBonus;
        
    }
}

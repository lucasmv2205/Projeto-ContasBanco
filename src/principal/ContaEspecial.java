/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Lucas Martins
 */
public class ContaEspecial extends Conta {
    private int limite;
    
    public ContaEspecial(String numero, int limite) {
        super(numero);
        this.limite = limite;
    }
    
    public void setlimite(int limite){
        this.limite = limite;
    }
    
    public int getlimite(){
        return limite;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\r\nLímite: " + limite;
    }
    
}

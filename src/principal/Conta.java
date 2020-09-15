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
public class Conta {
    private String numero;
    private Double saldo;
    
    public Conta(String numero){
        this.numero = numero;
        this.saldo = 0.0;
    }
    
    public void deposita(Double valor){
        saldo = saldo + valor;
    }
    
    
    public void saque(Double valor){
        if(valor < saldo){
            saldo = saldo - valor;
        }
    }
    
    @Override
    public String toString(){
        return "numero: " + numero+": " + "saldo atual: R$" + saldo;
    }
    
    public void setnumero(String numero){
        this.numero = numero;
    }
    
    public String getnumero(){
        return numero;
    }
    
    public Double getsaldo(){
        return saldo;
    }
    
}

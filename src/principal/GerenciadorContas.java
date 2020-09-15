/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;

/**
 *
 * @author Lucas Martins
 */
public class GerenciadorContas {
    ArrayList <Conta> listaContas = new ArrayList();
    
    public void adicionarConta(String numero){
        Conta a;
        a = new Conta(numero);
        listaContas.add(a);
    }
    
    public void adicionarConta(String numero, int limite){
        ContaEspecial a;
        a = new ContaEspecial(numero, limite);
        listaContas.add(a);
    }
    
    public Conta pesquisarConta (String numero){
        for(Conta p: listaContas){
            if(p.getnumero() == numero){
                return p;
            }
        }
        return null;
        
    }
    
    public void contasRicas (){
        for(Conta p: listaContas){
            if(p.getsaldo() > 10000){
                System.out.println(p.getnumero());
            }
        }
    }
    
}

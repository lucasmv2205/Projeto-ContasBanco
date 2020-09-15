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
public class Principal {
    public static GerenciadorContas gc = new GerenciadorContas();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        gc.adicionarConta("100");
        gc.adicionarConta("101");
        gc.adicionarConta("102", 15000);
        gc.adicionarConta("103", 20000);
        
        System.out.println(gc.listaContas+"\r\n");
        
        for(int i = 0; i < 4; i++){
            gc.listaContas.get(i).deposita(4000.0 * i + 500.0);
        }
        
        //for(int i = 1; i < 4; i++){
            //gc.listaContas.get(i).deposita(4000.0 * (i+1) + 500.0);
        //}
        
        System.out.println("\r\n"+gc.listaContas);
        
        
        
        gc.pesquisarConta("100").saque(150.0);
        gc.pesquisarConta("101").saque(150.0);
        gc.pesquisarConta("102").saque(150.0);
        gc.pesquisarConta("103").saque(150.0);
        
        for(int i = 0; i < 4; i++){
            System.out.println("\r\n"+"numero da conta "+gc.listaContas.get(i).getnumero());
            System.out.println("Saldo da conta "+gc.listaContas.get(i).getsaldo()+"\r\n");
        }
        
        System.out.println("\r\n"+"número das contas ricas");
        gc.contasRicas();

        
    }
}

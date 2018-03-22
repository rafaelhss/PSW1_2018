/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoes;

import auxiliares.Imposto;
import auxiliares.Benficio;
import java.util.Date;

/**
 *
 * @author Rafael.Soares
 */
public class Funcoes {
    
    /**
     * @param args the command line arguments
     */



    
    public static void main(String[] args) {
        
        float salario = 3000;
        float vale = Benficio.valeAlimentacao();

        float salarioLiquido = Imposto.descontarImpostoR(vale);
        
        //float teste = 3000 * Imposto.aliquota;
        
        float salarioTotal = salarioLiquido + vale + Imposto.vale ;
        
        System.out.println("O salario liquido eh:" + salarioTotal);
        System.out.println("O vale eh: " + Benficio.valeAlimentacao());


    }
    
    public static void processar(){
        saudar();
        hora();
        saudar();
    }
    public static void saudar(){
        System.out.println("Boa noite");
        System.out.println("Sejam muito bem vindos");
        System.out.println("essa eh a aula de linguagem");
    }
    
    public static void hora(){
        Date agora  = new Date();
        System.out.println("Agora sao: " + agora);
    }
    
    
}

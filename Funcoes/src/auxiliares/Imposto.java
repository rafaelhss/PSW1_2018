/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliares;

/**
 *
 * @author rafael.soares
 */
public class Imposto {
    
    private static float limiteIsencao = 2500;
    private static float aliquota = 0.75F;
    public static float vale = 0.75F;
    
    
    
    public static float descontarImpostoR(float valor){
        if(valor < limiteIsencao){
            return valor;
        }
        else {
            return valor * aliquota;
        }
    }
        
    private static float calculoINSS(){
        
        return 0.25F * Benficio.valeAlimentacao() + descontarImpostoR(299);
    }    
        
}

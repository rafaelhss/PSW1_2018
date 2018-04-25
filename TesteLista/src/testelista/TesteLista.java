/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testelista;

import java.util.ArrayList;

/**
 *
 * @author Rafael.Soares
 */
public class TesteLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> vegetais = new ArrayList<>();
        
        vegetais.add("Batata");
        vegetais.add("Banana");
        vegetais.add("Beterraba");
        vegetais.add("Beringela");
        
        System.out.println("Tamanho da lista: " + vegetais.size());
        
        int c = 0;
        while (c < vegetais.size()){
            System.out.println("Vegetal: " + vegetais.get(c));
            c = c + 1;
        }
        System.out.println("-----");
        for(int i=0; i < vegetais.size(); i++) {
           System.out.println("Vegetal: " + vegetais.get(i));  
        }
        System.out.println("-----");
        for(String vegetal : vegetais){
            System.out.println("Vegetal: " + vegetal);  
        }
        
        System.out.println("-----");
        
        vegetais.add("Brocolis");
        
        for(String vegetal : vegetais){
            System.out.println("Vegetal: " + vegetal);  
        }
        System.out.println("-----");
        
        vegetais.remove(2);
        
        for(String vegetal : vegetais){
            System.out.println("Vegetal: " + vegetal);  
        }
        System.out.println("-----");
        
    }
    
}

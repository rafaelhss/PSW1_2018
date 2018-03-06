/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo2;

/**
 *
 * @author Rafael.Soares
 */
public class Config {
    public static Pagina getPagina(String path){
        if(path.equals("batata")){
            return new PaginaBatata();                           
        } 
        if(path.equals("banana")){
            return  new PaginaBanana();
        }
        if(path.equals("abacate")){
            return new PaginaAbacate();
        }
        
        if(path.equals("beterraba")){
            return new PaginaBeterraba();
        }
        return null;
    }
}

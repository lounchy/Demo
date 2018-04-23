/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callingwokermethod;

/**
 *
 * @author PC
 */
public class ClaseConDosMetodos {
    public void calcula(){
        int x = 4, y = 5;
        int z = multiplicacion(x, y);
        System.out.println(x + " X " + y + " es igual a " + z );
    }
    
    //Working method
    public int multiplicacion(int nr1, int nr2){
        int regreso;
        regreso = nr1 * nr2;
        return regreso;
        
    }
    
}

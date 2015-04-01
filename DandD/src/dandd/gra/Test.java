/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dandd.gra;

import static dandd.gra.Gra.gra;

/**
 *
 * @author Grzechu
 */
public class Test {
    
    public static void main(String[] args)
    {
        String mapa = "4;3;0;1;2;0;1;2;0;1;2;0;1;2;";
        String pionki = "Bronco;20;10;3;10;2;4;1;!;Bronco;20;10;3;10;2;4;1;!;[K]Krool;20;10;3;10;2;4;1;!;[K]Krool;20;10;3;10;2;4;1;!;";
        
        gra(mapa, pionki);
        
    }
}

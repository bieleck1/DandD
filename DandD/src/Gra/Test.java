/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gra;

import static Gra.Gra.gra;

/**
 *
 * @author Grzechu
 */
public class Test {
    
    public static void main(String[] args)
    {
        //GUI2 gui2 = new GUI2();
        String mapa = "4;7;0;0;0;1;2;0;0;0;1;2;2;0;0;1;0;2;2;0;1;0;0;2;2;1;0;0;1;0;";
        String pionki = "Bronco;20;10;3;10;20;3;2;4;3;1;!;"
                     // + "Jarco;23;9;4;11;19;2;3;3;4;1;!;"
                     // + "[K]Krool;24;10;3;10;20;3;2;4;1;1;!;"
                      + "[K]Kuajgon;21;10;3;10;19;2;2;4;0;1;!;";
        
        gra(mapa, pionki);
        
    }
}
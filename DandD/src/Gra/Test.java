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
        String mapa = "4;7;"
                + "0;0;2;0;0;2;0;"
                + "0;1;1;0;2;1;1;"
                + "2;0;0;0;0;0;0;"
                + "2;0;0;1;1;0;0;";
        String pionki = "Thordek;51;20;10;10;20;3;3;3;0;1;!;"
                      + "[K]Orgoth;56;17;9;12;20;3;5;4;0;1;!;";
        gra(mapa, pionki);
       
    }
}
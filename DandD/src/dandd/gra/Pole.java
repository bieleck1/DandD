/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dandd.gra;

/**
 *
 * @author Grzechu
 */
public class Pole {

    private int rzad;
    private int kolumna;
    private int typTerenu;
    public int czy_zajete;

    public Pole(int rzad, int kolumna, int typTerenu) {
        this.rzad = rzad;
        this.kolumna = kolumna;
        this.typTerenu = typTerenu;
        this.czy_zajete = 0;
    }
}

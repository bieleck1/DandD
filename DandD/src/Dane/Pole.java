/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dane;

/**
 *
 * @author Grzechu
 */
public class Pole {

    private int rzad;
    private int kolumna;
    private int typTerenu;
    public int ktoZajmuje;

    public Pole(int rzad, int kolumna, int typTerenu) {
        this.rzad = rzad;
        this.kolumna = kolumna;
        this.typTerenu = typTerenu;
        this.ktoZajmuje = 0;
    }

    public boolean czyDostepne ()
    {
        return this.typTerenu != 1 && this.ktoZajmuje == 0;
    }
    
    public int typTerenu ()
    {
        return this.typTerenu;
    }
    
    public boolean czyTrudny ()
    {
        return this.typTerenu == 2 || this.typTerenu == 3;
    }
    
    public void zwloki ()
    {
        this.typTerenu = 3;
        this.ktoZajmuje = 0;
    }
}

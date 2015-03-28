/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dandd.gra;

import java.util.ArrayList;

/**
 *
 * @author Grzechu
 */
public class Bohaterowie {

    public ArrayList<Postac> tablica;
    public int iloscPostaci;
    
    public Bohaterowie() {
        this.tablica = new ArrayList<>();
        this.iloscPostaci = 0;
    }

    public void dodajBohatera(String dane) {
        Postac p = new Postac(dane);
        p.okreslNumer(++iloscPostaci);
        tablica.add(p);
    }
}

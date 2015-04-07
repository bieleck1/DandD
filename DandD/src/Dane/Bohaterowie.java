/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dane;

import java.util.ArrayList;
import java.util.Random;

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
        this.iloscPostaci++;
        p.okreslNumer(this.iloscPostaci);
        tablica.add(p);
    }
    
    @Override
    public String toString ()
    {
        StringBuilder wydruk = new StringBuilder();
        
        for (int i=0; i < this.iloscPostaci; i++)
        {
            wydruk.append(tablica.get(i).jakiNumer()).append(" ");
            wydruk.append(tablica.get(i).podajGracza()).append(" ");
            wydruk.append(tablica.get(i).nazwaPostaci()).append(" ");
            wydruk.append(tablica.get(i).ilePW()).append("PW ");
            wydruk.append(tablica.get(i).ileKP()).append("KP ");
            wydruk.append(tablica.get(i).ileAtak()).append("BA ");
            wydruk.append(tablica.get(i).ileKObrazen()).append("kObr ");
            wydruk.append(tablica.get(i).ileRuchu()).append("Szyb ");
            wydruk.append(tablica.get(i).ileInicjatywy()).append("Ini ");
            wydruk.append("\n");
        }
        
        return wydruk.toString();
    }
    
    public int liczbaPostaciGraczy ()
    {
        int gracz = 0, komp = 0;
        for (int i=0; i < this.iloscPostaci; i++)
        {
            if (this.tablica.get(i).podajGracza() == 0)
                komp++;
            else gracz++;
        }
        if (gracz < komp)
            return gracz;
        else return komp;
    }
}

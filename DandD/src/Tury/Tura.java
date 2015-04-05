/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tury;

import java.util.ArrayList;

/**
 *
 * @author Grzechu
 */
public class Tura {
    private int iloscGraczy;
    public ArrayList<TuraPole> lista;
    private int obecnie = 0;
    
    public Tura (int iloscGraczy)
    {
        lista = new ArrayList<>();
        this.iloscGraczy = iloscGraczy;
    }

    
    public int obecna ()
    {
        return this.obecnie;
    }
    
    
    public void dodajTure(int jakiNumer, int ileInicjatywy)
    {
        TuraPole p = new TuraPole(jakiNumer, ileInicjatywy);
        lista.add(p);
    }
    
        
    @Override
    public String toString ()
    {
        StringBuilder pom = new StringBuilder();
        for (int i=0; i < this.iloscGraczy; i++)
        {
        pom.append(this.lista.get(i).kto).append(" -> ").append(this.lista.get(i).ile).append("\n");
        }
        return pom.toString();
    }

    public void nastepna()
    {
        if ((this.obecnie + 1) == this.iloscGraczy)
            obecnie = 0;
        else obecnie++;
    }
}

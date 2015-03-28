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
public class Gra {

    public static void gra(String mapa, String pionki) {

        Bohaterowie postaci = new Bohaterowie();
        //Wczytaj bohaterów z pionków
        postaci.dodajBohatera(pionki);
        Mapa siatka = new Mapa();
        siatka.MapaWczytaj(mapa);
        
        siatka.RozmiescBohaterow(postaci);
        
        //Nie chce mi sie
        
        
        // while (warunkiKonca(postaci) == 0)
        {

        }

    }

}

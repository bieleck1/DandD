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

        //Wczytywanie bohaterów
        Bohaterowie postaci = new Bohaterowie();
        while (pionki.indexOf('!') >= 0)
        {
            postaci.dodajBohatera(pionki.substring(0, pionki.indexOf('!')));        
            String pom_pionki;
            pom_pionki = pionki.substring(pionki.indexOf('!') + 2);
            pionki = pom_pionki;
        }
        
        //Wczytywanie mapy
        Mapa siatka = new Mapa();
        siatka.MapaWczytaj(mapa);
        siatka.RozmiescBohaterow(postaci);
                   
        
        //Sprawdzenie
        System.out.println(siatka);
        System.out.println(postaci);
        
        
        //Inicjowanie gry
        for (int i=0; i < postaci.iloscPostaci; i++)
            postaci.tablica.get(i).losujInicjatywe();
        
        //while ( postaci.liczbaPostaciGraczy() != 0 )
        {
            
        }
    }

}

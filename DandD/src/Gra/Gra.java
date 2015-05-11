/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gra;

import Dane.Mapa;
import Dane.Bohaterowie;
import static Tury.Akcja.akcjaGracza;
import static Tury.Akcja.akcjaKomputera;
import static Tury.Komenda.koniecg;
import static Tury.Komenda.podajStan;
import Tury.Tura;

/**
 *
 * @author Grzechu
 */
public class Gra {

    public static void gra(String mapa, String pionki) {

        //Wczytywanie bohaterów
        Bohaterowie postaci = new Bohaterowie();
        while (pionki.indexOf('!') >= 0) {
            postaci.dodajBohatera(pionki.substring(0, pionki.indexOf('!')));
            String pom_pionki;
            pom_pionki = pionki.substring(pionki.indexOf('!') + 2);
            pionki = pom_pionki;
        }

        //Wczytywanie mapy
        Mapa siatka = new Mapa();
        siatka.MapaWczytaj(mapa);
        siatka.RozmiescBohaterow(postaci);

        //Inicjowanie gry
        Tura tury = new Tura(postaci.iloscPostaci);
        for (int i = 0; i < postaci.iloscPostaci; i++) {
            postaci.tablica.get(i).losujInicjatywe();
            tury.dodajTure(postaci.tablica.get(i).jakiNumer(), postaci.tablica.get(i).ileInicjatywy());
        }
        tury.lista.sort(null);

        //TEST
        //System.out.println(siatka);
        //System.out.println(postaci);      
        //System.out.println(tury);
        //TEST - zmienne
        int ogranicznikTest = 0;

        while (postaci.liczbaPostaciGraczy() != 0) {
            if (postaci.tablica.get(tury.lista.get(tury.obecna()).kto - 1).zywy) {
                postaci.tablica.get(tury.lista.get(tury.obecna()).kto - 1).resetPom();

                if (postaci.tablica.get(tury.lista.get(tury.obecna()).kto - 1).podajGracza() != 0) {
                    akcjaGracza(postaci, siatka, tury.lista.get(tury.obecna()).kto - 1);
                } else {
                    akcjaKomputera(postaci, siatka, tury.lista.get(tury.obecna()).kto - 1);
                }

            }
            //TEST
            //System.out.println(ogranicznikTest + "   " + tury.lista.get(tury.obecna()).kto);
            //ogranicznikTest++;
            //if (ogranicznikTest == 16)
            //   break;

            tury.nastepna();
        }
       
        
        //System.out.println("\nKONIEC GRY");
    }
}

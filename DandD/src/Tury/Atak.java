/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tury;

import Dane.Bohaterowie;
import Dane.Mapa;
import static Tury.Komenda.podajStan;

/**
 *
 * @author Grzechu
 */
public class Atak {
    public static void Atak (Bohaterowie postaci, Mapa mapa, int czyjRuch, int kierunek)
    {        
        String komunikat = null;
        if (kierunek == -3 || kierunek == -1)
        {
            //System.out.println("Atak niedozwolony");
            return;
        }
        
        if (kierunek == -2)
        {
           // System.out.println("Znajdujesz się na polu " + mapa.znajdzBohatera(czyjRuch+1));
            return;
        }
        
        int kogo = mapa.plansza.get(kierunek).ktoZajmuje - 1;
        if (kogo < 0)
        {
            //System.out.println("Próbujesz zaatakować puste pole");
            return;
        }
        
        
        if (postaci.tablica.get(czyjRuch).podajGracza() == postaci.tablica.get(kogo).podajGracza())
        {
            //System.out.println("Próbujesz zaatakować sprzymierzeńca");
            return;
        }
        
        if (postaci.tablica.get(kogo).podajGracza() != 0 && postaci.tablica.get(kogo).podajGracza() != 1)
        {
            //System.out.println("Próbujesz zaatakować puste pole");
            return;
        }
        
        int testAtaku = postaci.tablica.get(czyjRuch).losujAtak();
        int BA = postaci.tablica.get(czyjRuch).ileAtak();
        int KP = postaci.tablica.get(kogo).ileKP();
        int obrazenia = 0;

        //Sprawdzenie krytyka
        if (testAtaku - BA >= postaci.tablica.get(czyjRuch).ileDoKrytyka())
        {
            testAtaku = postaci.tablica.get(czyjRuch).losujAtak();
            if (testAtaku >= KP)
                obrazenia = postaci.tablica.get(czyjRuch).losujKrytyk();
        }
        //Sprawdzenie zwykłego trafienia
        else if (testAtaku >= KP)
                obrazenia = postaci.tablica.get(czyjRuch).losujObrazenia();

        //Zadanie obrażeń
        postaci.tablica.get(kogo).odejmijPW(obrazenia);
               
        if (obrazenia != 0)
        {
            if (obrazenia > (postaci.tablica.get(czyjRuch).ileKObrazen() + postaci.tablica.get(czyjRuch).ilePremiaObrazen()))
                komunikat = ("Atak krytyczny - zadano " + obrazenia + " punktów obrażeń");
            else komunikat = ("Zadano " + obrazenia + " punktów obrażeń ( " + BA + " + " + (testAtaku - BA) + " >= " + KP + " )");
        }    
        else komunikat = ("Atak zakończony niepowodzeniem ( " + BA + " + " + (testAtaku - BA) + " < " + KP + " )");
        postaci.tablica.get(czyjRuch).lAtakPom--;
        
        //Sprawdzenie czy postać przeżyła atak
        if (postaci.tablica.get(kogo).ilePW() <= 0)
        {
            postaci.smierc(kogo);
            mapa.plansza.get(kierunek).zwloki();
            komunikat += "\nGracz " + postaci.tablica.get(kogo).nazwaPostaci().substring(3) + " zginął.";
        }
        podajStan(komunikat);
    }
}
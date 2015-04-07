/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tury;

import Dane.Bohaterowie;
import Dane.Mapa;

/**
 *
 * @author Grzechu
 */
public class Ruch {
    public static void Ruch (Bohaterowie postaci, Mapa mapa, int czyjRuch, int kierunek)
    {
        //Komunikaty są testowe (chyba, że dziennik będzie wyświetlany)
        
        if (kierunek == -3 || kierunek == -1)
        {
            System.out.println("Ruch niedozwolony");
            return;
        }
        
        if (kierunek == -2)
        {
            System.out.println("Znajdujesz się na polu " + mapa.znajdzBohatera(czyjRuch));
            return;
        }
        
        
        //Ruch po prostej
        if (kierunek == mapa.znajdzBohatera(czyjRuch) + mapa.wymiarX()
                || kierunek == mapa.znajdzBohatera(czyjRuch) - mapa.wymiarX()
                || kierunek == mapa.znajdzBohatera(czyjRuch) + 1
                || kierunek == mapa.znajdzBohatera(czyjRuch) - 1)
            if (postaci.tablica.get(czyjRuch).ruchPom >= mapa.kosztRuchu(kierunek))
            {
                if (mapa.plansza.get(kierunek).czyDostepne())
                {
                    mapa.przemiesc(czyjRuch, kierunek);
                    postaci.tablica.get(czyjRuch).ruchPom -= mapa.kosztRuchu(kierunek);
                }
                else System.out.println("Pole niedostępne");
            }
            else System.out.println("Brak wystarczającej liczby punktów ruchu");
        
        //Ruch po skosie
        else if (postaci.tablica.get(czyjRuch).ruchPom >= mapa.kosztRuchu(kierunek) + 1 )
                if (mapa.plansza.get(kierunek).czyDostepne())
                {
                    mapa.przemiesc(czyjRuch, kierunek);
                    postaci.tablica.get(czyjRuch).ruchPom -= mapa.kosztRuchu(kierunek) + 1;
                }
                else System.out.println("Pole niedostępne");
            else System.out.println("Brak wystarczającej liczby punktów ruchu");
        
        ////////////////////////ODŚWIEŻANIE GRAFIKI PO RUCHU\\\\\\\\\\\\\\\\\\\\
        System.out.println("Ruch " + kierunek);
    }
}

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
public class Ruch {
    public static int Ruch (Bohaterowie postaci, Mapa mapa, int czyjRuch, int kierunek)
    {
        int koszt = 0;
        
        if (kierunek == -3 || kierunek == -1)
        {
            System.out.println("Ruch niedozwolony");
            postaci.tablica.get(czyjRuch).ruchPom -= 1;
            return 0;
        }
        
        if (kierunek == -2)
        {
            System.out.println("Znajdujesz się na polu " + mapa.znajdzBohatera(czyjRuch+1));
            postaci.tablica.get(czyjRuch).ruchPom -= 1;
            return 0;
        }
        
        
        //Ruch po prostej
        if (kierunek == mapa.znajdzBohatera(czyjRuch+1) + mapa.wymiarX()
                || kierunek == mapa.znajdzBohatera(czyjRuch+1) - mapa.wymiarX()
                || kierunek == mapa.znajdzBohatera(czyjRuch+1) + 1
                || kierunek == mapa.znajdzBohatera(czyjRuch+1) - 1)
            if (postaci.tablica.get(czyjRuch).ruchPom >= mapa.kosztRuchu(kierunek))
            {
                if (mapa.plansza.get(kierunek).czyDostepne())
                {
                    mapa.przemiesc(czyjRuch+1, kierunek);
                    postaci.tablica.get(czyjRuch).ruchPom -= mapa.kosztRuchu(kierunek);
                    koszt += mapa.kosztRuchu(kierunek);
                    podajStan("Poruszyłeś się: Koszt ruchu - " + koszt);
                }
                else System.out.println("Pole niedostępne");
            }
            else System.out.println("Brak wystarczającej liczby punktów ruchu");
        
        //Ruch po skosie
        else if (postaci.tablica.get(czyjRuch).ruchPom >= mapa.kosztRuchu(kierunek) + 1 )
                if (mapa.plansza.get(kierunek).czyDostepne())
                {
                    mapa.przemiesc(czyjRuch+1, kierunek);
                    postaci.tablica.get(czyjRuch).ruchPom -= mapa.kosztRuchu(kierunek) + 1;
                    koszt += mapa.kosztRuchu(kierunek) + 1;
                    podajStan("Poruszyłeś się: Koszt ruchu - " + koszt);
                }
                else {
                    //System.out.println("Pole niedostępne");
                    return 0;
                }
            else System.out.println("Brak wystarczającej liczby punktów ruchu");
        
        return 1;
    }

    public static boolean RuchSprawdz (Bohaterowie postaci, Mapa mapa, int czyjRuch, int kierunek)
    {
        if (kierunek < 0)
            return false;
        
        //Ruch po prostej
        if (kierunek == mapa.znajdzBohatera(czyjRuch+1) + mapa.wymiarX()
                || kierunek == mapa.znajdzBohatera(czyjRuch+1) - mapa.wymiarX()
                || kierunek == mapa.znajdzBohatera(czyjRuch+1) + 1
                || kierunek == mapa.znajdzBohatera(czyjRuch+1) - 1)
            if (postaci.tablica.get(czyjRuch).ruchPom >= mapa.kosztRuchu(kierunek))
            {
            return mapa.plansza.get(kierunek).czyDostepne();
            }
            else return false;
        
        //Ruch po skosie
        else if (postaci.tablica.get(czyjRuch).ruchPom >= mapa.kosztRuchu(kierunek) + 1 )
                return mapa.plansza.get(kierunek).czyDostepne();
            else return false;
    }


}

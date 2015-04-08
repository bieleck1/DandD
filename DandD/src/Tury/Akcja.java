/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tury;

import Dane.Bohaterowie;
import Dane.Mapa;
import static Tury.Atak.Atak;
import static Tury.Czar.Czar;
import static Tury.Ruch.Ruch;
import java.util.Scanner;

/**
 *
 * @author Grzechu
 */
public class Akcja {
    
    public static void akcjaGracza (Bohaterowie postaci, Mapa mapa, int czyjRuch)
    {
        boolean koniec = true;
        while (koniec)
        {
///////////////////ROZWIĄZANIE CHWILOWE, TE INFORMACJE POWINNY PRZYCISKI DAWAĆ, A NIE KLAWIATURA\\\\\\\\\\\\\\\\\\\\\\\\\\\\
            String klawiatura;
            Scanner odczyt = new Scanner(System.in);
            klawiatura = odczyt.next();
            char akcja = klawiatura.charAt(0);
            int kierunek = -2;              //PRZYJĄŁEM KIERUNKI TAK JAK SĄ NA NUMERYCZNEJ
            if (klawiatura.length() != 1 )
                if (Character.isDigit(klawiatura.charAt(1)))
                {
                    kierunek = klawiatura.charAt(1) - 48;
                    kierunek = ustalKierunek(mapa, czyjRuch, kierunek);
                }
///////////////////ROZWIĄZANIE CHWILOWE, TE INFORMACJE POWINNY PRZYCISKI DAWAĆ, A NIE KLAWIATURA\\\\\\\\\\\\\\\\\\\\\\\\\\\\
            
            switch (akcja){
                case 'R':
                    Ruch(postaci, mapa, czyjRuch, kierunek);
                    break;

                case 'A':
                    if (postaci.tablica.get(czyjRuch).lAtakPom > 0)
                        Atak(postaci, mapa, czyjRuch, kierunek);
                    else System.out.println("Wykorzystano limit ataków");
                    break;

                case 'C':
                    Czar(postaci, mapa, czyjRuch, kierunek);
                    break;
                    
                case 'S':
                    koniec = false;
                    break;
                    
                case 'M':
                    System.out.println(mapa.druk());
                    break;
            }
        }
        //TEST
        System.out.print("Gracz    |");
    }

    
    public static void akcjaKomputera (Bohaterowie postaci, Mapa mapa, int czyjRuch)
    {
        System.out.print("Komputer |");
    }
    
    private static int ustalKierunek (Mapa mapa, int czyjRuch, int kierunek)
    {
       int skad = mapa.znajdzBohatera(czyjRuch+1);
       
       //Sprawdzanie czy dany kierunek nie wychodzi poza planszę
       if ( skad == 0 )
           if (kierunek == 1 || kierunek == 4 || kierunek == 7 || kierunek == 8 || kierunek == 9)
               kierunek = -1;
       
       if ( skad == mapa.wymiarX() - 1 )
           if (kierunek == 6 || kierunek == 3 || kierunek == 7 || kierunek == 8 || kierunek == 9)
               kierunek = -1;
       
       if ( skad == (mapa.wymiarX() * mapa.wymiarY()) - 1 )
           if (kierunek == 6 || kierunek == 3 || kierunek == 1 || kierunek == 2 || kierunek == 9)
               kierunek = -1;
       
       if ( skad == mapa.wymiarX() * (mapa.wymiarY() - 1) )
           if (kierunek == 7 || kierunek == 4 || kierunek == 1 || kierunek == 2 || kierunek == 3)
               kierunek = -1;
       
       if ( skad > 0 && skad < mapa.wymiarX()-1 )
           if (kierunek == 7 || kierunek == 8 || kierunek == 9)
               kierunek =-1;
       
       if ( skad > mapa.wymiarX() * (mapa.wymiarY() - 1) && skad < mapa.wymiarX()*mapa.wymiarY()-1 )
           if (kierunek == 1 || kierunek == 2 || kierunek == 3)
               kierunek =-1;
       
       if ( skad % mapa.wymiarX() == 0 )
           if (kierunek == 1 || kierunek == 4 || kierunek == 7)
               kierunek =-1;
       
       if ( (skad + 1) % mapa.wymiarX() == 0 )
           if (kierunek == 9 || kierunek == 6 || kierunek == 3)
               kierunek =-1;

       
       switch (kierunek)
       {
           case 1:
               kierunek = skad + mapa.wymiarX() - 1;
               break;
           case 2:
               kierunek = skad + mapa.wymiarX();
               break;
           case 3:
               kierunek = skad + mapa.wymiarX() + 1;
               break;
           case 4:
               kierunek = skad - 1;
               break;
           case 5:
               kierunek = -2;
               break;
           case 6:
               kierunek = skad + 1;
               break;
           case 7:
               kierunek = skad - mapa.wymiarX() - 1;
               break;
           case 8:
               kierunek = skad - mapa.wymiarX();
               break;
           case 9:
               kierunek = skad - mapa.wymiarX() + 1;
               break;
           case 0:
               kierunek = -3;
               break;
       }
        
        return kierunek;
    }
}

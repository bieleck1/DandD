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
            //POBIERZ AKCJĘ;
            String klawiatura;
            Scanner odczyt = new Scanner(System.in);
            klawiatura = odczyt.next();            //POBIERZ AKCJĘ;
            char akcja = klawiatura.charAt(0);


            switch (akcja){
                case 'R':
                    Ruch(postaci, mapa, czyjRuch);
                    break;

                case 'A':
                    Atak(postaci, mapa, czyjRuch);
                    break;

                case 'C':
                    Czar(postaci, mapa, czyjRuch);
                    break;
                    
                case 'S':
                    koniec = false;
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
}

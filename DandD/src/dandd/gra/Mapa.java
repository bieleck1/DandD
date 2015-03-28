/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dandd.gra;

import java.util.ArrayList;

/**
 *
 * @author Grzechu
 */
public class Mapa
{

    public ArrayList<Pole> plansza;
    private int wymiarX;
    private int wymiarY;

    public Mapa()
    {
        plansza = new ArrayList<>();

    }

    public void MapaWczytaj(String dane)
    {

        int dlugosc = dane.length();
        String wyraz = dane.substring(0, dane.indexOf(';'));
        this.wymiarX = Integer.parseInt(wyraz);
        String pom;
        pom = dane.substring(dane.indexOf(';') + 1);
        dane = pom;
        wyraz = dane.substring(0, dane.indexOf(';'));
        this.wymiarY = Integer.parseInt(wyraz);
        pom = dane.substring(dane.indexOf(';') + 1);
        dane = pom;

        int i = 0, j = 0;

        while (0 < dlugosc) {
            wyraz = dane.substring(0, dane.indexOf(';'));
            int typPola = Integer.parseInt(wyraz);

            Pole p = new Pole(i, j, typPola);
            plansza.add(p);

            i++;
            if (i % this.wymiarX == 0) {
                i -= this.wymiarX;
                j++;
            }

        }
    }

    public void RozmiescBohaterow(Bohaterowie b)
    {
        int liczbaRozmieszczonych = 0;

        while (liczbaRozmieszczonych != b.iloscPostaci)
        {
            if (b.tablica.get(liczbaRozmieszczonych).podajGracza() != 0)
            {
                for (int j=0; j < this.plansza.size(); j++)
                {
                    if (this.plansza.get(j).ktoZajmuje == 0 && this.plansza.get(j).czyDostepne() == true)
                    {    
                        this.plansza.get(j).ktoZajmuje = b.tablica.get(liczbaRozmieszczonych).jakiNumer();
                        break;
                    }
                }    
            }
            else
            {
                for (int j = this.plansza.size(); j > 0; j--)
                {
                    if (this.plansza.get(j).ktoZajmuje == 0 && this.plansza.get(j).czyDostepne() == true)
                    {    
                        this.plansza.get(j).ktoZajmuje = b.tablica.get(liczbaRozmieszczonych).jakiNumer();
                        break;
                    }
                }
            }
            liczbaRozmieszczonych++;
        }
    }
}

/*-----------------------------------------------------------
 |ZAŁOŻENIA:                                                  |             
 |Pliki z mapą będą wyglądały mniej więcej tak:               |
 |   4;3;0;1;2;3;0;1;2;3;0;1;2;3;0;1;2;3                      |
 |   WYMIAR X;WYMIAR Y;KOLEJNO WYMIENIONE WSZYSTKIE POLA      |
 |0 to zwykłe pole, 1 to ściana/obiekt nie do przejścia,      |
 |2 to trudny teren, 3 to pułapka itp itd                     |
 |Czyli interpretujemy to jako pole:                          |
 |0123    /*\                                                 |
 |0123     | Y                                                |
 |0123    \./                                                 |
 |<-->                                                        |
 |  X                                                         |
 |------------------------------------------------------------|
 |0 - zwykłe pole                                             |
 |1 - niedostępne pole (np. ściana)                           |
 |2 - trudny teren (koszt ruchu 2, np. gruz, krzaki)          |
 |3 -                                                         |
 |4 -                                                         |
 ------------------------------------------------------------*/

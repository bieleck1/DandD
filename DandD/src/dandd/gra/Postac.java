/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dandd.gra;

import java.util.Random;

/**
 *
 * @author Grzechu
 */
public class Postac {

    private String nazwa;       //Nazwa postaci
    private int PW;             //Punkty wyrzymałości
    private int KP;             //Klasa pancerza
    private int atak;           //Premia do ataku
    private int kObrazen;       //Kość obrażeń
    private int premiaObrazen;  //Premia do obrażeń
    private int ruch;           //Punkty ruchu
    private int gracz;          //Kto steruje postacią
    private int numer;          //Numeracja postaci
    private int inicjatywa;     //Bonus inicjatywy; Inicjatywa
    
    
    public Postac(String dane) {
        int dlugosc = dane.length();
        int i = 0;

        while (0 < dlugosc) {
            String wyraz = dane.substring(0, dane.indexOf(';'));
            switch (i) {
                case 0:
                    this.nazwa = wyraz;
                    if ("[K]".equals(this.nazwa.substring(0, 3)))
                        this.gracz = 0;
                    else
                        this.gracz = 1;
                    break;

                case 1:
                    this.PW = Integer.parseInt(wyraz);
                    break;

                case 2:
                    this.KP = Integer.parseInt(wyraz);
                    break;

                case 3:
                    this.atak = Integer.parseInt(wyraz);
                    break;

                case 4:
                    this.kObrazen = Integer.parseInt(wyraz);
                    break;

                case 5:
                    this.premiaObrazen = Integer.parseInt(wyraz);
                    break;

                case 6:
                    this.ruch = Integer.parseInt(wyraz);
                    break;
                    
                case 7:
                    this.inicjatywa = Integer.parseInt(wyraz);
                    break;
            }
            i++;

            String pom;
            pom = dane.substring(dane.indexOf(';') + 1);
            dane = pom;

            dlugosc = dane.length();
            }
    }

    public int losujObrazenia() {
        int obrazenia = this.premiaObrazen;
        Random r = new Random();
        obrazenia += Math.abs(r.nextInt()) % this.kObrazen + 1;
        return obrazenia;
    }

    public void odejmijPW(int ilosc) {
        this.PW -= ilosc;
    }
   
    public int ilePW()
    {
        return this.PW;
    }
    
    public int podajGracza ()
    {
        return this.gracz;
    }
    
    public void okreslNumer (int n)
    {
        this.numer = n;
    }
    
    public int jakiNumer ()
    {
        return this.numer;
    }
    
    public String nazwaPostaci ()
    {
        return this.nazwa;
    }

    public int ileKP ()
    {
        return this.KP;
    }
    
    public int ileAtak ()
    {
        return this.atak;
    }
    
    public int ileKObrazen ()
    {
        return this.kObrazen;
    }
    
    public int ilePremiaObrazen ()
    {
        return this.premiaObrazen;
    }
  
    public int ileRuchu ()
    {
        return this.ruch;
    }
    
    public int ileInicjatywy ()
    {
        return this.inicjatywa;
    }
    
    public void losujInicjatywe ()
    {
        int ini = this.inicjatywa;
        Random r = new Random();
        ini += Math.abs(r.nextInt()) % 20 + 1;
        this.inicjatywa = ini;
    }
}

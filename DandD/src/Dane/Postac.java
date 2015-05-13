/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dane;

import java.util.Random;

/**
 *
 * @author Grzechu
 */
public class Postac {

    private String nazwa;           //Nazwa postaci
    private int PW;                 //Punkty wyrzymałości
    private int KP;                 //Klasa pancerza
    private int atak;               //Premia do ataku
    private int kObrazen;           //Kość obrażeń
    private int krytykZakres;       //Minimalna wartość wymagana do krytyka
    private int krytykMnoznik;      //Przelicznik obrażeń krytycznych
    private int premiaObrazen;      //Premia do obrażeń
    private int ruch;               //Punkty ruchu
    private int gracz;              //Kto steruje postacią
    private int numer;              //Numeracja postaci
    private int inicjatywa;         //Bonus inicjatywy; Inicjatywa
    private int liczbaAtakow;       //Liczba atakow na ture
    private String ksiegaCzarow;    //Indeksy znanych zaklec (0 - brak)
    //Pomocnicze
    public int ruchPom = 0;
    public int lAtakPom = 0;
    public boolean zywy;
    
    
    
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
                    this.krytykZakres = Integer.parseInt(wyraz);
                    break;
                    
                case 6:
                    this.krytykMnoznik = Integer.parseInt(wyraz);
                    break;
                    
                case 7:
                    this.premiaObrazen = Integer.parseInt(wyraz);
                    break;

                case 8:
                    this.ruch = Integer.parseInt(wyraz);
                    break;
                    
                case 9:
                    this.inicjatywa = Integer.parseInt(wyraz);
                    break;
                
                case 10:
                    this.liczbaAtakow = Integer.parseInt(wyraz);
                    break;
                    
                default:
                    this.ksiegaCzarow+= wyraz;
                    break;
            }
            i++;

            String pom;
            pom = dane.substring(dane.indexOf(';') + 1);
            dane = pom;

            dlugosc = dane.length();
            }
        
        this.zywy = true;
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
    
    public int losujAtak ()
    {
        int rzut = this.atak;
        Random r = new Random();
        rzut += Math.abs(r.nextInt()) % 20 + 1;
        return rzut;
    }
    
    public int ileKObrazen ()
    {
        return this.kObrazen;
    }
    
    public int ileDoKrytyka ()
    {
        return this.krytykZakres;
    }
    
    public int losujKrytyk ()
    {
        int obrazenia = this.krytykMnoznik * (this.kObrazen + this.premiaObrazen);
        return obrazenia;
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
    
    public int ileAtakow ()
    {
        return this.liczbaAtakow;
    }
    
    public boolean czyCzaruje ()
    {
        return this.ksiegaCzarow.charAt(0) == '0';
    }
    
    public void resetPom ()
    {
        this.ruchPom = this.ruch;
        this.lAtakPom = this.liczbaAtakow;
    }
    
    public static void resetPomBoh ()
    {
        
    }
}

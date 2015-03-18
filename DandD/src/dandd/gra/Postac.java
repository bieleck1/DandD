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
    
    public Postac (String dane)
   {
       int dlugosc = dane.length();
       int i = 0;
       
       while (0 < dlugosc)
       {
           String wyraz = dane.substring(0, dane.indexOf(';'));
           
           switch (i)
           {
               case 0:
                   this.nazwa = wyraz;
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
           }
           i++;
           
                   
           
       }
       
    }
    
    public int losujObrazenia ()
    {
        int obrazenia = 0;
        Random r = new Random();
        obrazenia+= (r.nextInt() % this.kObrazen)+1;
        obrazenia += this.premiaObrazen;
        return obrazenia;
    }
    
}

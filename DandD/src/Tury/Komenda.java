/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tury;

import Dane.Postac;
import static Tury.Akcja.tablica;
import static Tury.Akcja.tablicaKierunek;

/**
 *
 * @author Rafał
 */
public class Komenda {
    static String komenda = "N";
    static String Stan="";
    public static void getStan(String stan){
        Stan = stan;
    }
    public static String wezStan(){
        return Stan;
    }
    public synchronized static String getKomenda(){
        String tmp = komenda;
        komenda = "N";
        return tmp;
        
    }
    public synchronized static void podajKomende(String Es){
        komenda = Es;
    }
    
    static Postac B;
    static Postac C;
    public synchronized static Postac getPostac(){
        
        return C;
    }
    public synchronized static Postac getPostacW(){
        
        return B;
    }
    public synchronized static void podajStaty(Postac Hero){
        B = Hero;
    }
    public synchronized static void podajStatyW(Postac HeroW){
        C = HeroW;
    }
  
}

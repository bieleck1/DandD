
package Tury;

import Dane.Postac;

public class Komenda {
    static String komenda = "N";
    static String Stan = "Witaj Bohaterze!";
    static int j;
    public static void podajStan(String stan){
        Stan =Stan + "\n"+ stan;
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
  public  static void koniec(int i){
       j=i;
  }
  public  static int koniecg(){
      return j;
  }
}

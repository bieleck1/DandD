/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tury;



/**
 *
 * @author Grzechu
 */
public class TuraPole implements Comparable<TuraPole>
{
    public int kto;
    public int ile;
    
    public TuraPole (int kto, int ile)
    {
        this.kto = kto;
        this.ile = ile;
    }
    
    
    @Override
    public int compareTo(TuraPole o)
    {
    int pom = o.ile - this.ile;
    return pom;
    }
}
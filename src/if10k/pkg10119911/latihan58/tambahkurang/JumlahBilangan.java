/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119911.latihan58.tambahkurang;

/**
 *
 * @author tegar
 */ 
public class JumlahBilangan extends Bilangan{

    public JumlahBilangan(int x, int y) {
        super(x, y);
    }
   
    public void tampilHasilJumlah(){
        System.out.println("Hasil Perjumlahan = " + (getX()+getY()));
    }
}

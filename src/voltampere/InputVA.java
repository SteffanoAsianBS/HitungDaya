/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voltampere;

import java.util.Scanner;

/**
 *
 * @author STEFFANO
 */
public class InputVA {
    Double Volt, Ampere, Watt;
    
    void Inputva(){
    Scanner Masuk = new Scanner (System.in);
    System.out.println("========Penghitung Daya========");
    System.out.print("Masukkan Besar Tegangan : ");
    Volt = Masuk.nextDouble();
    System.out.print("Masukkan Besar Kuat Arus : ");
    Ampere = Masuk.nextDouble();
    }
    
    void count(){
    Watt = Volt * Ampere;
    }
    
    Double Voltage(){
        return Volt;
    }
    
    Double Amp (){
        return Ampere;
    }
    
    Double Wattage(){
        return Watt;
    }
}

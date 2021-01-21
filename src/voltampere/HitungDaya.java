/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voltampere;

/**
 *
 * @author STEFFANO
 */
public class HitungDaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputVA Daya = new InputVA ();
        
        Daya.Inputva();
        Daya.count();
        
        System.out.println("==========================");
        System.out.println("Besar Tegangan : "+Daya.Voltage()+" Volt");
        System.out.println("Nilai Tinggi : "+Daya.Amp()+" Ampere");
        System.out.println("Maka Daya-nya adalah : Tegangan x Kuat Arus= "+Daya.Voltage()+" x "+Daya.Amp()+" = "+Daya.Wattage()+" Watt");
    }
    
}

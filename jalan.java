/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;
import java.util.Scanner;


/**
 *
 * @author Arum
 */
public class jalan {
     private static int pilih; 
    private static int a; 
    private static boolean kendaraan;
    public static void main(String [] args) { 
        Mobil jalan = new Mobil(200, 0, 0); 
        //Mobil jalan1 = new Mobil(); 
        Scanner in = new Scanner(System.in); 
        while (!jalan.isStarted()) {
            System.out.println("Menu mobil");
            System.out.println("1. Start mobil"); 
            System.out.println("2. Gas mobil"); 
            System.out.println("3. Ganti Gigi"); 
            System.out.println("4. Rem mobil"); 
            System.out.println("5. Stop mobil");
            System.out.println(""); 
            System.out.print("Pilih menu: ");
            
            //System.out.println("Kecepatan Mobil "+ jalan.getKecActual());             
            pilih = in.nextInt(); 
            switch (pilih) {
                case 1 : 
                System.out.println("Kendaraan distarter");
                jalan.startmobil();
                break; 
                case 2 :
               // system.out.println("Jalan perlahan");
                jalan.gas(); 
                break; 
                case 3 : 
                System.out.print("Pilih Gigi (1-5) : "); 
                int Gigi = in.nextInt(); 
                System.out.println("Gigi (1-5) : " + jalan.Gigi);
                //System.out.println("Gigi: " + jalan.Gigi);                     
                jalan.gantiGigi(Gigi);
                System.out.println("Percepatan: "+ jalan.getPercepatan() + " km/jam^2");
                    
                   //jalan.setPercepatan(Gigi);
                    break; 
                
                case 4 : 
                    jalan.rem(); 
                    break;                    
                case 5 : 
                    jalan.stop(); 
                    break; 
                
                
               
            }    
        } 
    } 
}


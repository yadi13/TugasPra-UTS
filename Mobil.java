/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

/**
 *
 * @author Arum
 */
    public class Mobil { 

    int kecMax; 
    int percepatan; 
    int kecActual; 
    boolean started; 
    int Gigi; 

    public Mobil() { 
    } 

    public Mobil(int kecMax, int percepatan, int kecActual) { 
        this.kecMax = kecMax; 
        this.percepatan = percepatan; 
        this.kecActual = kecActual; 
        this.started = false; 
        this.Gigi = 0; 
    }
    //gettr
      public int getKecMax() { 
        return kecMax; 
    } 

    public int getPercepatan() { 
        return percepatan; 
    } 

    public int getKecActual() { 
        return kecActual; 
    } 

    public boolean isStarted() { 
        return started; 
    }
    //settr
     public void setKecMax(int kecMax) { 
        this.kecMax = kecMax; 
    } 

    public void setPercepatan(int percepatan) { 
        this.percepatan = percepatan; 
    } 

    public void setKecActual(int kecActual) { 
        this.kecActual = kecActual; 
    } 

    public void setStarted(boolean started) { 
        this.started = started; 
    }
      public void startmobil() { 
        if (!started) { 
            this.setKecActual(0); 
        } 
    }
       public void gantiGigi(int Gigi) { 
        this.setPercepatan(percepatan); 
        switch(Gigi) { 
            case 0 : 
                
                this.setPercepatan(0); 
                break; 
            case 1 : 
                
                this.setPercepatan(10); 
                break; 
            case 2 : 
                
                this.setPercepatan(20); 
                break; 
            case 3 : 
                this.setPercepatan(30); 
                break; 
            case 4 : 
                this.setPercepatan(40); 
                break;
            case 5 :
                this.setPercepatan(50);
        }   
    }
          public void gas() { 
        if (this.getKecActual()+this.getPercepatan() < this.getKecMax()) { 
            this.setKecActual(this.getKecActual()+this.getPercepatan()); 
        } else this.setKecActual(this.getKecMax()); 
    } 
       public void rem() { 
        this.setKecActual(this.getKecActual()); 
    }
         public void stop() { 
        this.setKecActual(0); 
        this.started = true; 
        System.out.println(); 
        System.out.println("Kecepatan Mobil "+ this.getKecActual()); 
        System.out.println("Berhenti,Kabur!!!"); 
        System.out.println(); 
    }
}
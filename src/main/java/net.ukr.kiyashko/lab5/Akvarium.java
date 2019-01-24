package net.ukr.kiyashko.lab5;

public class Akvarium {
    private double shirina;
    private double vysota;
    private double glubina;
    private double obyem;
    private double moshnostFiltra;

    private double temperature;
    private Enum tips;
    private Filtr filtr;
    private Fish [][] fish;
    private Decor [][]decor;
    private Lamp lamp;
    private Lamp lamp2;
    private Plants [][] plants;
    private Kormushka kormushka;
    private void zamenaVody(){

    };
    Akvarium(double shirina,double vysota,double glubina ){
       this.shirina=shirina;
       this.vysota=vysota;
       this.glubina=glubina;
       this.obyem=shirina*vysota*glubina*1000;

    }


    public double getObyem() {
        return obyem;
    }
    public double getMoshnost() {
        moshnostFiltra = obyem*3;
        return moshnostFiltra;
    }

    public void setObyem(double obyem) {
        this.obyem = obyem;
    }
      public void setFiltr(Filtr filtr){
        this.filtr=filtr;
    }
    public void setFish(Fish [][] fish) {
        this.fish = fish;
    }
    public void setDecor(Decor[][] decor) {
        this.decor = decor;
    }
    public void setLamp(Lamp  lamp) { this.lamp = lamp;    }
    public void setLamp2(Lamp  lamp2) {
        this.lamp2 = lamp2;
    }
    public void setPlants(Plants [][]  plants) {
        this.plants = plants;
    }
    public void setKormushka(Kormushka kormushka) {
        this.kormushka = kormushka;
    }
}

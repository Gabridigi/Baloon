public class Baloon {
    private int volume;
     public Baloon(){
        this.volume=0;
    }
    public void addAir(double quantità){
        volume+=quantità;
    }
    public double getVolume(){
        return this.volume;
    }
    public double getRaggio(){
        return Math.cbrt(this.volume / (4.0 / 3.0 * Math.PI));
    }
    public double getSuperfice(){
        return 4*Math.PI * Math.pow(this.getRaggio(), 2);
    }
    
}

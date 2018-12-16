package sample;

public class MetricSystem {
    private double mg;
    public MetricSystem(){
        this.mg = 0;
    }

    public double getMg() {
        return mg;
    }

    public void setFromKg(double kg) {
        this.mg = kg * 1000 * 1000;
    }
    public void setFromEnglishSystem(double lb){
        this.mg = lb * 453592.37;
    }
    public void setFromThaiSystem(double tamlung) {
        this.mg = tamlung * 0.06*1000*1000;
    }
    public double toGram(){
        return this.mg / 1000;
    }
    public double toKilogram(){
        return toGram() / 1000;
    }
}

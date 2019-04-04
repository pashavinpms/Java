package by.gsu.pmslab;

public enum Subject {
private final static String NAME="wire";
private Material material;
private double volume=0.03;

public Subject(Material material) {
    this.material = material;

}
    public String getNAME() {
        return NAME;
    }
    public Material getMaterial() {
        return material;
    }
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    public void setMaterial(Material material) {
        this.material = material;
    }
    public double getMass(){
    return material.getDENSITY()*volume;
    }
    public String toString(){
    return NAME + ";" + material + ";" + volume + ";" + getMass();
    }
}

package by.gsu.pmslab;

public enum Subject {
private final static String NAME="wire";
private Material material;
private final static double VOLUME=0.03;

public Subject(Material material) {
    this.material = material;

}
    public String getNAME() {
        return NAME;
    }
    public Material getMaterial() {
        return material;
    }
    public double getVOLUME() {
        return VOLUME;
    }
    public void setMaterial(Material material) {
        this.material = material;
    }
    public double getMass(){
    return material.getDENSITY()*VOLUME;
    }
    public String toString(){
    return NAME + ";" + material + ";" + VOLUNE + ";" + getMass();
    }
}

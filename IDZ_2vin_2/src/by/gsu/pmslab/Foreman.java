package by.gsu.pmslab;
import by.gsu.pmslab.Employee;

public class Foreman extends Employee {

    private int numOfWorkers;
    private String nameOfManufacture;

    public Foreman(String nameOfManufacture, int numOfWorkers) {
        super();
        this.nameOfManufacture = nameOfManufacture;
        this.numOfWorkers = numOfWorkers = 0;
    }

    public Foreman(String name, String sex, String dateOfBirth, int experience,
                   int salary, int tax, String nameOfManufacture, int numOfWorkers) {
        super(name, sex, dateOfBirth, experience, salary, tax);
        this.nameOfManufacture = nameOfManufacture;
        this.numOfWorkers = numOfWorkers;
    }

    public Foreman(String name, String sex, String dateOfBirth, int experience,
                   int salary, int tax) {
        super(name, sex, dateOfBirth, experience, salary, tax);
        this.nameOfManufacture = nameOfManufacture;
        this.numOfWorkers = 0;
    }

    public String getNameOfManufacture() {
        return nameOfManufacture;
    }

    public void setNameOfManufacture(String nameOfManufacture) {
        this.nameOfManufacture = nameOfManufacture;
    }

    public int getNumOfWorkers() {
        return numOfWorkers;
    }

    public void setNumOfWorkers(int numOfWorkers) {
        this.numOfWorkers = numOfWorkers;
    }

    @Override
    public String infoToString() {
        return super.infoToString() + "; " + nameOfManufacture + ";" + numOfWorkers + ";\n";
    }

    @Override
    public void Write() {
        System.out.println("Foreman:\n" + infoToString());
    }
}

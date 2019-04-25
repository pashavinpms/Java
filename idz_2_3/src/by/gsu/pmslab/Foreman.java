package by.gsu.pmslab;
import by.gsu.pmslab.*;

public class Foreman implements Employee,WriteInfo {

    private int numOfWorkers;
    private String nameOfManufacture;
    private boolean marr;
    private String name;
    private String sex;
    private String dateOfBirth;
    private int experience;
    private int salary;
    private int tax;

    public Foreman(boolean marr,String nameOfManufacture, int numOfWorkers, String name, String sex, String dateOfBirth, int experience,
                   int salary, int tax) {
        this.nameOfManufacture = nameOfManufacture;
        this.numOfWorkers = numOfWorkers;
        this.marr = marr;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.experience = experience;
        this.salary = salary;
        this.tax = tax;
    }

    public Foreman(boolean marr, String name, String sex, String dateOfBirth, int experience,
                   int salary, int tax, String nameOfManufacture, int numOfWorkers) {
        this.nameOfManufacture = nameOfManufacture;
        this.numOfWorkers = numOfWorkers;
        this.marr = marr;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.experience = experience;
        this.salary = salary;
        this.tax = tax;
    }

    public Foreman(boolean marr,String name, String sex, String dateOfBirth, int experience,
                   int salary, int tax) {
        this.nameOfManufacture = nameOfManufacture;
        this.numOfWorkers = 0;
        this.marr=marr=false;
        this.name = "name";
        this.sex = "sex";
        this.dateOfBirth = "dateOfBirth";
        this.experience = 0;
        this.salary = 0;
        this.tax = 0;
    }

    public String getNameOfManufacture() {
        return nameOfManufacture;
    }

    public void setNameOfManufacture(String nameOfManufacture) {
        this.nameOfManufacture = nameOfManufacture;
    }

    public void setMarr(boolean marr) {
        this.marr = marr;
    }

    public int getNumOfWorkers() {
        return numOfWorkers;
    }

    public void setNumOfWorkers(int numOfWorkers) {
        this.numOfWorkers = numOfWorkers;
    }

    @Override
    public String toString() {
        return  "Foreman: " + marr + ";" + nameOfManufacture + ";" + numOfWorkers + " ;" + name + " ;" + sex
                + " ;" + dateOfBirth + " ;" + experience + " ;" + salary + " ;" + tax + ";\n";
    }

    @Override
    public String Write() {
        return toString()+Married();
    }

    public boolean Married(){
        if(marr==true){
            return true;
        }
        else return false;
    }
}

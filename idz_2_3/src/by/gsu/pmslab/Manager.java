package by.gsu.pmslab;
import by.gsu.pmslab.*;

public class Manager implements Employee,WriteInfo{

    private int period;
    private boolean marr;
    private String name;
    private String sex;
    private String dateOfBirth;
    private int experience;
    private int salary;
    private int tax;

    public Manager(boolean marr, int period ,String name, String sex, String dateOfBirth, int experience,
                   int salary, int tax){
        this.period = period;
        this.marr = marr;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.experience = experience;
        this.salary = salary;
        this.tax = tax;

    }

    public Manager(boolean marr, String name, String sex, String dateOfBirth, int experience,
                   int salary, int tax){
        this.period = 0;
        this.marr = false;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.experience = experience;
        this.salary = salary;
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Manager: " + marr + " ;" + period + " ;" + name + " ;" + sex
                + " ;" + dateOfBirth + " ;" + experience + " ;" + salary + " ;" + tax + ";\n";
    }

    @Override
    public String Write() {
        return toString()+Married();
    }

    @Override
    public boolean Married() {
        if(marr==true){
            return true;
        }
        else return false;
    }
}

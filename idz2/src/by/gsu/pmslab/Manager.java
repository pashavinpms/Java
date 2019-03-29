package by.gsu.pmslab;
import by.gsu.pmslab.Employee;

public class Manager extends Employee{

    private int period;

    public Manager(int period){
        super();
        this.period = period = 0;
    }

    public Manager(String name, String sex, String dateOfBirth, int experience,
                   int salary, int tax, int period){
        super(name, sex, dateOfBirth, experience, salary, tax);
        this.period = period;
    }

    public Manager(String name, String sex, String dateOfBirth, int experience,
                   int salary, int tax){
        super(name, sex, dateOfBirth, experience, salary, tax);
        this.period = 0;
    }

    public String writerInfo() {
        return "Manager: \n";
    }

    @Override
    public String infoToString() {
        return super.infoToString()+"; " + period + ";\n";
    }

    @Override
    public String toString() {
        return writerInfo() + infoToString();
    }
}

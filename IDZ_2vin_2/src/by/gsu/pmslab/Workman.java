package by.gsu.pmslab;
import by.gsu.pmslab.Employee;

public class Workman extends Employee{

    private int numOfManufactory;
    private int category;

    public Workman(int numOfManufactory, int category){
        super();
        this.numOfManufactory = numOfManufactory = 0;
        this.category = category = 0;
    }

    public Workman(String name, String sex, String dateOfBirth, int experience,
                   int salary, int tax, int numOfManufactory, int category){
        super(name, sex, dateOfBirth, experience, salary, tax);
        this.numOfManufactory = numOfManufactory;
        this.category = category;
    }

    public Workman(String name, String sex, String dateOfBirth, int experience,
                   int salary, int tax){
        this.numOfManufactory = 0;
        this.category = 0;
    }

    public int getNumOfManufactory() {
        return numOfManufactory;
    }

    public void setNumOfManufactory(int numOfManufactory) {
        this.numOfManufactory = numOfManufactory;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    @Override
    public String infoToString() {
        return super.infoToString() + "; " + numOfManufactory + "; " + category + ";\n";
    }

    @Override
    public void Write() {
        System.out.println("Workman:\n" + infoToString());
    }
}

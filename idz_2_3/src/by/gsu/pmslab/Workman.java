package by.gsu.pmslab;
import by.gsu.pmslab.*;

public abstract class Workman implements Employee,WriteInfo{

    private int numOfManufactory;
    private int category;
    private boolean marr;
    private String name;
    private String sex;
    private String dateOfBirth;
    private int experience;
    private int salary;
    private int tax;

    public Workman(){
        super();
    }

    public Workman(boolean marr, int numOfManufactory, int category, String name, String sex, String dateOfBirth, int experience,
                   int salary, int tax){
        this.numOfManufactory = numOfManufactory;
        this.category = category;
        this.marr = marr;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.experience = experience;
        this.salary = salary;
        this.tax = tax;
    }

    public Workman(int category, String name, String sex, int experience, int salary) {
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public boolean getMarr(){
        return marr;
    }

    public void setMarr(boolean marr) {
        this.marr = marr;
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
    public String toString() {
        return "Workman: " + marr + ";" + numOfManufactory + "; " + category + " ;" + name + " ;" + sex
                + " ;" + dateOfBirth + " ;" + experience + " ;" + salary + " ;" + tax + ";\n";
    }

    @Override
    public String Write() {
        return toString()+Married();
    }

    @Override
    public boolean Married() {
        if (marr == true){
            return true;
        }
        else return false;
    }
}

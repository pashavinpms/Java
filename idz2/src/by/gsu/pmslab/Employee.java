package by.gsu.pmslab;

public class Employee {

    private String name;
    private String sex;
    private String dateOfBirth;
    private int experience;
    private int salary;
    private int tax;

    public Employee(String name, String sex, String dateOfBirth,
                    int experience, int salary, int tax){
        super();
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.experience = experience;
        this.salary = salary;
        this.tax = tax;

    }

    public Employee(){
        super();
    }

    public String getName() {
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

    public String writerInfo() {
        return "Employee: \n";
    }

    public String infoToString(){
        return name + "; " + sex + "; " + dateOfBirth + "; "
                + experience + "; " + salary+";"+tax+";";
    }

    @Override
    public String toString() {
        return writerInfo() + infoToString();
    }
}

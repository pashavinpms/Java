package by.gsu.pmslab;

public class Repairman extends Workman{

    private final String typeOfWorkman = "repairman";

    public Repairman(){
        super();
    }

    public Repairman(boolean marr, int numOfManufactory, int category, String name,
                  String sex, String dateOfBirth, int experience, int salary, int tax, String typeOfWorkman) {
        super(marr, numOfManufactory, category, name, sex, dateOfBirth, experience, salary, tax);
    }

    public Repairman(int category, String name, String sex, int experience, int salary, String typeOfWorkman) {
        super(category,name,sex,experience,salary);
    }

    public String getTypeOfWorkman(){
        return typeOfWorkman;
    }

    @Override
    public String toString() {
        return super.toString() + typeOfWorkman + ";";
    }
}

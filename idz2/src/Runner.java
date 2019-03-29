import by.gsu.pmslab.*;

public class Runner {

    public static void main(String[] args) {

        Employee[] employees = new Employee[8];

        employees[0] = new Workman("Vasya", "man", "24.12.1990", 1200, 1450 , 100, 1, 5);
        employees[1] = new Foreman("Petya", "man", "21.10.1990", 1200, 1350 , 100, "Chips", 20);
        employees[2] = new Manager("Vanya", "man", "22.12.1995", 1200, 2100 , 100, 5);
        employees[3] = new Employee("Sanya", "man", "26.02.1994", 1200, 1900 , 100);
        employees[4] = new Workman("Ann", "woman", "11.11.1991", 1200, 990 , 100, 2, 4);
        employees[5] = new Foreman("Angel", "woman", "04.08.1993", 1200, 1100 , 100, "Beer", 10);
        employees[6] = new Manager("Kate", "woman", "20.06.1995", 1200, 1090 , 100, 4);
        employees[7] = new Employee("Sveta", "woman", "14.04.1996", 1200, 1220 , 100);

        for (int init = 0; init < employees.length; init++){
            System.out.println(employees[init]);
        }
    }
}

import by.gsu.pmslab.*;

public class Runner {

    public static void main(String[] args) {

        Foreman foreman = new Foreman(false, "devops", 14, "ann","woman","10.11.1999", 10, 1750, 40);
        System.out.println(foreman.Write());
        Workman welder = new Welder(false,83,6,"pavel","man","10.10.2000",12,1890,50,"");
        System.out.println(welder.Write());
        Manager manager = new Manager(true, 12, "pol", "man","12.10.1997",12,1900,50);
        System.out.println(manager.Write());
        Workman repairman = new Repairman(false,83,6,"pavel","man","10.10.2000",12,1890,50,"");
        System.out.println(repairman.Write());
    }
}

import by.gsu.pmslab.businesstrip;

public class Runner {

    public static void main(String[] args) {
        businesstrip[] businesstrips = {
                new businesstrip("Sam", 500, 31),
                new businesstrip("Sanya",40,40),
                new businesstrip("Sergey", 1235, 7),
                new businesstrip("Vasya", 12767, 123),
                new businesstrip("Skot", 543, 23),
                new businesstrip("Edik", 8767, 32),
               };
        for (businesstrip item : businesstrips){
            item.show();
            System.out.println();
        }
        businesstrips[5].setTransport(55);
        for (businesstrip item: businesstrips){
            if (item.getDays() > 0 && item.getDays() < 10){
                System.out.println("Duration"+item.getDays());
            }
        }
        for (businesstrip item : businesstrips){
            System.out.println(item);
            System.out.println();
        }
        int sum = 0;
        for (businesstrip item : businesstrips){
            sum += item.getTotal();
        }
        System.out.println("Sum of the total expenses = "+ sum);
        businesstrip max = businesstrips[0];
        for (businesstrip item: businesstrips){
            if (item.getTotal() > max.getTotal()){
                max = item;
            }
        }
        System.out.println("Account with the max total = "+max.getAccount());
    }
}


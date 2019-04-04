import by.gsu.pmslab.BusinessTrip;

public class Runner {

    public final static void main(String[] args) {
        BusinessTrip[] businesstrips = {
                new BusinessTrip("Sam", 500, 31),
                new BusinessTrip("Sanya",40,40),
                new BusinessTrip("Sergey", 1235, 7),
                new BusinessTrip("Vasya", 12767, 123),
                new BusinessTrip("Skot", 543, 23),
                new BusinessTrip("Edik", 8767, 32),
               };
        for (BusinessTrip item : businesstrips){
            item.show();
            System.out.println();
        }
        businesstrips[5].setTransport(55);
        for (BusinessTrip item: businesstrips){
            if (item.getDays() > 0 && item.getDays() < 10){
                System.out.println("Duration"+item.getDays());
            }
        }
        for (BusinessTrip item : businesstrips){
            System.out.println(item);
            System.out.println();
        }
        int sum = 0;
        for (BusinessTrip item : businesstrips){
            sum += item.getTotal();
        }
        System.out.println("Sum of the total expenses = "+ sum);
        BusinessTrip max = businesstrips[0];
        for (BusinessTrip item: businesstrips){
            if (item.getTotal() > max.getTotal()){
                max = item;
            }
        }
        System.out.println("Account with the max total = "+max.getAccount());
    }
}


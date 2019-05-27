import by.gsu.pmslab.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Runner2 {

    private static final String FILE_PATH = "src/file.csv";
    private static final String CUT_EXPRESSION ="crazy";

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new File(FILE_PATH))) {
            int arraySize = scanner.nextInt();
            BusinessTrip[] scannedTrips = new BusinessTrip[arraySize];
            int iterator = 0;
            while (scanner.hasNextLine()){

                String[] line = scanner.nextLine().split(";");
                if (line[0].contains(CUT_EXPRESSION)){
                    iterator--;
                    continue;
                }

                if (line.length > 1){
                    scannedTrips[iterator] = new BusinessTrip(iterator, AccountType.valueOf(line[0].trim().toUpperCase()),
                            Integer.parseInt(line[2].trim()), Integer.parseInt(line[1].trim()));
                }else {
                    scannedTrips[iterator] = new BusinessTrip();
                }
                iterator++;
            }
            System.out.println("\tScanned data:");
            for (BusinessTrip buisnessTrip : scannedTrips){
                System.out.println(buisnessTrip);
            }
            BusinessTrip[] buisnessTrips = cutNullElements(scannedTrips);
            Arrays.sort(buisnessTrips, new Comparator<BusinessTrip>() {
                @Override
                public int compare(BusinessTrip o1, BusinessTrip o2) {
                    return o1.getTotalCost() - o2.getTotalCost();
                }
            });
            System.out.println("\tSorted array:");
            for (BusinessTrip item : buisnessTrips){
                System.out.println(item);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    private static BusinessTrip[] cutNullElements(BusinessTrip[] array){
        List<BusinessTrip> list = new ArrayList<>();
        int nullElements = 0;

        for (BusinessTrip item : array){
            if(item != null){
                list.add(item);
            }else {
                nullElements++;
            }
        }
        return list.toArray(new BusinessTrip[array.length - nullElements]);
    }
}
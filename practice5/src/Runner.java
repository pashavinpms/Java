import by.gsu.pmslab.entity.*;
import by.gsu.pmslab.reader.PurchaseReader;
import by.gsu.pmslab.service.PurchaseService;

import java.util.List;

import static by.gsu.pmslab.util.Printer.*;

public class Runner {

    public static void main(String[] args) {
        PurchaseReader reader = new PurchaseReader("src/", "file", ".csv");
        List<Purchase> purchases = reader.read();
        PurchaseService service = new PurchaseService(purchases);

        printAll(purchases);
        printByIndex(purchases, 6);
        service.removeIf(purchase -> purchase.getPrice().compare(new Byn(100)) < 1);
        service.sort();
        printAll(purchases);
        service.findByPrice(new Byn(350));
    }
}
package by.gsu.pmslab.factory;
import java.util.Scanner;
import by.gsu.pmslab.*;

public class PurchasesFactory {

    private static enum PurchaseKind {
        PURCHASE {
            Purchase getPurchase(Scanner sc) {
                return new Purchase(sc);
            }
        },
        PURCHASE_PRICE_DISCOUNT {
            Purchase getPurchase(Scanner sc) {
                return new PurchasePriceDiscount(sc);
            }
        },
        PURCHASE_PERCENT_DISCOUNT {
            Purchase getPurchase(Scanner sc) {
                return new PurchasePercentDiscount(sc);
            }
        };
        abstract Purchase getPurchase(Scanner sc);
    }
    public static Purchase getPurchaseFromFactory(Scanner sc) {
        String id = sc.next();
        return PurchaseKind.valueOf(id).getPurchase(sc);
    }
}

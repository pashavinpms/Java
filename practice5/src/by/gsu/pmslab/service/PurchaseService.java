package by.gsu.pmslab.service;

import by.gsu.pmslab.entity.*;
import by.gsu.pmslab.util.Printer;

import java.util.*;
import java.util.function.Predicate;

public class PurchaseService {
    private List<Purchase> purchases;

    public PurchaseService(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    public void removeIf(Predicate<Purchase> predicate) {
        purchases.removeIf(predicate);
    }

    public void sort() {
        Collections.sort(purchases);
    }

    public void findByPrice(Byn byn) {
        List<Purchase> copy = new ArrayList<>(purchases);
        Optional<Purchase> result = copy.stream().filter(purchase -> purchase.getPrice().equals(byn)).findAny();
        if (result.isPresent()) {
            Printer.printByIndex(purchases, purchases.indexOf(result.get()));
            return;
        }
        System.out.println("Not found");
    }
}

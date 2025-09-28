package oop.principles.encapsulation;

import java.util.ArrayList;

interface ImplementationHiding {
    Integer sumAllItems();
}

class InformationHiding implements ImplementationHiding {
        private ArrayList items = new ArrayList();

        public ArrayList getItems() {
            return items;
        }

        public void addItem(Integer item) {
            items.add(item);
        }

        public Integer sumAllItems() {
            Integer sum = items.stream().mapToInt(i -> (int) i).sum();
            return sum;
        }

        public InformationHiding() {};

    }

public class Demo1 {
    public static void main(String args[]) {
        InformationHiding ih = new InformationHiding();
        ih.addItem(1);
        ih.addItem(2);
        ih.addItem(3);
        System.out.println(ih.sumAllItems());
    }
}

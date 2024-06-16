import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(0, "PGO"));
        items.add(new Item(1, "PPZI"));
        items.add(new Item(2, "MIK"));
        items.add(new Item(3, "SSW"));
        items.add(new Item(4, "TIF"));
        items.add(new Item(5, "Matematyka"));
        items.add(new Item(6, "TEM"));
        items.add(new Item(7, "ASK"));
        items.add(new Item(8, "ANG"));
        items.add(new Item(9, "Fizyka"));
        items.add(new Item(10, "Bazydanych"));
        items.add(new Item(11, "Francuski"));
        items.add(new Item(12, "Prawo"));
        items.add(new Item(13, "Hiszpanski"));
        items.add(new Item(14, "Marketing"));


        HashSet<Item> itemsSet = new HashSet<>(items.subList(0, 4));

        for (Item item : itemsSet) {
            System.out.println("ID: " + item.id + ", Name: " + item.name);
        }

        for (int i = 0; i < items.size(); i++) {
            items.get(i).show();
        }
        System.out.println("-------");
        HashMap<Integer, String> itemsMap = new HashMap<>();
        for (Item item : items) {
            itemsMap.put(item.id, item.name);
        }

        for (Map.Entry<Integer, String> item : itemsMap.entrySet()) {
            System.out.println("ID: " + item.getKey() + ", Name: " + item.getValue());
        }
        NumberReader numberReader = new NumberReader();
        numberReader.fillArray();
    }
}

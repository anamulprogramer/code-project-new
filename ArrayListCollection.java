import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        // একটি নতুন ArrayList তৈরি করলাম, যেখানে String ডেটা রাখা যাবে
        ArrayList<String> items = new ArrayList<String>(); 

        items.add("red");            // লিস্টে "red" যোগ করলাম
        items.add(0, "yellow");      // index 0-তে "yellow" ঢুকালাম

        // Counter-controlled loop দিয়ে প্রিন্ট
        System.out.print("Display list contents with counter-controlled loop:");
        for (int i = 0; i < items.size(); i++)
            System.out.printf(" %s", items.get(i));

        // enhanced for loop দিয়ে প্রিন্ট
        display(items, "%nDisplay list contents with enhanced for statement:");

        items.add("green");         // শেষে "green" যোগ
        items.add("yellow");        // শেষে আরেকটা "yellow" যোগ
        display(items, "List with two new elements:");

        items.remove("yellow");     // প্রথম "yellow" মুছে ফেলো
        display(items, "Remove first instance of yellow:");

        items.remove(1);            // index 1-এ থাকা উপাদান (green) মুছে ফেলো
        display(items, "Remove second list element (green):");

        // "red" আছে কিনা চেক
        System.out.printf("\"red\" is %sin the list%n", items.contains("red") ? "" : "not ");

        // list-এর সাইজ প্রিন্ট
        System.out.printf("Size: %s%n", items.size());
    }

    // ArrayList-এর উপাদানগুলো প্রিন্ট করার জন্য মেথড
    public static void display(ArrayList<String> items, String header) {
        System.out.printf(header); // হেডার প্রিন্ট করো
        for (String item : items)
            System.out.printf(" %s", item);
        System.out.println();
    }
}

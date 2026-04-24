import java.util.*;
import java.util.stream.Collectors;

// Passenger Bogie class
class PassengerBogie {
    String type;
    int capacity;

    PassengerBogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " (Capacity: " + capacity + ")";
    }

    public String getType() {
    }
}

// Main class (as requested: UC8)
public class UC8 {

    // Filter method using Stream API
    public static List<PassengerBogie> filterBogiesByCapacity(List<PassengerBogie> bogies, int threshold) {

        return bogies.stream()
                .filter(b -> b.capacity > threshold)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        // Create bogie list (reuse from UC7)
        List<PassengerBogie> bogies = new ArrayList<>();

        bogies.add(new PassengerBogie("Sleeper", 72));
        bogies.add(new PassengerBogie("AC Chair", 60));
        bogies.add(new PassengerBogie("First Class", 40));
        bogies.add(new PassengerBogie("Sleeper", 80));
        bogies.add(new PassengerBogie("AC Chair", 75));

        // Apply filter
        int threshold = 70;
        List<PassengerBogie> filteredBogies = filterBogiesByCapacity(bogies, threshold);

        // Output
        System.out.println("Original Bogies:");
        bogies.forEach(System.out::println);

        System.out.println("\nFiltered Bogies (Capacity > " + threshold + "):");
        filteredBogies.forEach(System.out::println);
    }
}
import java.util.Arrays;

public class UC17 {

    public static void main(String[] args) {

        // Bogie type names
        String[] bogieNames = {
                "Sleeper", "AC Chair", "First Class", "General", "Luxury"
        };

        System.out.println("Before Sorting: " + Arrays.toString(bogieNames));

        Arrays.sort(bogieNames);

        System.out.println("After Sorting: " + Arrays.toString(bogieNames));
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class UC20 {

    // ✅ Search method with fail-fast validation
    public static boolean searchBogie(String[] bogieIds, String key) {

        // ❗ Fail-Fast Check
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        // Linear Search (can also plug binary search if sorted)
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] bogieIds = {"BG101","BG205","BG309"};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        try {
            boolean found = searchBogie(bogieIds, key);

            if (found) {
                System.out.println("Bogie ID FOUND");
            } else {
                System.out.println("Bogie ID NOT FOUND");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
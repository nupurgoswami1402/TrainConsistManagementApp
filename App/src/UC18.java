import java.util.Scanner;

public class UC18 {

    // ✅ Linear Search Method
    public static boolean linearSearch(String[] bogieIds, String key) {

        for (String id : bogieIds) {
            if (id.equals(key)) {  // exact match
                return true;       // early termination
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        String[] bogieIds = {"BG101","BG205","BG309","BG412","BG550"};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        boolean found = linearSearch(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID FOUND");
        } else {
            System.out.println("Bogie ID NOT FOUND");
        }
    }
}
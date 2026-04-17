import java.util.regex.*;

public class UC11 {

    // Regex Patterns
    private static final String TRAIN_ID_REGEX = "TRN-\\d{4}";
    private static final String CARGO_CODE_REGEX = "PET-[A-Z]{2}";

    private static final Pattern trainPattern = Pattern.compile(TRAIN_ID_REGEX);
    private static final Pattern cargoPattern = Pattern.compile(CARGO_CODE_REGEX);

    // Validate Train ID
    public static boolean isValidTrainId(String trainId) {
        if (trainId == null || trainId.isEmpty()) return false;
        Matcher matcher = trainPattern.matcher(trainId);
        return matcher.matches();
    }

    // Validate Cargo Code
    public static boolean isValidCargoCode(String cargoCode) {
        if (cargoCode == null || cargoCode.isEmpty()) return false;
        Matcher matcher = cargoPattern.matcher(cargoCode);
        return matcher.matches();
    }

    // Main Method (Console Execution)
    public static void main(String[] args) {

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        if (isValidTrainId(trainId)) {
            System.out.println("Valid Train ID");
        } else {
            System.out.println("Invalid Train ID");
        }

        if (isValidCargoCode(cargoCode)) {
            System.out.println("Valid Cargo Code");
        } else {
            System.out.println("Invalid Cargo Code");
        }
    }
}
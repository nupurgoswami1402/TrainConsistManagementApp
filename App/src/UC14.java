public class UC14 {

    public static void main(String[] args) {

        try {
            // ✅ Valid Bogie
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Bogie Created: " + b1.getType() + " - " + b1.getCapacity());

            // ❌ Invalid Bogie (Exception Case)
            PassengerBogie b2 = new PassengerBogie("AC Chair", 0);
            System.out.println("Bogie Created: " + b2.getType());

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
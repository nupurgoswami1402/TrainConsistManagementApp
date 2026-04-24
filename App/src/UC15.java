public class UC15 {

    public static void main(String[] args) {

        // Bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        b1.assignCargo("Petroleum");

        b2.assignCargo("Petroleum");


        b2.assignCargo("Coal");

        System.out.println("Program continues safely...");
    }
}
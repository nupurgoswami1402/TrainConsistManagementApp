public class UC9 {
    private String type;   // Sleeper, AC Chair, First Class, Rectangular, Cylindrical

    public UC9(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Bogie{" + "type='" + type + '\'' + '}';
    }
}
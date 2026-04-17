public class UC10 {
    private String type;
    private int capacity; // seating capacity

    public UC10(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Bogie{" +
                "type='" + type + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
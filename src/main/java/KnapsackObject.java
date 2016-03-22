/**
 * Created by Kacper Wiszczuk on 17.03.16.
 *
 * KnapsackObject stores information about item that is going to be checked by algorithm
 */
public class KnapsackObject {

    private int id;
    private int value;
    private int capacity;

    public KnapsackObject(int capacity, int value, int id) {
        this.capacity = capacity;
        this.value = value;
        this.id = id;
    }

    public int getCapacity() {return capacity;}

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}
}

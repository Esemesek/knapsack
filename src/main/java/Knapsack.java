import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Kacper Wiszczuk on 15.03.16.
 *
 * Knapsack class solves problem of knapsack problem with chosen algorithm
 */
public class Knapsack {

    private KnapsackAlgorithm algorithm;
    private String path;
    private int size;

    private ArrayList<KnapsackObject> resultArray;
    private int capacityUsed;
    private int totalValue;

    public Knapsack(KnapsackAlgorithm algorithm,String path, int size){
        this.algorithm = algorithm;
        this.path = path;
        this.size = size;
    }

    /**
     *
     * Function is solving knapsack problem
     *
     * @throws IOException
     */
    public void execute() throws IOException {
        totalValue = 0;
        capacityUsed = 0;

        FileLoader fileLoader = new FileLoader(path);
        resultArray = algorithm.execute(fileLoader.loadData(),size);

        for(KnapsackObject k : resultArray){
            totalValue+=k.getValue();
            capacityUsed+=k.getCapacity();
        }
    }

    public int getTotalValue() {
        return totalValue;
    }

    public int getCapacityUsed() {
        return capacityUsed;
    }

    public ArrayList<KnapsackObject> getResultArray() {
        return resultArray;
    }
}

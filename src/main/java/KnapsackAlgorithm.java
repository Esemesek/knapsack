import java.util.ArrayList;

/**
 * Created by kacper on 17.03.16.
 *
 */
public abstract class KnapsackAlgorithm {
    /**
     *
     * @param data - List with data about objects
     * @return ArrayList with result
     */
    abstract ArrayList<KnapsackObject> execute(ArrayList<KnapsackObject> data, int size);
}

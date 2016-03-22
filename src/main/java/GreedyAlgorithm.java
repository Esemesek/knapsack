import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Kacper Wiszczuk on 17.03.16.
 *
 */
public class GreedyAlgorithm extends KnapsackAlgorithm {

    Comparator<KnapsackObject> comparator = new Comparator<KnapsackObject>() {
        public int compare(KnapsackObject o1, KnapsackObject o2) {
            return ( ( o2.getValue() / o2.getCapacity() ) - ( o1.getValue() / o1.getCapacity() ) );
        }
    };


    @Override
    ArrayList<KnapsackObject> execute(ArrayList<KnapsackObject> data, int size) {

        ArrayList<KnapsackObject> result = new ArrayList<KnapsackObject>();

        data.sort(comparator);

        for(KnapsackObject k : data){
            if(size >= k.getCapacity()){
                result.add(k);
                size-=k.getCapacity();
            }
        }

        return result;
    }
}

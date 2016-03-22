import java.io.IOException;

/**
 * Created by Kacper Wiszczuk on 15.03.16.
 *
 */
public class Main {

    public static void main(String[] args){


        KnapsackAlgorithm knapsackAlgorithm = new GreedyAlgorithm();
        Knapsack knapsack = new Knapsack(knapsackAlgorithm,"src/main/resources/data.csv",100);
        try {
            knapsack.execute();

            for(KnapsackObject k : knapsack.getResultArray()){
                System.out.println(k.getValue() + " " + k.getCapacity());
            }

            System.out.println("Total value of all items:" + knapsack.getTotalValue());
            System.out.println("Total capacity used:" + knapsack.getCapacityUsed());


        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Kacper Wiszczuk on 17.03.16.
 *
 * FileLoader is creating ArrayList of KnapsackObjects which is used by algorithm
 */
public class FileLoader {
    String path;
    String split = ";";

    FileLoader(String path){
        this.path = path;
    }

    /**
     *
     * @return ArrayList of loaded KnapsackObjects
     * @throws IOException
     */
    public ArrayList<KnapsackObject> loadData() throws IOException {

        ArrayList<KnapsackObject> knapsackObjectList = new ArrayList<KnapsackObject>();
        BufferedReader buff = new BufferedReader(new FileReader(path));

        //First line with column labels
        String line = buff.readLine();

        while((line = buff.readLine()) != null){

            String[] temp = line.split(split);
            knapsackObjectList.add(new KnapsackObject(Integer.parseInt(temp[1]),
                    Integer.parseInt(temp[2]),
                    Integer.parseInt(temp[0])));
        }

        buff.close();

        return knapsackObjectList;
    }


}

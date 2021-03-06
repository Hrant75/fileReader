package readers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by Hrant on 3/25/2017.
 */
public class NLSVReader extends Reader {
    private String filename;

    public NLSVReader(String fileName){
        this.filename = fileName;
    }

    public int[] readFile() throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        ArrayList<Integer> array = new ArrayList<>();

        while ((line = reader.readLine()) != null){
            array.add(Integer.parseInt(line));
        }
        reader.close();
        int[] newArray = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            newArray[i] = array.get(i);
        }
        return newArray;
    }
}

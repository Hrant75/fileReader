import actions.Action1;
import actions.Action2;
import actions.Action3;
import readers.Reader;
import readers.CSVReader;
import readers.NLSVReader;
import readers.TSVReader;

import java.util.Scanner;

/**
 * Created by Hrant on 3/25/2017.
 */
public class Client {

    public void start() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input File Name(1.scv, 2.tsv, 3.nlsv):");
        Reader reader = fileReader(scanner.nextLine());

        System.out.println("Input Action Type(1 for sum, 2 for average or 3):");
        actionType(scanner.nextInt(), reader.readFile());
    }

    private Reader fileReader(String fileName) throws Exception{
        switch (getExtension(fileName)){
            case "csv": return new CSVReader(fileName);
            case "tsv": return new TSVReader(fileName);
            case "nlsv": return new NLSVReader(fileName);
        }
        return null;
    }

    private String getExtension(String fileName){
        return fileName.substring(fileName.lastIndexOf('.')+1);
    }

    private void actionType(int type, int[] array){
        switch (type) {
            case 1: new Action1(array);
                    break;
            case 2: new Action2(array);
                    break;
            case 3: new Action3(array);
                    break;
        }
    }
}

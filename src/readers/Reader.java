package readers;

/**
 * Created by Hrant on 3/25/2017.
 */
public abstract class Reader{
    private String fileName;

    Reader(){}

    public abstract int[] readFile() throws Exception;

}

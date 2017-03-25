package actions;

/**
 * Created by Hrant on 3/26/2017.
 */
public class Action1 extends Action{
    public Action1(int[] array){
        this.array = array;
        calculate();
    }

    public void calculate(){
        int sum = 0;
        for (int element : array)
            sum += element;
        System.out.println("Sum of all elements = " + sum);
    }
}

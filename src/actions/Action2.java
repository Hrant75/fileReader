package actions;

/**
 * Created by Hrant on 3/26/2017.
 */
public class Action2 extends Action{
    public Action2(int[] array){
        this.array = array;
        calculate();
    }

    public void calculate(){
        int sumOfFirstHalf = 0;
        int sumOfSecondHalf = 0;
        for (int i = 0; i < array.length; i++) {
            if(i <= array.length / 2) sumOfFirstHalf += array[i];
            else sumOfSecondHalf += array[i];
        }
        int difference = sumOfFirstHalf - sumOfSecondHalf;
        System.out.println("Difference of first half and second half of numbers is: " + difference);
    }
}

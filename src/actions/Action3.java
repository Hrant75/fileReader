package actions;

/**
 * Created by Hrant on 3/26/2017.
 */
public class Action3 extends Action{
    public Action3(int[] array){
        this.array = array;
        calculate();
    }

    public void calculate(){
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if(isEven(array[i])) sumOfEvenNumbers += array[i];
            else sumOfOddNumbers += array[i];
        }
        System.out.println("Sum of Even numbers is: " + sumOfEvenNumbers);
        System.out.println("Sum of Odd numbers is: " + sumOfOddNumbers);
    }

    private boolean isEven(int number){
        if(number % 2 == 0) return true;
        else return false;
    }
}

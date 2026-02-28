
import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
        
        int[] inputs={4,2,5,5,8,9,2,5,3,1};
        BubbleSort testBubble=new BubbleSort(inputs);
        testBubble.bubbleSortAsc();
        
        System.out.println(Arrays.toString(inputs));

        }
}

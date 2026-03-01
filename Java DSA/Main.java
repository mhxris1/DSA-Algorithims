
import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
        
        int[] testAsc={4,2,5,5,8,9,2,5,3,1}; 
        int[] testDsc={9,9,8,3,9,7,5,3,4,1};

        /*

        BUBBLE SORT:
        
        BubbleSort bubbleSortAsc = new BubbleSort(testAsc);
        BubbleSort bubbleSortDsc = new BubbleSort(testDsc);

        bubbleSortAsc.bubbleSortAsc();
        bubbleSortDsc.bubbleSortDsc();

        */

       SelectionSort selectionSortAsc = new SelectionSort(testAsc);
       selectionSortAsc.selectionSortAsc();

       SelectionSort selectionSortDsc = new SelectionSort(testDsc);
       selectionSortDsc.selectionSortDsc();
               
        System.out.println(Arrays.toString(testAsc));
        System.out.println(Arrays.toString(testDsc));

        }
}

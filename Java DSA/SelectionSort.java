public class SelectionSort {

    private final int[] inputs;

    public SelectionSort(int[] inputs){
        this.inputs=inputs;

    }

   public int[] selectionSortAsc() {

    int arrayLength=inputs.length;

    int counter = 0;

    while(counter<(arrayLength-1)) {

        int min = inputs[counter];
        int swapIndex = counter;

        for(int i=(counter+1);i<arrayLength;i++) {

            if(inputs[i]<=min) {

                min = inputs[i];
                swapIndex =i;
            }
        }

        inputs[swapIndex]=inputs[counter];
        inputs[counter]=min;
        counter++;
    }

    return inputs;
    }

    public int[] selectionSortDsc() {

    int arrayLength=inputs.length;

    int counter = 0;

    while(counter<arrayLength) {

        int max = inputs[counter];
        int swapIndex = counter;

        for(int i=(counter+1);i<arrayLength;i++) {

            if(inputs[i]>=max) {

                max = inputs[i];
                swapIndex =i;
            }
        }

        inputs[swapIndex]=inputs[counter];
        inputs[counter]=max;
        counter++;
    }

    return inputs;
    }



   }

   






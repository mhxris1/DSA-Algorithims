public class BubbleSort{

    private final int[] inputs;

    public BubbleSort(int[] inputs){
        this.inputs=inputs;

    }

    public int[] bubbleSortAsc(){
        int arrayLength= (inputs.length)-1;
        boolean sorted = false;

        while(!sorted){
            int swaps=0;

            for(int i=0;i<arrayLength;i++){

                if(inputs[i]>inputs[i+1]){
                    swaps++;
                    int placeHolder = inputs[i];
                    inputs[i]=inputs[i+1];
                    inputs[i+1]=placeHolder;
                }
            }
            if(swaps==0){
                    sorted=true;
                }

        }

        return inputs;
    }

    public int[] bubbleSortDsc(){
        int arrayLength= (inputs.length)-1;
        boolean sorted = false;

        while(!sorted){
            int swaps=0;

            for(int i=0;i<arrayLength;i++){

                if(inputs[i]<inputs[i+1]){
                    swaps++;
                    int placeHolder = inputs[i];
                    inputs[i]=inputs[i+1];
                    inputs[i+1]=placeHolder;
                }
            }
            if(swaps==0){
                    sorted=true;
                }

        }

        return inputs;
    }
}
public class MergeSort {

    private final int[] inputs;

    public MergeSort(int[] inputs){
        this.inputs=inputs;

    }

    public int[] mergeSortAsc() {

        return mergeSort(inputs,0,inputs.length);
    }

    public int[] mergeSort(int[] arr, int left, int right) {

        if(right-left>1) {

            int mid = (left+right)/2;
            return mergeAsc(mergeSort(arr, left, mid),mergeSort(arr, mid, right));
        }

        else if(right-left==1) {

            return new int[] {arr[left]};
        }

        else {

            return new int[] {};
        }
    }

    public int[] mergeAsc(int[] a,int[] b) {
        int tempLength = a.length + b.length;
        int[] temp = new int[tempLength];
        int i = 0;
        int j = 0;

        while(i<a.length && j<b.length) {

            if(a[i]<=b[j]) {

                temp[i+j]=a[i];
                i++;
            }

            else {
                temp[i+j]=b[j];
                j++;
            }
        }

        if(i==a.length) {
            while (j<b.length) {
                temp[i+j] = b[j];
                j++;
            }
        }

        else {
            while(i<a.length)  {
                temp[i+j]=a[i];
                i++;
            }      
        }

        return temp;

    }
}
   
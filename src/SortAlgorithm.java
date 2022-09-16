public class SortAlgorithm {
    public static void main(String[] args) {
        int[] intArray = {15, 30, 3, 3, -55, 4, -3, -1};
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray [firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i>0 && intArray[i-1] > newElement; i--){
                intArray[i] = intArray [i - 1];
            }
            intArray[i] = newElement;
        }
        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}

//Insertion Sort has the best runtime efficiency.Best case is the function which performs the minimum number of steps on input data of n elements.
// Worst case is the function which performs the maximum number of steps on input data of size n.
// Average case is the function which performs an average number of steps on input data of n elements.
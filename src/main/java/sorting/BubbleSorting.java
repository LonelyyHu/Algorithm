package sorting;

/**
 * Created by hulonelyy on 2017/12/8.
 */
public class BubbleSorting {

    public static void main(String[] args) {

        int[] srcArray = {12,81,57,77,67,54,1,56,44,35};

        InsertionSorting.printArray(srcArray);

        for (int i = 0; i < srcArray.length; i++) {

            boolean done = true;

            for (int j = 0; j < srcArray.length - 1 ; j++) {

                if (srcArray[j] > srcArray[j+1]) {
                    int tmp = srcArray[j];
                    srcArray[j] = srcArray[j+1];
                    srcArray[j+1] = tmp;

                    done = false;
                }

            }

            if (done) {
                break;
            }

        }

        InsertionSorting.printArray(srcArray);

    }

}

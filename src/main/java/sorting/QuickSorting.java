package sorting;

/**
 * Created by hulonelyy on 2017/12/8.
 */
public class QuickSorting {

    public static void main(String[] args) {

        int[] srcArray = {12,81,57,77,67,54,1,56,44,35};

        InsertionSorting.printArray(srcArray);

        int left = 0;
        int right = srcArray.length - 1;

        sort(srcArray, left, right);

        InsertionSorting.printArray(srcArray);
    }

    private static void sort(int[] valueArray, int left, int right) {

        if (left < right) {
            int p = partition(valueArray, left, right);
            sort(valueArray, left, p-1);
            sort(valueArray, p+1, right);
        }

    }

    private static int partition(int[] valueArray, int left, int right) {

        int wall = left - 1;

        for (int i = left; i < right; i++) {

            if(valueArray[i] <= valueArray[right]) {
                wall++;
                swap(valueArray, wall, i);
            }

        }

        swap(valueArray, wall+1, right);
        return wall+1;

    }

    private static void swap(int[] valueArray, int i, int j) {

        int tmp = valueArray[i];
        valueArray[i] = valueArray[j];
        valueArray[j] = tmp;

    }


}

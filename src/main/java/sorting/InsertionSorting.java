package sorting;

/**
 * Created by hulonelyy on 2017/12/8.
 */
public class InsertionSorting {

    public static void main(String[] args) {

        int[] srcArray = {32,30,28,5,83,41,86,65,39,36};

        printArray(srcArray);

        for (int i = 0; i < srcArray.length; i++) {

            int tVal = srcArray[i];

            for (int j = i - 1; j >= 0; j--) {

                if (srcArray[j] < tVal) {
                    break;
                }

                srcArray[j+1] = srcArray[j];
                srcArray[j] = tVal;

            }

        }

        printArray(srcArray);

    }

    public static void printArray(int[] srcArray) {

        System.out.println("Size:" + srcArray.length);

        for (int i = 0; i < srcArray.length; i++) {
            System.out.print(srcArray[i]+",");
        }

        System.out.println("\n-----");
    }


}

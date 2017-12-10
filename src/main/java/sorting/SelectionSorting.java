package sorting;

/**
 * Created by hulonelyy on 2017/12/8.
 */
public class SelectionSorting {

    public static void main(String[] args) {

        int[] srcArray = {32,30,28,5,83,41,86,65,39,36};


        for (int i = 0; i < srcArray.length; i++) {

            int min = i;

            for (int j = i+1; j < srcArray.length; j++) {

                if (srcArray[j] < srcArray[min]) {
                    min = j;
                }

            }

            if (min != i) {

                int mValue = srcArray[i];
                srcArray[i] = srcArray[min];
                srcArray[min] = mValue;

            }

        }


        printArray(srcArray);


    }

    private static void printArray(int[] srcArray) {

        System.out.println("Size:" + srcArray.length);

        for (int i = 0; i < srcArray.length; i++) {
            System.out.print(srcArray[i]+",");
        }

        System.out.println("-----");
    }


}

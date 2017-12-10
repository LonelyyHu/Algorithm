package leetCode;

public class LowerBound {

    public static void main(String[] args) {

        int[] sortedAry = {1,2,3,4,7,8,9,10};
        int tar = 6;

//        int idx = lowerBound(sortedAry, tar);
//        System.out.println("idx:"+idx);
//        System.out.println("value:"+sortedAry[idx]);

        int idx1 = upperBound(sortedAry, tar);
        System.out.println("idx:"+idx1);
        System.out.println("value:"+sortedAry[idx1]);

    }

    public static int lowerBound(int[] sortedNums, int target) {

        int low = 0;
        int high = sortedNums.length-1;

        while (low<high) {

            System.out.println("low:"+low);
            System.out.println("high:"+high);

            int mid = (high+low)/2;

            if (sortedNums[mid] == target) {
                return mid;
            } else if (sortedNums[mid]<target) {
                low = mid+1;
            } else {
                high = mid;
            }

        }

        return low;

    }

    public static int upperBound(int[] sortedNums, int target) {

        int low = 0;
        int high = sortedNums.length-1;

        while (low<high) {

            System.out.println("low:"+low);
            System.out.println("high:"+high);

            int mid = (high+low)/2+1;

            if (sortedNums[mid] == target) {
                return mid;
            } else if (sortedNums[mid]<target) {
                low = mid;
            } else {
                high = mid - 1;
            }

        }

        return low;

    }

}

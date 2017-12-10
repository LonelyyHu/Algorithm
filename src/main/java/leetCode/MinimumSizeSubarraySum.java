package leetCode;

public class MinimumSizeSubarraySum {

    public static void main(String[] args) {

//        int[] numsAry = {2,3,1,2,4,3};
//        int sumTrget = 7;

//        int[] numsAry = {1,2,3,4,5};
//        int sumTrget = 15;

//        int[] numsAry = {10,2,3};
//        int sumTrget = 6;

        int[] numsAry = {1,4,4};
        int sumTrget = 4;

        System.out.println("min length:"+minSubArrayLen(sumTrget, numsAry));

    }

    public static int minSubArrayLen(int s, int[] nums) {

        int minLeng = -1;

        for (int i = 0; i < nums.length; i++) {

            int sum = nums[i];

            if (sum >= s) {
                minLeng = 1;
                break;
            }

            for (int j = i+1; j < nums.length; j++) {

                sum = sum + nums[j];

                if (sum >= s) {

                    int leng = j-i+1;

                    if (minLeng == -1 || leng < minLeng) {
                        System.out.println(String.format("set min length %s for i:%s, j:%s", leng, i, j));
                        minLeng = leng;
                    }

                    break;

                }

            }

        }

        return minLeng==-1?0:minLeng;
    }

    public static int minSubArrayLen2(int s, int[] nums) {

        int minLeng = -1;

        if (nums.length < 1) {
            return 0;
        }

        int[] sumAry = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            if (i == 0) {
                sumAry[i] = nums[i];
            } else {
                sumAry[i] = sumAry[i-1] + nums[i];
            }

            if (sumAry[i] >= s) {

                int leng = i + 1;

                if (minLeng == -1 || leng < minLeng) {
                    minLeng = leng;
                    System.out.println(String.format("set min length %s", leng));
                }


            }
        }

        for (int i = 0; i < sumAry.length; i++) {
            System.out.println("sumAry i"+i+":"+sumAry[i]);
        }

        for (int i = 1; i < sumAry.length; i++) {

            int val = sumAry[i-1] + s;
            int lb = LowerBound.lowerBound(sumAry,val);

            if (sumAry[lb] < val) {
                break;
            }

            int leng = lb - i + 1;

            if (minLeng == -1 || leng < minLeng) {

                System.out.println(String.format("set min length %s for i:%s, j:%s", leng, i, lb));

                minLeng = leng;
            }

        }


        return minLeng == -1 ? 0 : minLeng;
    }

}

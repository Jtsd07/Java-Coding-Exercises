import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {


        for(int i = 0; i < nums.length; i++ ){
            for(int x = i + 1; x < nums.length; x++ ){

                int sum = nums[i] + nums [x];

                if( nums[i] + nums [x] == target){


                    return new int[]{i, x};
                }


            }

        }

        return new int[]{};


    }



    public static void main (String [] args){


        Scanner input = new Scanner(System.in);


        int[] nums = new int[4];


        System.out.print("Input nums = ");

        for(int num = 0; num < nums.length; num++){
            nums[num] = input.nextInt();
        }

        System.out.println("Input nums = " + Arrays.toString(nums) + " ");

        System.out.println("Input: target = ");
        int target = input.nextInt();

       Solution solution = new Solution();

        int[] result = solution.twoSum(nums, target);

        System.out.println("Input nums = " + Arrays.toString(nums) + ", " + "target = " + target);
        System.out.print("OUTPUT: " + Arrays.toString(result));
    }




}
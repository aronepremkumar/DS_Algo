package Search;

public class BinarySearchIteration {

    public static int binarySearch(int[] nums, int target){
        int index = -1;
        int left = 0;
        int right = nums.length-1;


        while(left <= right){
            // the pointers have not crossed. This is the limit
            int mid = (left + (right) )/ 2 ; // to prevent overflows
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){ //if the mid is less than target
                left = mid +1;
            }else{
                //if the mid is greater than the target
                right = mid - 1;
            }
        }
        return index;
    }


    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 9;
        //int[] nums = {-1,0,2,4,6,8};
        //int target = 4;


        int result = binarySearch(nums, target);
        System.out.println("Target " + target + " found at index: " + result);

    }
}

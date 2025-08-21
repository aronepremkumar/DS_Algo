package Search;

public class BinarySearchRecursion {

    public static int binarySearch(int[] nums, int target, int left, int right){
        int index = -1;
        if(left > right)
            return -1;
        int mid = (right + left)/2;
        if(nums[mid] == target){
            return mid;
        }else if(target>nums[mid]){
            left = mid + 1;
            return binarySearch(nums, target, left, right);
        }else{
            right = mid - 1;
            return binarySearch(nums,target,left,right);
        }
    }

    public static void main(String[] args) {
        //int[] nums = {1, 3, 5, 7, 9, 11, 13, 15};
        //int target = 9;
        int[] nums = {-1,0,2,4,6,8};
        int target = 4;
        int left = 0;
        int right = nums.length - 1;
        int index = binarySearch(nums,target,left,right);
        System.out.println("Target is found in the index "+index);
    }
}

public class leetCode704 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while(left < right){
            int middle = left + ((right - left)>>1);
            if(nums[middle] > target){
                //in left area
                right = middle;
            }else if(nums[middle] == target){
                return middle;
            }else if(nums[middle] < target){
                //in right area
                left = middle+1;
            }
        }
        return -1;
    }
}

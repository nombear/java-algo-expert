class Solution {
    public int removeDuplicates(int[] nums) {
        int valid = 0;
        for(int n = 1; n<nums.length; n++){
            //if there is not a match then update the next corresponding entry with the valid item
           if(nums[n] != nums[valid]){
               // move your counter up one and set it equal to a number in advance
               valid +=1;
               nums[valid] = nums[n];
           }
        }
        return valid +1;
    }
}

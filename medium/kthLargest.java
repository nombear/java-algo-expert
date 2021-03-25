class Solution {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> temp = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.sort(temp);
        return temp.get(nums.length-k);
    }
}

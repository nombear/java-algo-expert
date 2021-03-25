class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer,Integer> frequency = new HashMap<>();
        for(int item: nums){
            if(null == frequency.get(item)){
                frequency.put(item,1);
            }
            else{
                int temp = frequency.get(item);
                frequency.replace(item,temp+1);
            }
        }
        int x =0;
        while(x != k){
            int max = Collections.max(frequency.entrySet(),Map.Entry.comparingByValue()).getKey();
            frequency.remove(max);
            result[x] = max;
            x +=1;
        }
         return result;
    }
}

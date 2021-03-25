class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
        //how do you shuffle each set of ints
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        addArray(0,nums,result);
        return result;
    }

    public void addArray(int pivot, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> result){
        if(pivot == arr.length -1){
            result.add(arr;
        }
        else{
            for(j = pivot ; j<arr.length; j++){
                swap(arr, pivot, j);
                addArray(index+1, arr, result);
                swap(arr,pivot, j);
            }
        }
    }

    public void swap(int left, int right, ArrayList<Integer> arr){
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }
}

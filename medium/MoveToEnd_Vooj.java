/*
PROBLEM:
Given array and elem, move all instances of elem to end without using extra space.

EXAMPLE:
[2,1,2,2,2,3,4,2] -> [1,3,4,2,2,2,2,2] (1,3 & 4 can be in any order)

SOLUTION:
1. using pointers -> time : O(n) | space : O(1)
*/

// not right
class Solution{

  public int[] moveToEnd(int target, int[] input){
    for(int x =0; x<input.length-1;x++){
      if(input[x] == target){
        int tempForward = input[x+1];
        input[x+1] = input[x];
        input[x] = tempForward;
      }
      if(input[input.length-x-2] == target){
        int tempReverse = input[input.length-x-1];
        input [input.length-x-1] = input[input.length-x-1];
        input[input.length-x-2] = tempReverse;
      }
    }
    return input;
  }

}

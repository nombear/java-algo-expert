class Solution{

//recursive implemntation assuming sorted list
  int binarySearch(int[] array, int item){
    // do something
    int midpoint = array[array.length / 2];
    if(midpoint == item){
      return item;
    }
    else if(item > midpoint){
      binarySearch(Arrays.subArray(array,array.length/2 , array.length -1));
    }
    else if(item< midpoint){
      binarySearch(Arrays.subArray(arra, 0, array.length/2));
    }
    else{
      return -1;
    }
  }
}

/*issues w/ my solution

- not very space efficient....
- right implementation for the most part



*/

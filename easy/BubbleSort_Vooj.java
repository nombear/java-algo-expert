class BubbleSortImpl{

  void bubbleSort(int[] inputArray){
    for(int x=0; x<inputArray.length; x++){
      //placeholder to do swap
      int temp = 0;
      if(inputArray[x]>inputArray[x+1]){
        temp = inputArray[x];
        inputArray[x] = inputArray[x+1];
        inputArray[x+1] = temp;
      }
    }
  }
}

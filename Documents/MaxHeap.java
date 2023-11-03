public class MaxHeap {

   private int[] heap;
   private int size;
   
   public MaxHeap(){
      heap = new int[100];
      size = 0;
   }

   public void add (int v){
      int index = size + 1;         //index where we'll add the new value
      heap[index] = v;              //add value at that position
            
      while ( index > 1 ) {                     //while our value has parents
         int parentIndex = index / 2;           //get parent index by dividing by 2
         if(heap[parentIndex] < v) {            //if parent's value is lower
            heap[index] = heap[parentIndex];    //perform swap
            heap[parentIndex] = v;     
            
            index = parentIndex;                //update index after swap
         }else{                     //no swap needed         
            break;         
         }
      }
         
      size ++;                      //increase size
         
   }
   
   public int remove (){
      int rootValue = heap[1];      //store root value to be returned at the end
      int v = heap[size];           //grab value from last node in the heap
      heap[1] = v;                  //put value at the root
      heap[size] = 0;               //simulates deleting the last node in the heap
      int index = 1;                //index of value starts at root
      
      while (index * 2 < size) {    //while there are children of pos index
         int leftIndex = index * 2;
         int rightIndex = leftIndex + 1;
         
         int leftValue = heap[leftIndex];
         int rightValue = v;              //assign temp value to right child that would never cause a swap
                                          //we do this in case there's not a right child
                                    
         if(rightIndex < size){           //is there a right child
            rightValue = heap[rightIndex];//assign actual value of right child instead of v
         }
         
         int maxChild, maxIndex;
         
         if(leftValue > rightValue){      //determine the larger of the two children
            maxChild = leftValue;
            maxIndex = leftIndex;
         }else{
            maxChild = rightValue;
            maxIndex = rightIndex;
         }
         
         if(maxChild > v){                //is the larger child bigger than our value -> swap
            heap[maxIndex] = v;           //swap value with larger child
            heap[index] = maxChild;
            index = maxIndex;
         }else{                           //no children are greater -> stop
            break;
         }
      
      }
      
      size --;                      //update size
      return rootValue;             //return stored root value
   
   }
}
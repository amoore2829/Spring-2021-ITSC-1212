public class MaxHeapDriver{
   public static void main(String[] args){
   
      MaxHeap heap = new MaxHeap ();
      
      heap.add (10);
      heap.add (15);
      heap.add (12);
      heap.add (17);
      heap.remove ();
      heap.add (10);
      heap.add (14);
      heap.add (500);
      heap.add (1);
      heap.add (222);
      heap.remove ();
      heap.add (75);
      heap.add (96);
      heap.add (3);
      heap.add (46);
      heap.add (0);
      heap.add (-1);
      heap.remove ();
      heap.remove ();      
      heap.remove ();
   }
}   

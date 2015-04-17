import java.util.Arrays;

/**
   This program demonstrates the merge sort algorithm by
   sorting an array that is filled with random numbers.
*/
public class MergeSortDemo
{  
   public static void main(String[] args)
   {  
      String[] a = {"this", "is", "a", "random", "string"};
      System.out.println(Arrays.toString(a));

      MergeSorter.sort(a);

      System.out.println(Arrays.toString(a));
   }
}


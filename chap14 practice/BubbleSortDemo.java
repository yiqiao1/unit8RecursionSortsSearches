import java.util.Arrays;

/**
   This program demonstrates the bubble sort algorithm by
   sorting an array that is filled with random numbers.
*/
public class BubbleSortDemo
{  
   public static void main(String[] args)
   {  
      int[] a = ArrayUtil.randomIntArray(20, 100);
      System.out.println(Arrays.toString(a));

      BubbleSorter.sort(a);

      System.out.println(Arrays.toString(a));
   }
}


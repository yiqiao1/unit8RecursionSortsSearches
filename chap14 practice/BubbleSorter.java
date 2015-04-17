public class BubbleSorter
{
    public static void sort(int[] a)
    {
        boolean sorted = false;
        
        while (!sorted)
        {
            for (int i = 0; i < a.length - 2; i++)
            {
                for (int j = 1; j < a.length - 1; j++)
                {
                    if (a[i] > a[j])
                    {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            
        }
    }
}

import java.util.ArrayList;

public class ListMethodsRunner
{
   public static void main(String[] args)
   {
      ArrayList<Integer> tempList = ListMethods.makeList(5);
      
      if (tempList.size() == 0)
      {
          System.out.println("The list is empty");
      }
      else
      {
         for (Integer i : tempList)
         {
            System.out.println(i);
         }
      }
      
      ArrayList<Integer> list = new ArrayList<Integer>();
      for (int i = 0; i < 100; i++)
      {
          list.add(i);
      }
      
      for (Integer i : ListMethods.reverseList(list, 0))
      {
          System.out.println(i);
      }
   }
}
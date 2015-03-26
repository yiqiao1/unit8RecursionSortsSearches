import java.util.*;

public class ListMethods
{
   public static ArrayList<Integer> makeList(int n)
   {
      ArrayList<Integer> tempList = new ArrayList<Integer>();
      
      if (n <= 0)  // The smallest list we can make
      {
          return tempList;
      }
      else        // All other size lists are created here
      {
          makeList(n-1, tempList);
          tempList.add(n);
      }
      
      return tempList;
   }
    
   public static ArrayList<Integer> makeList(int n, ArrayList<Integer> temp)
   {
      ArrayList<Integer> tempList = temp;
      
      if (n <= 0)  // The smallest list we can make
      {
          return tempList;
      }
      else        // All other size lists are created here
      {
          makeList(n-1, tempList);
          tempList.add(n);
      }
      
      return tempList;
   }
   
   public static ArrayList<Integer> reverseList(ArrayList<Integer> tList, int num) 
   {
       ArrayList<Integer> list = ListMethods.deepClone(tList); 
       
       if (list.size() <= 1)
       {
           return list;
       }
       else
       {
           int temp = list.get(0);
           list.remove(0);
           reverseList(list, temp);
           list.add(num);
       }
       
       return list;
   }
   
   public static ArrayList<Integer> deepClone(ArrayList<Integer> tList)
   {
       ArrayList<Integer> list = new ArrayList<Integer>(); 
       
       for (Integer i : tList)
       {
           list.add(new Integer(i));
       }
       
       return list;
   }
}
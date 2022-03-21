import java.util.*;
public class k_smallest_elements{
    public static void main(String[] args){
      Integer arr[]= new Integer[]{2,4,7,15,34,3,5};
      int k= 3;
          System.out.println("Original Array: ");
          System.out.println(Arrays.toString(arr));
          System.out.println(k + "smallest elements of the above array are: ");
      Arrays.sort(arr);
      for (int i=0;i<k;i++)
      System.out.println(arr[i]+ " ");
    }
}

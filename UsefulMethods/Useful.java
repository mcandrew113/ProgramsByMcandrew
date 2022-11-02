package UsefulMethods;
/**
*@class useful
*{@link} 
*
 * <p>This class contains practice methods outside of class scope
 * probably would be good to save these before I forget so why not</p>
 */
public class Useful {
    /**
     * copy an array's values and return it
     * @param arr
     * @return a copy of the parameter array given outside the method
     */
    public int [] display(int [] arr){
      arr = new int[arr.length];
        int [] array =new int [arr.length];
        for (int x = 0; x < arr.length; x++){
        array[x] = arr[x];
    }
        return array;
        }
 /**
 * add up the values inside an array and return the sum
 * 
 * @param nums
 */
public int sum3(int[] nums)
{
    int sum = 0;
    for (int x = 0; x < nums.length; x++){
       sum = sum + nums[x]; 
    }
        return sum;
}
public static int[] plusTwo(int[] a, int[] b)
{ int [] both = new int [(a.length - 1) +(b.length - 1)];
    for(int x = 0; x <a.length; x++){
        for(int y = 0; y < b.length; y++){
          both[x] = a[x];
            both[x + y] = b[y];
    }
    }
 return both;
}

          
      
     
 
  public static void main(String[]args){
   int [] a = {1,2};
    int [] b = {3,4};

    System.out.println(plusTwo(a,b));
  }
}

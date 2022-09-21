
package arrayspecifiedints;

public class ArraySpecifiedInts 
{

  
    public static void main(String[] args)
    {
        
        int[] array0 = {1,77,-5,2,65,30};
        int[] array1 = {-10,50,15,2,77};
        int specNum1 = 65;
        int specNum2 = 77;
        int count = 0;
        int count2 = 0;
        boolean checkArray0 = false;
        boolean checkArray1 = false;
        
        //array0 check
        for (int i = 0; i < array0.length; i++) 
        {
            if (specNum1 == array0[i] || specNum2 == array0[i]) 
            {
                count++;
            }    
            if(count == 2)
            {
                checkArray0 = true;
            }
                                
        }
        //array1 check
        for (int i = 0; i < array1.length; i++) 
        {
            if (specNum1 == array1[i] || specNum2 == array1[i]) 
            {
                count2++;
            }    
            if(count2 == 2)
            {
                checkArray1 = true;
            }
        }    
        System.out.println("Array0 contains both specified integers(65 & 77): " + checkArray0);
        System.out.println("Array1 contains both specified integers(65 & 77): " + checkArray1);
        
               
    }
    
}

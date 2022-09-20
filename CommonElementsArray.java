
package commonelementsarray;




public class CommonElementsArray
{

   
    public static void main(String[] args) 
    {
      int[] array0 = {1,5,-5,2,12,30};
      int[] array1 = {-10,50,15,2};
      int i, j;
      
      System.out.print("Elements shared: ");
      for(i=0; i < array0.length; i++)
      {
         for(j=0; j < array1.length; j++)
         {
            if(array0[i]==array1[j])
               System.out.print(array1[i]+ " ");
         }
      }
        
    }
    
}
    


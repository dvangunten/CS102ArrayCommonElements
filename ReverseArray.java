
package reversearray;


public class ReverseArray 
{

  
    public static void main(String[] args)
    {
        
        char[] array = {'s','a','b','a'};
        
        System.out.print("Initial Array: ");
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+"");
        }
        System.out.println();
        System.out.print("Reversed Array: ");
       
        for (int i = array.length-1; i > -1; i--)
        {
            System.out.print(array[i]+"");
        }    
    }
    
}

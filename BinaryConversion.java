//Name: Rithvik Padigala
//Period: 4A

import java.util.*;
public class BinaryConversion
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int[] nums = {2, 4, 5, 8, 6, 2, 3, 5, 9, 0, 9, 6};
        
        for(int i = 4; i < 8; i++)
        {
           for(int j = 4-i; j >= 0; j--)
           {
              System.out.print(j);
           }
           System.out.println(i);
        }
    }
}

    


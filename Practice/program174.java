// input : 5
// output :  *    #    *     #     *      #     *      #     *      #

import java.util.*;

class program174
{
    public static void Dispaly(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("*\t #\t");
        }
        System.out.println();
    }

    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iVlaue = 0;

        System.out.println("Enter the number of elements : ");
        iVlaue = sobj.nextInt();

        Dispaly(iVlaue);
    }  
}
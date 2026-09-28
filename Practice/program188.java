// input : 7
// output : * * *  # # #   * * *  # #
//          1 2 3  4 5 6   7 8 9  10 11

import java.util.*;

class program1188
{
    public static void Dispaly(int iNo)
    {
        int iCnt = 0;
        char ch = '\0';
        char ch1 = '\0';

        for(iCnt = 1, ch = 'A', ch1 = 'a'; iCnt <= iNo; iCnt++, ch++, ch1++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.print(ch1+"\t");
            }
            else
            {
                System.out.print(ch+"\t");
            }
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
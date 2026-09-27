// input : 7
// output : a b c d e f g

import java.util.*;

class program1180
{
    public static void Dispaly(int iNo)
    {
        int iCnt = 0;
        char ch = '\0';

        for(iCnt = 1, ch = 'a'; iCnt <= iNo; iCnt++, ch++)
        {
            System.out.print(ch+"\t");
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
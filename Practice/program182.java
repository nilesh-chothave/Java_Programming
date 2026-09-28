// input : 7
// output : a b c d e f g

import java.util.*;

class program1182
{
    public static void Dispaly(int iNo)
    {
        int iCnt = 0;
        char ch = '\0';

        for(iCnt = 1, ch = 65; iCnt <= iNo; iCnt++, ch++)       // ascii value 65 for A
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
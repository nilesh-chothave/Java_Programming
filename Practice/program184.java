// input : 7
// output : A * B * C * D

import java.util.*;

class program1184
{
    public static void Dispaly(int iNo)
    {
        int iCnt = 0;
        char ch = '\0';

        for(iCnt = 1, ch = 'A'; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.print("*\t");
            }
            else
            {
                System.out.print(ch+"\t");
                ch++;
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
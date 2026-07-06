/*
    3.Write a program to check whether a number is a perfect number or not.
*/

class Logic
{
    void CheckPerfect(int num)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1; iCnt<= (num/2); iCnt++)
        {
            if(num % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        if(num == iSum)
        {
            System.out.println(num+" Number is perfect");
        }
        else
        {
            System.out.println(num+" Number is not perfect");
        }
    }
}

public class AS20_Q3_NumberIsPerfectOrNot 
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.CheckPerfect(28);  
    }
    
}

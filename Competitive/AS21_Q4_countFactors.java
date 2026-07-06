/*
    4. Write a program to count total number of factors of a given number.
*/

class Logic
{
    void countFactors(int num)
    {
        int iCnt = 0, iCount = 0;

        for(iCnt = 1; iCnt <= num; iCnt++)
        {
            if(num % iCnt == 0)
            {
                System.out.println(iCnt);
                iCount++;
            }
        }

        System.out.println(iCount);
    }
}

public class AS21_Q4_countFactors 
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.countFactors(20);
    }     
}

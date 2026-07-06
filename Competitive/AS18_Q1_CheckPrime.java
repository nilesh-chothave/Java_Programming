/*
    1. Write a program to check whether a number is prime or not.
*/

class Logic
{
    void CheckPrime(int num)
    {
        int iCnt = 0, iCount = 0;

        for(iCnt = 1; iCnt <= num; iCnt++)
        {
            if(num % iCnt == 0)
            {
                iCount++;
            }
        }
        System.out.println(iCount);
        if(iCount == 2)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }
}

class AS18_Q1_CheckPrime 
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.CheckPrime(11);
    }
}

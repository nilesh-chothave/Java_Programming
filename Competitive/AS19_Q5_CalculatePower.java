/*
    5. Write a program to calculate the power of a number using loops.
*/

class Logic
{
    void CalculatePower(int base, int exp)
    {
        int iCnt = 0, iRes = 1;

        for(iCnt = 1; iCnt <= exp; iCnt++)
        {
            iRes = iRes * base;
        }
        System.out.println(iRes);
    }
}

class AS19_Q5_CalculatePower 
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.CalculatePower(5, 10);
    }   
}
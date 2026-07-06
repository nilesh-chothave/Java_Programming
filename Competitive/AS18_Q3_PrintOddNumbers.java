/*
    3. Write a program to print all odd numbers up to N.
*/

class Logic
{
    void PrintOddNumber(int n)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt <= n; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                System.out.println(iCnt+"\t");
            }
        }
    }
}

class AS18_Q3_PrintOddNumbers 
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.PrintOddNumber(20);
    }   
}
